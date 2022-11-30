package com.example.jurbijur;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
        ley214_6 = findViewById(R.id.ley214_6);


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

        ley214_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,HomeWork214_6.class);
                startActivity(myintent);


            }
        });




        }

    ///=============================
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();


    }
    ///===================================
}

