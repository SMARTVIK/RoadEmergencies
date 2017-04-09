package com.roadsideemergencies.vik.roademergencies.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.adapter.Adapter;
import com.roadsideemergencies.vik.roademergencies.adapter.QuickConnectAdapter;

public class ListOfContactsActivity extends AppCompatActivity {

    QuickConnectAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_contacts);
    }


    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new QuickConnectAdapter(list,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
