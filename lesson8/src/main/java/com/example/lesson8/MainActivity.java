package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_1;
    TextView text_1;
    CheckBox check_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_1.setText("My button");
        btn_1.setEnabled(false);

        text_1 = findViewById(R.id.text_1);
        text_1.setText("Hello world");

        check_1 = findViewById(R.id.check_1);
        check_1.setChecked(true);



    }
}
