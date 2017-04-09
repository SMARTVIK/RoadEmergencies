package com.roadsideemergencies.vik.roademergencies.activities;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.adapter.Adapter;
import com.roadsideemergencies.vik.roademergencies.models.GPSTracker;
import com.roadsideemergencies.vik.roademergencies.models.MapsModel;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class ListOfNearByPlaces extends AppCompatActivity {

    String text;
    private ArrayList<MapsModel.ResultsBean> list = new ArrayList<>();
    private Dialog progressDialog;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        text = getIntent().getStringExtra("text");
        initViews();
        getPlacesNearYou();
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new Adapter(list,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getPlacesNearYou() {

        progressDialog = ProgressDialog.show(this, "", "Searching");

        if(Utility.getGpsTracker()!=null && Utility.getGpsTracker().getLatitude()>0 && Utility.getGpsTracker().getLongitude()>0 ){

            GPSTracker gps = Utility.getGpsTracker();
            double latitude = gps.getLatitude();
            double longitude= gps.getLongitude();

            Utility.getPlacesNearYou(text, text, "1000", String.valueOf(latitude), String.valueOf(longitude), new JsonHttpResponseHandler() {

                @Override
                public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                    super.onSuccess(statusCode, headers, response);
                    Log.d("jsonArray", response.toString());
                }


                @Override
                public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                    super.onFailure(statusCode, headers, responseString, throwable);
                    Log.d("jsonArray", responseString.toString());

                    closeDiaLog();

                }


                @Override
                public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                    super.onFailure(statusCode, headers, throwable, errorResponse);

                    Log.d("jsonArray", errorResponse.toString());

                    closeDiaLog();
                }


                @Override
                public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                    super.onFailure(statusCode, headers, throwable, errorResponse);

                    Log.d("jsonArray", errorResponse.toString());
                    closeDiaLog();
                }


                @Override
                public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                    super.onSuccess(statusCode, headers, response);

                    closeDiaLog();

                    Log.d("jsonArray "+text, response.toString());

                    MapsModel mapsModel = MapsModel.objectFromData(response.toString());

                    list = mapsModel.getResults();

                    adapter.setItems(list);

                }

                @Override
                public void onSuccess(int statusCode, Header[] headers, String responseString) {
                    super.onSuccess(statusCode, headers, responseString);
                    Log.d("jsonArray", responseString.toString());
                }
            });

        } else {
            progressDialog.dismiss();
            findViewById(R.id.no_results_found).setVisibility(View.VISIBLE);
        }
    }

    private void closeDiaLog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

}
