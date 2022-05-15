package com.example.easylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.easyutil.EasyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EasyToast.show(this,"EasyLibrary");
    }
}