package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button B1,B2,B3,B4,B5,B6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.chip1);
        B2 = findViewById(R.id.chip2);
        B3 = findViewById(R.id.chip3);
        B4 = findViewById(R.id.chip4);
        B5 = findViewById(R.id.chip5);
        B6 = findViewById(R.id.chip6);
        Intent intent = new Intent(this,Main5Activity.class);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = "1";
                intent.putExtra("choice",c);
                startActivity(intent);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = "2";
                intent.putExtra("choice",c);
                startActivity(intent);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = "3";
                intent.putExtra("choice",c);
                startActivity(intent);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = "4";
                intent.putExtra("choice",c);
                startActivity(intent);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = "5";
                intent.putExtra("choice",c);
                startActivity(intent);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = "6";
                intent.putExtra("choice",c);
                startActivity(intent);
            }
        });

    }
}