package com.example.jurbijur;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeWork214_6 extends AppCompatActivity {

    EditText    fanEd,light30Ed,light40Ed,tvEd,motorEd,freezEd;
    TextView tvUnit;
    Button celUnit;
    float fan,light30,light40,tv,motor,freez,allunit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work2146);

        fanEd = findViewById(R.id.fanEd);
        light30Ed = findViewById(R.id.light30Ed);
        light40Ed = findViewById(R.id.light40Ed);
        tvEd = findViewById(R.id.tvEd);
        motorEd = findViewById(R.id.motorEd);
        freezEd = findViewById(R.id.freezEd);
        tvUnit= findViewById(R.id.tvUnit);
        celUnit = findViewById(R.id.celUnit);
        ////=======================================================================////
        celUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           String fanwatt = fanEd.getText().toString();
                String light30watt = light30Ed.getText().toString();
                String light40watt = light40Ed.getText().toString();
                String tvwatt = tvEd.getText().toString();
                String motorwatt = motorEd.getText().toString();
                String freezwatt = freezEd.getText().toString();

                if (fanwatt.length()<=0 || light30watt.length()<=0 || light40watt.length()<=0 || tvwatt.length()<=0 || motorwatt.length()<=0 || freezwatt.length()<=0){
                    tvUnit.setText("আপনি সঠিক নাম্বার দিন ");
                } else { fan = Float.parseFloat(fanwatt);
                    fan = fan*80;
                    light30 = Float.parseFloat(light30watt);
                    light30 = light30*30;
                    light40 =Float.parseFloat(light40watt);
                    light40 = light40*40;
                    tv = Float.parseFloat(tvwatt);
                    tv = tv*28;
                    motor = Float.parseFloat(motorwatt);
                    motor = motor*750;
                    freez = Float.parseFloat(freezwatt);
                    freez = freez*45;
                    allunit= (fan + light30 + light40 + tv + motor + freez) / 1000 ;
                    allunit=allunit*8;
                    allunit=allunit*30;
                    tvUnit.setText("apnar mut unit holo "+allunit);

                }


            }
        });
      ////=====================================================================////



    }
}