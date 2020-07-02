package com.example.parikshit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OpenMAPActivity extends AppCompatActivity {

    EditText lat, logg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_m_a_p);
        lat = findViewById(R.id.lat);
        logg = findViewById(R.id.logg);

    }

    public void locat(View view) {
        String abc = "geo:"+lat.getText() +","+ logg.getText();
        Uri gmmIntentUri = Uri.parse(abc);
        Log.i("ho rahi hai ","opening app/" + gmmIntentUri);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);

    }
}