package com.example.jurbijur;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeWork214_2 extends AppCompatActivity {

    EditText editTextNumber2;
    Button button2;
    TextView textView4;
    int lepyear=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work2142);

        editTextNumber2 = findViewById(R.id.editTextNumber2);
        button2 = findViewById(R.id.button2);
        textView4 = findViewById(R.id.textView4);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String year = editTextNumber2.getText().toString();
                if (year.length()>=4){
                    lepyear = Integer.parseInt(year);
                    if (lepyear%4 ==0 && lepyear%100 !=0 || lepyear%400 ==0){
                        textView4.setText(year+ " সালটি লিপ ইয়ার");
                    }else {
                        textView4.setText(year+ " সালটি লিপ ইয়ার না ");

                    }


                }else {
                    editTextNumber2.setError("Please Put a Year Number");

                }


            }
        });


    }
}