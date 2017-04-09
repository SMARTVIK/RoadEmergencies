package com.roadsideemergencies.vik.roademergencies.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.datacontroller.AppDataController;
import com.roadsideemergencies.vik.roademergencies.models.User;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;

import java.util.ArrayList;

import static com.roadsideemergencies.vik.roademergencies.R.id.login;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        initViews();
    }

    private void initViews() {
        findViewById(login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.login:
                createAccount();
                break;
        }
    }

    private void createAccount() {
        String userName = ((EditText) findViewById(R.id.et_username)).getText().toString();
        String password = ((EditText) findViewById(R.id.et_password)).getText().toString();

        if(!checkUsername(userName)){
            return;
        }

        if (password.length() == 0) {
            Utility.toast(this,"Please enter password");
            return;
        }

        if (password.length() < 8) {
            Utility.toast(this,"Password must be minimum 8 characters ");
            return;
        }
        final ProgressDialog progressDialog = ProgressDialog.show(this, "", "Creating Account");
        final User user = new User(userName,password);
        if (Utility.getDatabaseHelper().createUser(user) > 0) {
            Utility.toast(CreateAccountActivity.this, "Account created successfully");
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (progressDialog != null && progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        AppDataController.getInstance().setCurrentUser(user);
                        startActivity(new Intent(CreateAccountActivity.this, QuickConnectActivity.class));
                        setResult(RESULT_OK);
                        finish();
                    }
                }
            }, 2000);
        } else {
            Utility.toast(CreateAccountActivity.this, "Unable to create account");
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        }
    }

    /*
    *
    * checking username validation in all possible ways
    *
    * */

    private boolean checkUsername(String userName) {

        if (userName.length() == 0) {
            Utility.toast(this,"Please enter username");
            return false;
        }

        if (userName.length() < 8 || userName.length()>15) {
            Utility.toast(this,"Username must be min 8 & max 15 characters ");
            return false;
        }

        if(!isUserNameAlphanumeric(userName)){
            Utility.toast(this,"Username must be alphanumeric");
            return false;
        }

        ArrayList<User> users = Utility.getDatabaseHelper().getAllUsers();
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                Utility.toast(this, "Username already exists.");
                return false;
            }
        }
        return true;
    }

    private boolean isUserNameAlphanumeric(String userName) {
        String input = userName;
        boolean alpha = false;
        boolean numeric = false;
        boolean accepted = true;
        for (int i = 0; i < input.length(); ++i)
        {
            char c = input.charAt(i);
            if (Character.isDigit(c))
            {
                numeric = true;
            } else if (Character.isLetter(c))
            {
                alpha = true;
            } else
            {
                accepted = false;
                break;
            }
        }

        if (accepted && alpha && numeric)
        {
            return true;
        }

        return false;
    }
}
