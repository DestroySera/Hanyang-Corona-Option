package com.example.corona.ui.option;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.widget.TextView;

import com.example.corona.R;

public class Option1 extends AppCompatActivity {

    private TextView Option1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);

        Option1 = findViewById(R.id.Option1);

        Intent intent = getIntent();
        String str = intent.getStringExtra("Test");


        Option1.setText(str);
    }
}