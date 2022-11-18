package com.example.jurbijur;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout ley214_1,ley214_2,ley214_3,ley214_4,ley214_5,ley214_6;

    EditText editTextNumber,editTextNumber2,editTextNumber3;
    Button button;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ley214_1 = findViewById(R.id.ley214_1);
        ley214_2 = findViewById(R.id.ley214_2);
        ley214_3 = findViewById(R.id.ley214_3);
        ley214_4 = findViewById(R.id.ley214_4);
        ley214_5 = findViewById(R.id.ley214_5);


        ley214_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,HomeWork214_1.class);
                startActivity(myintent);

            }
        });

        ley214_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,HomeWork214_2.class);
                startActivity(myintent);


            }
        });




        ley214_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,HomeWork214_3.class);
                startActivity(myintent);


            }
        });


        ley214_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,HomeWork214_4.class);
                startActivity(myintent);


            }
        });

        ley214_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,HomeWork214_5.class);
                startActivity(myintent);


            }
        });









    }
}