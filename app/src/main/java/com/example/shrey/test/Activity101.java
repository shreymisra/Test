package com.example.shrey.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;

public class Activity101 extends AppCompatActivity {
String tag="Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_101);
        Log.d(tag,"in the oncreate() event");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag,"in the onStart() event");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(tag,"in the onRestart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"in the onResume() event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"in the onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"in the onStop() event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"in the onDestroy() event");
    }
}
