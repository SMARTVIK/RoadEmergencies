package com.roadsideemergencies.vik.roademergencies.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.roadsideemergencies.vik.roademergencies.adapter.Adapter;
import com.roadsideemergencies.vik.roademergencies.models.GPSTracker;
import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;
import com.roadsideemergencies.vik.roademergencies.models.MapsModel;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

/**
 * Created by vik on 8/4/17.
 */

public class TabFragment2 extends Fragment {


    private View mRootView;
    private Adapter earningsAdapter;
    private ArrayList<MapsModel.ResultsBean> list = new ArrayList<>();
    private ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.list,container,false);
        initViews(mRootView);
        getPlacesNearYou();
        return mRootView;
    }

    private void initViews(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        earningsAdapter = new Adapter(list,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(earningsAdapter);
    }


    private void getPlacesNearYou() {

        progressDialog = ProgressDialog.show(getContext(), "", "Searching");


        if(Utility.getGpsTracker()!=null && Utility.getGpsTracker().getLatitude()>0 && Utility.getGpsTracker().getLongitude()>0 ) {

            GPSTracker gps = Utility.getGpsTracker();
            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();

            Utility.getPlacesNearYou("petrolpumps", "petrolpumps", "1000", String.valueOf(latitude == 0 ? "28.499264" : latitude), String.valueOf(longitude == 0 ? "77.176466" : longitude), new JsonHttpResponseHandler() {

                @Override
                public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                    super.onSuccess(statusCode, headers, response);
                    Log.d("jsonArray", response.toString());
                    closeDiaLog();
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

                    Log.d("jsonArray", response.toString());


                    MapsModel mapsModel = MapsModel.objectFromData(response.toString());


                    list = mapsModel.getResults();

                    earningsAdapter.setItems(list);

                }

                @Override
                public void onSuccess(int statusCode, Header[] headers, String responseString) {
                    super.onSuccess(statusCode, headers, responseString);

                    Log.d("jsonArray", responseString.toString());

                    closeDiaLog();
                }
            });
        }else{
            progressDialog.dismiss();
        }
    }

    private void closeDiaLog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
