package com.example.jurbijur;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeWork214_1 extends AppCompatActivity {

    TextView textView;
    EditText editTextNumber;
    Button button;
    int number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work2141);

        textView =findViewById(R.id.textView);
        editTextNumber =findViewById(R.id.editTextNumber);
        button =findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userinput = editTextNumber.getText().toString();


                if (userinput.length()<=0){

                    editTextNumber.setError("put a number please");
                }
                else {
                            number = Integer.parseInt(userinput);

                            if (number%5 ==0 && number%11 == 0){
                                textView.setText(number  + " \n সংখ্যাটি 5 এবং 11 দ্বারা বিভাজ্য");
                                textView.setTextColor(Color.GREEN);

                            }
                            else if (number%5==0 && number%11 !=0){
                                textView.setText(number + " \n সংখ্যাটি 5 দ্বারা বিভাজ্য কিন্তু 11 দ্বারা নয়");
                                textView.setTextColor(Color.BLACK);

                            }
                            else if (number%5 !=0 && number%11==0){
                                textView.setText(number + "\n সংখ্যাটি 11 দ্বারা বিভাজ্য কিন্তু 5 দ্বারা নয়");
                                textView.setTextColor(Color.BLACK);
                            }
                            else {
                                textView.setText(number + "\n সংখ্যাটি 5 এবং 11 কোনটা দিয়ে বিভাজ্য নয় ");
                                textView.setTextColor(Color.RED);
                            }
                }
            }

        });





    }
}