package com.dima.threeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text_logo;
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_logo = findViewById(R.id.text_logo);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
    }

    public void clickBtn(View v) {
        float heightBtn=v.getHeight();
        text_logo.setText(String.valueOf(heightBtn));
    }
}