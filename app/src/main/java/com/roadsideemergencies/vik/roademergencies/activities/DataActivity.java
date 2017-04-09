package com.roadsideemergencies.vik.roademergencies.activities;

import android.Manifest;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;

public class DataActivity extends AppCompatActivity implements LocationListener ,OnMapReadyCallback{

    private static final int LOCATION = 1001;
    private GoogleMap map;
    private LocationManager locationManager;
    private static final long MIN_TIME = 400;
    private static final float MIN_DISTANCE = 1000;
    private String latitude;
    private String langitude;
    private Dialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        progressDialog = ProgressDialog.show(this,"","Locating");

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void checkLocationPermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            int photoPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
            int coarseLocation = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
            if (photoPermission != PackageManager.PERMISSION_GRANTED    ||  coarseLocation!=PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, LOCATION);
            } else{
                locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME, MIN_DISTANCE, this); //You can also use LocationManager.GPS_PROVIDER and LocationManager.PASSIVE_PROVIDER;
                setUpMap(map);
            }
        } else{
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME, MIN_DISTANCE, this); //You can also use LocationManager.GPS_PROVIDER and LocationManager.PASSIVE_PROVIDER;
            setUpMap(map);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED && requestCode == LOCATION) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME, MIN_DISTANCE, this); //You can also use LocationManager.GPS_PROVIDER and LocationManager.PASSIVE_PROVIDER;
            setUpMap(map);
        }
    }

    @Override
    public void onLocationChanged(Location location) {
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 10);
        map.animateCamera(cameraUpdate);
        locationManager.removeUpdates(this);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }


    private void setUpMap(GoogleMap googleMap) {
        // Enable MyLocation Layer of Google Map
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        googleMap.setMyLocationEnabled(true);
        // Get LocationManager object from System Service LOCATION_SERVICE
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        // Create a criteria object to retrieve provider
        Criteria criteria = new Criteria();
        // Get the name of the best provider
        String provider = locationManager.getBestProvider(criteria, true);
        // Get Current Location
        Location myLocation = locationManager.getLastKnownLocation(provider);
        //set map type
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        // Get latitude of the current location
        double latitude = this.latitude == null ?myLocation.getLatitude():Double.parseDouble(this.latitude);
        // Get longitude of the current location
        double longitude = this.langitude == null ?myLocation.getLongitude():Double.parseDouble(this.langitude);
        // Create a LatLng object for the current location
        LatLng latLng = new LatLng(latitude, longitude);
        // Show the current location in Google Map
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        // Zoom in the Google Map
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,12));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)).title("You are here!"));


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        if(map!=null){
            if(progressDialog!=null && progressDialog.isShowing()){
                progressDialog.dismiss();
            }

            latitude = getIntent().getStringExtra("lat");
            langitude = getIntent().getStringExtra("lang");

            LatLng latLng = new LatLng(Double.parseDouble(latitude), Double.parseDouble(langitude));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,12));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(Double.parseDouble(latitude), Double.parseDouble(langitude))).title("You are here!"));
        }else{
            Utility.toast(DataActivity.this,"Unable to fetch location");
        }
    }
}
