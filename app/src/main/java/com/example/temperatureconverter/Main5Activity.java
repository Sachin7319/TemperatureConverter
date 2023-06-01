package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Main5Activity extends AppCompatActivity {
    private EditText Text;
    private TextView tw1,tw2,tw3;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main5);
        String c,a,b;
        double CF ;
        tw1 = findViewById(R.id.textView1);
        tw2 = findViewById(R.id.textView2);
        tw3 = findViewById(R.id.textView3);
        Text = findViewById(R.id.editText);
        button = findViewById(R.id.chip7);
        c = getIntent().getStringExtra("choice");
        switch (c){
            case "1":
                tw1.setText("celsius");
                tw2.setText("fahrenheit");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            CtoF();
                        }
                    });
                break;
            case "2":
                tw1.setText("fahrenheit");
                tw2.setText("celsius");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FtoC();
                    }
                });
                break;
            case "3":
                tw1.setText("celsius");
                tw2.setText("Kelvin");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CtoK();
                    }
                });
                break;
            case "4":
                tw1.setText("Kelvin");
                tw2.setText("celsius");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        KtoC();
                    }
                });
                break;
            case "5":
                tw1.setText("Kelvin");
                tw2.setText("fahrenheit");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        KtoF();
                    }
                });
                break;
            case "6":
                tw1.setText("fahrenheit");
                tw2.setText("Kelvin");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FtoK();
                    }
                });
                break;
        }
    }
    private void CtoF(){
        String input = Text.getText().toString();

        if (input.isEmpty()) {
            tw3.setText("Please enter a temperature.");
            return;
        }
        double temperature = Double.parseDouble(input);
        double f = (temperature * 9 / 5) + 32;
        String result = String.valueOf(f);
        tw3.setText(result);
    }
    private void FtoC(){
        String input = Text.getText().toString();

        if (input.isEmpty()) {
            tw3.setText("Please enter a temperature.");
            return;
        }
        double temperature = Double.parseDouble(input);
        double c = (temperature - 32) * 5 / 9;
        String result = String.valueOf(c);
        tw3.setText(result);
    }
    private void CtoK(){
        String input = Text.getText().toString();

        if (input.isEmpty()) {
            tw3.setText("Please enter a temperature.");
            return;
        }
        double temperature = Double.parseDouble(input);
        double k = temperature + 273.15 ;
        String result = String.valueOf(k);
        tw3.setText(result);
    }
    private void KtoC(){
        String input = Text.getText().toString();

        if (input.isEmpty()) {
            tw3.setText("Please enter a temperature.");
            return;
        }
        double temperature = Double.parseDouble(input);
        double c = temperature - 273.15 ;
        String result = String.valueOf(c);
        tw3.setText(result);
    }
    private void KtoF(){
        String input = Text.getText().toString();

        if (input.isEmpty()) {
            tw3.setText("Please enter a temperature.");
            return;
        }
        double temperature = Double.parseDouble(input);
        double f = (temperature - 273.15) * 9 / 5 + 32;
        String result = String.valueOf(f);
        tw3.setText(result);
    }
    private void FtoK(){
        String input = Text.getText().toString();

        if (input.isEmpty()) {
            tw3.setText("Please enter a temperature.");
            return;
        }
        double temperature = Double.parseDouble(input);
        double k = (temperature - 32) * 5 / 9 + 273.15;
        String result = String.valueOf(k);
        tw3.setText(result);
    }
}