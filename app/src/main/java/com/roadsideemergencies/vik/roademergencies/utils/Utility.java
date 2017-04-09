package com.roadsideemergencies.vik.roademergencies.utils;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;
import com.roadsideemergencies.vik.roademergencies.datacontroller.AppDataController;
import com.roadsideemergencies.vik.roademergencies.database.DatabaseHelper;
import com.roadsideemergencies.vik.roademergencies.models.GPSTracker;
import com.roadsideemergencies.vik.roademergencies.activities.MapsActivity;
import com.roadsideemergencies.vik.roademergencies.models.PlaceDetailsModel;

import org.json.JSONArray;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Created by vik on 7/4/17.
 */

public class Utility {
    static AsyncHttpClient client = new AsyncHttpClient();
    private static GPSTracker gpsTracker;
    private static Dialog progressDialog;

//    private static  String BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lat+","+lang+"&radius="+radius+"&types="+type+"&name="+name+"&key="+key;

    public static void post(String url , RequestParams params, TextHttpResponseHandler jsonHttpResponseHandler) {
        String finalUrl = url;
        Log.v("Post url...", "" + finalUrl);
        Log.v("Post Parameters", "" + params);
        client.post(finalUrl, params, jsonHttpResponseHandler);
    }

    public static void get(String apiNameUrl, RequestParams params, JsonHttpResponseHandler jsonHttpResponseHandler) {
    /*    String finalUrl = BASE_URL + apiNameUrl;
        Log.e("Post url...", "" + finalUrl);
        client.get(finalUrl, params, jsonHttpResponseHandler);*/
    }


    public static void getPlacesNearYou(String name, String type, String radius, String latitude, String logitude, JsonHttpResponseHandler jsonHttpResponseHandler) {
        String BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=" + latitude + "," + logitude + "&radius=" + radius + "&types=" + type + "&name=" + name + "&key=AIzaSyCBtIdeK6xvVlhKkQ05qk4QK54K5LMxzBw";
        RequestParams paramslist = new RequestParams();
        client.get(BASE_URL, paramslist, jsonHttpResponseHandler);
    }

    public static void setGpsTracker(GPSTracker gpsTracker) {
        Utility.gpsTracker = gpsTracker;
    }

    public static GPSTracker getGpsTracker() {
        return gpsTracker;
    }


    private void webRequest(String url, String lat, String lng, String radius, String place) {

        client.get("https://www.google.com", new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                // called before request is started
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                // called when response HTTP status is "200 OK"
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
            }
        });
    }


    private static DatabaseHelper databaseHelper;

    public static void setDatabaseHelper(DatabaseHelper databaseHelper) {
        Utility.databaseHelper = databaseHelper;
    }

    public static DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }

    public static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void getPlaceDetails(String place_id, final Context context) {

        String url = "https://maps.googleapis.com/maps/api/place/details/json?placeid="+place_id+"&key=AIzaSyCBtIdeK6xvVlhKkQ05qk4QK54K5LMxzBw";

        showDialog(context);

        client.get(url,new RequestParams(),new JsonHttpResponseHandler(){

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                super.onSuccess(statusCode, headers, response);
                Log.d("jsonArray", response.toString());
                closeDialog();
            }


            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
                Log.d("jsonArray", responseString.toString());
                closeDialog();
            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                closeDialog();
                Log.d("jsonArray", errorResponse.toString());

            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                Log.d("jsonArray", errorResponse.toString());
                closeDialog();
            }


            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Log.d("jsonArray", response.toString());
                PlaceDetailsModel placeDetailsModel = PlaceDetailsModel.objectFromData(response.toString());
                PlaceDetailsModel.ResultBean resultBean = placeDetailsModel.getResult();
                if(resultBean!=null){
                    AppDataController.getInstance().setPlaceData(resultBean);
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        closeDialog();
                        context.startActivity(new Intent(context,MapsActivity.class));
                    }
                },400);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                super.onSuccess(statusCode, headers, responseString);
                Log.d("jsonArray", responseString.toString());
                closeDialog();
            }
        });
    }

    private static void showDialog(Context context) {
        progressDialog = ProgressDialog.show(context,"","Loading Place Details");
    }

    private static void closeDialog() {
        if(progressDialog!=null && progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }
}
