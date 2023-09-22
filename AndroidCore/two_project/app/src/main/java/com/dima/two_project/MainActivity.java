package com.dima.two_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText namePlayerSpace;
    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namePlayerSpace = findViewById(R.id.namePlayerSpace);
        confirmButton = findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, secondLayout.class);
        intent.putExtra("hi", namePlayerSpace.getText().toString());
        startActivity(intent);
    }
}