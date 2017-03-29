package com.example.mandeep.androidworkshop2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Destination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        TextView tw = (TextView) findViewById(R.id.output);
        Intent intent = getIntent();

        Log.d("tag2",intent.getExtras().get("text_in_et").toString());

        tw.setText(intent.getExtras().get("text_in_et").toString());
    }
}
