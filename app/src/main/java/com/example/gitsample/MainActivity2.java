package com.example.gitsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.gitsample.models.Plant;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("Check","GitSampleBranch");

        Plant plant=new Plant("tomato","red");

        Log.i("plant","plant.toString");

        Log.i("plant","plant.toStringTwo");

    }
}