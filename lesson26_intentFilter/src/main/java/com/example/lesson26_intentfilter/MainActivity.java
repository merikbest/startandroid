package com.example.lesson26_intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = findViewById(R.id.btnTime);
        btnDate = findViewById(R.id.btnDate);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.btnTime:
//                intent = new Intent(this, TimeActivity.class);
                intent = new Intent("com.example.intent.action.time");
                startActivity(intent);
                break;
            case R.id.btnDate:
//                intent = new Intent(this, DateActivity.class);
                intent = new Intent("com.example.intent.action.date");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
