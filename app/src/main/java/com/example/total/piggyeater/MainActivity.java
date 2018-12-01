package com.example.total.piggyeater;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//TESTING BRANCH
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int code = api.isGooglePlayServicesAvailable(this);
        if (code == ConnectionResult.SUCCESS) {
            //Authorization for the Google Drive Android API
            GoogleSignInClient mGoogleSignInClient = buildGoogleSignInClient();

            //Intent x = GoogleSignInClient.getGoogleSignInAccountFromIntent();

        } else {
            AlertDialog alertDialog =
                    new AlertDialog.Builder(this, R.style.MyAlertDialogStyle).setMessage(
                            "You need to download Google Play Services in order to use this part of the application")
                            .create();
            alertDialog.show();
        }
        */

        //jastine works here
        Button buttonYes = findViewById(R.id.button_yes);
        Button buttonNo = findViewById(R.id.button_no);

        buttonYes.setOnClickListener(this);
        buttonNo.setOnClickListener(this);
    }
    /*
    //used to sign into your google drive
    private GoogleSignInClient buildGoogleSignInClient() {
        GoogleSignInOptions signInOptions =
                new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                        .requestScopes(Drive.SCOPE_FILE)
                        .build();
        return GoogleSignIn.getClient(this, signInOptions);

    }
    */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_yes:
                Toast.makeText(this, "Good boy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_no:
                Toast.makeText(this, "THE PIG IS STARVING", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
