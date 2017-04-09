package com.roadsideemergencies.vik.roademergencies.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.datacontroller.AppDataController;
import com.roadsideemergencies.vik.roademergencies.models.Contact;
import com.roadsideemergencies.vik.roademergencies.models.PlaceDetailsModel;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;

import static com.roadsideemergencies.vik.roademergencies.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(map);
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

        mMap.getUiSettings().setMapToolbarEnabled(true);
        // Add a marker in Sydney and move the camera
      /*  LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        PlaceDetailsModel.ResultBean resultBean = AppDataController.getInstance().getPlaceData();

        String latitude = String.valueOf(resultBean.getGeometry().getLocation().getLat());
        String langitude = String.valueOf(resultBean.getGeometry().getLocation().getLng());

        LatLng latLng = new LatLng(Double.parseDouble(latitude), Double.parseDouble(langitude));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,12));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(Double.parseDouble(latitude), Double.parseDouble(langitude))).title("You are here!"));

        String rating = String.valueOf(resultBean.getRating());
        final String name = resultBean.getName();
        String address = resultBean.getFormatted_address();


        final String formatedNumber = resultBean.getFormatted_phone_number();
        final String internationalNumber = resultBean.getInternational_phone_number();

        if(formatedNumber!=null && formatedNumber.length()>0){
            ((TextView) findViewById(R.id.contact)).setText(formatedNumber);
            findViewById(R.id.contact).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+formatedNumber));
                    startActivity(intent);
                }
            });

            findViewById(R.id.contact).setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    showAlertDialog(name, formatedNumber);
                    return true;
                }
            });
        }else if(internationalNumber!=null && internationalNumber.length()>0){
            ((TextView) findViewById(R.id.contact)).setText(internationalNumber);
            findViewById(R.id.contact).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+internationalNumber));
                    startActivity(intent);
                }
            });

            findViewById(R.id.contact).setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    showAlertDialog(name, internationalNumber);
                    return true;
                }
            });
        }else{
            ((TextView) findViewById(R.id.contact)).setText("Contact number not available");
        }

        if (address != null && address.length() > 0) {
            ((TextView) findViewById(R.id.address)).setText(address);
        }else{
            ((TextView) findViewById(R.id.address)).setVisibility(View.GONE);
        }

        if (rating == null || rating.length() == 0 || (rating != null && rating.equals("0.0"))) {
            ((TextView) findViewById(R.id.rating)).setVisibility(View.GONE);
        }
        if (name == null || name.length() == 0) {
            ((TextView) findViewById(R.id.name)).setVisibility(View.GONE);
        }
        ((TextView)findViewById(R.id.name)).setText(name);

        final String website = resultBean.getWebsite();
        if(website!=null && website.length()>0){
            ((TextView)findViewById(R.id.website)).setText(website);
            ((TextView)findViewById(R.id.website)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(website));
                    startActivity(intent);
                }
            });
        }

        ((TextView)findViewById(R.id.rating)).setText("rating : "+rating);
        ((TextView)findViewById(R.id.location)).setText("location :"+latitude+" , "+langitude);
    }

    private void showAlertDialog(final String name, final String internationalNumber) {
        new AlertDialog.Builder(this)
                .setTitle("Add to quick connect list")
                .setMessage("Are you sure you want to add this entry?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        final ProgressDialog progressDialog = ProgressDialog.show(MapsActivity.this,"","Adding to quick connect");
                        Contact contact = new Contact(name,internationalNumber,AppDataController.getInstance().getCurrentUser().getId());
                         if(Utility.getDatabaseHelper().createQuickConnectContact(contact)>0){
                             new Handler().postDelayed(new Runnable() {
                                 @Override
                                 public void run() {
                                     progressDialog.dismiss();
                                     Utility.toast(MapsActivity.this,"Contact added Successfully");
                                 }
                             },2000);
                         }else{
                             progressDialog.dismiss();
                             Utility.toast(MapsActivity.this,"Unable to add contact");
                         }
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
