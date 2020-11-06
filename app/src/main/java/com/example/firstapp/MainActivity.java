package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        button.setTextColor(Color.BLACK);
        button.setBackgroundColor(Color.GREEN);
        button.setText(R.string.my_name);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              textView.setTextColor(Color.BLACK);
              textView.setBackgroundColor(Color.GREEN);
              textView.setText(R.string.clicked);
          }
      });
    }





/*
    public void clickMybutton(View view){

        textView.setTextColor(Color.BLACK);
        textView.setBackgroundColor(Color.GREEN);
        textView.setText(R.string.clicked);
    }*/


}