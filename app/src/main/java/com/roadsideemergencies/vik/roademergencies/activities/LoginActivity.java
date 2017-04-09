package com.roadsideemergencies.vik.roademergencies.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.roadsideemergencies.vik.roademergencies.database.DatabaseHelper;
import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.datacontroller.AppDataController;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;
import com.roadsideemergencies.vik.roademergencies.models.User;

import static com.roadsideemergencies.vik.roademergencies.R.id.login;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int CREATE_ACCOUNT = 10001;
    DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper = new DatabaseHelper(this);
        Utility.setDatabaseHelper(databaseHelper);
        initViews();
    }



    private void initViews() {
        findViewById(login).setOnClickListener(this);
        findViewById(R.id.create_account).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.login:
                login();
                break;


            case R.id.create_account:
                createAccount();
                break;
        }
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CREATE_ACCOUNT && resultCode == RESULT_OK) {
            finish();
        }

    }

    /*
    *
    * calling create account screen
    *
    */
    private void createAccount() {
        startActivityForResult(new Intent(this, CreateAccountActivity.class), CREATE_ACCOUNT);
    }



    /*
    * checking credentials and verifying them
    * fetching user from database useing filled credentials and moving to data screen
    *
    */

    private void login() {
        String userName = ((EditText) findViewById(R.id.et_username)).getText().toString();
        String password = ((EditText) findViewById(R.id.et_password)).getText().toString();

        if (userName.length() == 0) {
            Utility.toast(this, "Please enter username");
            return;
        }

        if (password.length() == 0) {
            Utility.toast(this, "Please enter password");
            return;
        }

        final User user = databaseHelper.getUser(userName, password);

        if (user == null) {
            Utility.toast(this, "Invalid username or password");
            return;
        }

        final ProgressDialog progressDialog = ProgressDialog.show(this, "", "LoggingIn");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progressDialog != null && progressDialog.isShowing()) {
                    AppDataController.getInstance().setCurrentUser(user);
                    startActivity(new Intent(LoginActivity.this, DataActivityWithTabs.class));
                    finish();
                }
            }
        }, 2000);


    }
}
