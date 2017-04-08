package com.roadsideemergencies.vik.roademergencies;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
      /*  LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        String latitude = getIntent().getStringExtra("lat");
        String langitude = getIntent().getStringExtra("lang");

        LatLng latLng = new LatLng(Double.parseDouble(latitude), Double.parseDouble(langitude));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,12));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(Double.parseDouble(latitude), Double.parseDouble(langitude))).title("You are here!"));

        boolean openNow = getIntent().getBooleanExtra("open_now",false);
        String rating = getIntent().getStringExtra("rating");
        String name = getIntent().getStringExtra("name");

        if (rating == null || rating.length() == 0 || (rating != null && rating.equals("0.0"))) {
            ((TextView) findViewById(R.id.rating)).setVisibility(View.GONE);
        }
        if (name == null || name.length() == 0) {
            ((TextView) findViewById(R.id.name)).setVisibility(View.GONE);
        }

        ((TextView)findViewById(R.id.name)).setText(name);
        ((TextView)findViewById(R.id.rating)).setText(rating);
        ((TextView)findViewById(R.id.open)).setText("Status :"+(openNow?" Open Now":" Closed"));
    }
}
