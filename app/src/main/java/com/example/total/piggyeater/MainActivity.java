package com.example.total.piggyeater;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int code = api.isGooglePlayServicesAvailable(this);
        if (code == ConnectionResult.SUCCESS) {
            // Do Your Stuff Here
        } else {
            AlertDialog alertDialog =
                    new AlertDialog.Builder(this, R.style.MyAlertDialogStyle).setMessage(
                            "You need to download Google Play Services in order to use this part of the application")
                            .create();
            alertDialog.show();
        }






















































































        //jastine works here
    }
}
