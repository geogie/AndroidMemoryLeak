package com.example.george.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneSplay(View view) {
        startActivity(new Intent(this,ActivityOne.class));
    }

    public void twoSplay(View view) {
        startActivity(new Intent(this,ActivityTwo.class));
    }
}
