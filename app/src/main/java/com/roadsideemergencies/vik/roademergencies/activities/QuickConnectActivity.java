package com.roadsideemergencies.vik.roademergencies.activities;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.fragments.TabFragment;
import com.roadsideemergencies.vik.roademergencies.models.GPSTracker;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;

public class QuickConnectActivity extends AppCompatActivity implements View.OnClickListener,GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener{
    private Location mLastLocation;
    private GoogleApiClient mGoogleApiClient;
    private ProgressDialog progressDialog;

    @Override
    protected void onStart() {
        if (mGoogleApiClient != null) {
            mGoogleApiClient.connect();
        }
        super.onStart();
    }

    @Override
    protected void onStop() {
        if (mGoogleApiClient != null) {
            mGoogleApiClient.disconnect();
        }
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_connect);
        progressDialog = ProgressDialog.show(this,"","Accessing Current Location");
        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }
        GPSTracker gpsTracker = new GPSTracker();
        Utility.setGpsTracker(gpsTracker);
        initViews();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED && requestCode == 1001) {
            setLocation();
        }
    }


    @Override
    public void onConnected(@Nullable Bundle bundle) {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);
            return;
        }
        setLocation();
    }


    private void setLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        if (mLastLocation != null) {
            closeDialog();
            GPSTracker gpsTracker = Utility.getGpsTracker();
            gpsTracker.setLatitude(mLastLocation.getLatitude());
            gpsTracker.setLongitude(mLastLocation.getLongitude());
        }else{
            closeDialog();
        }
    }

    private void closeDialog() {
        if(progressDialog!=null && progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }


    private void initViews() {
        findViewById(R.id.mechanic).setOnClickListener(this);
        findViewById(R.id.medicare).setOnClickListener(this);
        findViewById(R.id.service_station).setOnClickListener(this);
        findViewById(R.id.chillout).setOnClickListener(this);
        findViewById(R.id.quick_connect).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TabFragment tabFragment;
        switch (v.getId()){
            case R.id.mechanic:
                loadFragment("Mechanic");
                break;
            case R.id.medicare:
                loadFragment("Hospitals");
                break;
            case R.id.service_station:
                loadFragment("gas_station");
                break;
            case R.id.chillout:
                loadFragment("Restaurants");
                break;
            case R.id.quick_connect:
                startActivity(new Intent(this,ListOfContactsActivity.class));
                break;

        }
    }

    private void loadFragment(String text) {
        Intent intent = new Intent(this, ListOfNearByPlaces.class);
        intent.putExtra("text", text);
        startActivity(intent);
    }
}
