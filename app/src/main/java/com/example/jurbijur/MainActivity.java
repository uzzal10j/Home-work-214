package com.example.jurbijur;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout ley214_1,ley214_2,ley214_3,ley214_4,ley214_5,ley214_6,mainLey,ley2;

    EditText editTextNumber,editTextNumber2,editTextNumber3;
    Button button,reload;



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
        mainLey = findViewById(R.id.mainLey);
        ley2 = findViewById(R.id.ley2);



       ////=============================Internet Check Start========================================///
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo!=null && networkInfo.isConnected()){


        ////=============================Internet Check End========================================///


            mainLey.setVisibility(View.VISIBLE);
            ley2.setVisibility(View.GONE);


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

        }else {
            ley2.setVisibility(View.VISIBLE);
            mainLey.setVisibility(View.GONE);

        }

        }

    ///=============================OnBackPassed Start===========================///
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finishAndRemoveTask();
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
    ///=============================OnBackPassed end===========================///
}

