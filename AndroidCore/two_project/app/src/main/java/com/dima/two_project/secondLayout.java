package com.dima.two_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondLayout extends AppCompatActivity {

    private TextView textHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layout);

        textHi = findViewById(R.id.textHi);
        Bundle arguments = getIntent().getExtras();
        textHi.setText("Hello " + arguments.get("hi").toString());
    }
}