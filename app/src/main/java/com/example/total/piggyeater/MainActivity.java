package com.example.total.piggyeater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int code = api.isGooglePlayServicesAvailable(activity);
        if (code == ConnectionResult.SUCCESS) {
            // Do Your Stuff Here
        } else {
            AlertDialog alertDialog =
                    new AlertDialog.Builder(activity, R.style.AppCompatAlertDialogStyle).setMessage(
                            "You need to download Google Play Services in order to use this part of the application")
                            .create();
            alertDialog.show();
        }






















































































        //jastine works here
    }
}
