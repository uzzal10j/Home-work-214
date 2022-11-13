package com.example.jurbijur;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeWork214_3 extends AppCompatActivity {

    Button button3;
    TextView textView5;
    EditText editTextNumber3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work2143);

        button3=findViewById(R.id.button3);
        textView5=findViewById(R.id.textView5);
        editTextNumber3=findViewById(R.id.editTextNumber3);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String week = editTextNumber3.getText().toString();
                if (week.length()>0){


                int weekday = Integer.parseInt(week);

                if (weekday==1){
                    textView5.setText("1 day in a week is \n''Sunday'' "+"\n সপ্তাহে ১ দিন হল রবিবার");
                }else if (weekday ==2){
                    textView5.setText("2 day in a week is \n''Monday'' "+"\n সপ্তাহে ২ দিন হল সোমবার ");
                }else if (weekday==3){
                    textView5.setText("3 day in a week is \n''Tuesday'' "+"\n মঙ্গলবার সপ্তাহের ৩য় দিন ");

                }else if (weekday==4){
                    textView5.setText("4 day in a week is \n''Wednesday'' "+"\n বুধবার সপ্তাহের ৪র্থ দিন ");

                }else if (weekday==5){
                    textView5.setText("5 day in a week is \n''Thursday'' "+"\n বৃহস্পতিবার সপ্তাহের ৫ম দিন");

                }else if (weekday==6){
                    textView5.setText("6 day in a week is \n''Friday'' "+"\n শুক্রবার সপ্তাহের ৬ষ্ঠ দিন");

                }else if (weekday==7){
                    textView5.setText("7 day in a week is \n''Saturday'' "+"\n শনিবার সপ্তাহের 7 তম দিন");

                }else {
                    textView5.setText("আপনি সপ্তাহের 7 দিনের মধ্যে যে কোন একটি সংখ্যা লিখুন ");
                    editTextNumber3.setError("আপনি সপ্তাহের 7 দিনের মধ্যে যে কোন একটি সংখ্যা লিখুন ");
                }

            }else {
                    editTextNumber3.setError("Pleas Put a number");
                }
            }
        });


    }
}