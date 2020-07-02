package com.example.parikshit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstbutton(View view) {
        Intent intent = new Intent(this, SendInfoActivity.class);
        startActivity(intent);
    }

    public void button_3(View view) {
        Intent intent = new Intent(this, OpenMAPActivity.class);
        startActivity(intent);
    }

    public void button_2(View view) {
        Intent intent = new Intent(this, ProductInfoActivity.class);
        startActivity(intent);
    }
}