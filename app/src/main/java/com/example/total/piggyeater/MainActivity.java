package com.example.total.piggyeater;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {

//TESTING BRANCH
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int code = api.isGooglePlayServicesAvailable(this);
        if (code == ConnectionResult.SUCCESS) {
            Context context = getApplicationContext();
            CharSequence text = "Connected!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
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
