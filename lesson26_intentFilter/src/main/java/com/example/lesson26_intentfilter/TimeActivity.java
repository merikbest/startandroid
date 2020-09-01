package com.example.lesson26_intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        String time = dateFormat.format(new Date(System.currentTimeMillis()));

        TextView textTime = findViewById(R.id.textTime);
        textTime.setText(time);
    }
}