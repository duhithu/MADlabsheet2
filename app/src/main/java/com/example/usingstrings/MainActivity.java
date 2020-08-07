package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg= findViewById(R.id.tvMsg2);
        txtMsg.setText(R.string.Msg2);

        Log.i("LifeCycle","onCreate() involked");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle","onCreate() involked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("LifeCycle","onCreate() involked");
    }
    protected void onPause() {

        super.onPause();
    }
    protected void onStop() {

        super.onStop();

        Log.i("LifeCycle","onCreate() involked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle","onCreate() involked");
    }
}