package com.roadsideemergencies.vik.roademergencies.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.adapter.QuickConnectAdapter;
import com.roadsideemergencies.vik.roademergencies.models.Contact;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;

import java.util.ArrayList;

import static android.view.View.GONE;

public class ListOfContactsActivity extends AppCompatActivity implements OpenBottomSheetListener, View.OnClickListener {

    private QuickConnectAdapter adapter;
    private ArrayList<Contact> contacts = new ArrayList<>();
    private View transparentView;
    private View bottomSheet;
    private int currentContactPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_contacts);
        initBottomSheet();
        contacts = Utility.getDatabaseHelper().getAllContacts();
        if(contacts.size()==0){
            findViewById(R.id.no_results_found).setVisibility(View.VISIBLE);
        }
        initViews();
    }

    private void initBottomSheet() {
        bottomSheet = findViewById(R.id.new_design_bottom_sheet);
        transparentView = findViewById(R.id.transparent_view);
        transparentView.setOnClickListener(this);
        findViewById(R.id.call).setOnClickListener(this);
        findViewById(R.id.msg).setOnClickListener(this);
        findViewById(R.id.delete).setOnClickListener(this);
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new QuickConnectAdapter(contacts, this,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void openBottomSheet(int position) {
        currentContactPosition = position;
        animateShareThisLookView(false);
    }

    public void animateShareThisLookView(boolean down) {
        if (down) {
            transparentView.animate().alpha(0f).setDuration(400).start();
            transparentView.postDelayed(new Runnable() {
                @Override
                public void run() {
                    transparentView.setVisibility(GONE);
                }
            }, 400);
            bottomSheet.animate().translationY(Utility.getDisplayHeight(this)).setDuration(400).start();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    bottomSheet.setVisibility(GONE);
                }
            }, 400);
        } else {
            transparentView.setVisibility(View.VISIBLE);
            transparentView.setAlpha(0);
            transparentView.animate().alpha(1.0f).setDuration(400).start();
            bottomSheet.setVisibility(View.VISIBLE);
            bottomSheet.animate().translationY(0).setDuration(400).start();
            bottomSheet.bringToFront();
        }
    }

    @Override
    public void onBackPressed() {
        if(transparentView.getVisibility() == View.VISIBLE){
            animateShareThisLookView(true);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.transparent_view:
                animateShareThisLookView(true);
                break;

            case R.id.call:
                animateShareThisLookView(true);
                callContact();
                break;

            case R.id.msg:
                animateShareThisLookView(true);
                sendMessage();
                break;

            case R.id.delete:
                animateShareThisLookView(true);
                deleteContact();
                break;
        }
    }

    private void deleteContact() {
        new AlertDialog.Builder(this)
                .setTitle("Delete Contact")
                .setMessage("Are you sure you want to delete this contact?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        final ProgressDialog progressDialog = ProgressDialog.show(ListOfContactsActivity.this, "", "Deleting contact");
                        if (Utility.getDatabaseHelper().deleteContact(contacts.get(currentContactPosition).getId()) ==1) {
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    progressDialog.dismiss();
                                    Utility.toast(ListOfContactsActivity.this, "Contact deleted Successfully");
                                    contacts = Utility.getDatabaseHelper().getAllContacts();
                                    if(contacts.size()==0){
                                        findViewById(R.id.no_results_found).setVisibility(View.VISIBLE);
                                    }
                                    adapter.setDataItems(contacts);
                                }
                            }, 2000);
                        } else {
                            progressDialog.dismiss();
                            Utility.toast(ListOfContactsActivity.this, "Unable to delete contact");
                        }
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    private void sendMessage() {
        Contact contact = contacts.get(currentContactPosition);
        Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( "sms:" + contact.getPhoneNumber()));
        intent.putExtra( "sms_body", "" );
        startActivity( intent );
    }

    private void callContact() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+contacts.get(currentContactPosition).getPhoneNumber()));
        startActivity(intent);
    }
}
