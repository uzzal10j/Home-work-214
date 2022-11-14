package com.example.jurbijur;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeWork214_4 extends AppCompatActivity {

    EditText edPhysics,edChemistry,edBiology,edMathematics,edComputer;
    TextView textView8;
    Button button4;
    float a,b,c,d,e,persentig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work2144);


        ///=================== Start Find View===============///
                     //===Edittext===//
        edPhysics = findViewById(R.id.edPhysics);
        edChemistry = findViewById(R.id.edChemistry);
        edBiology = findViewById(R.id.edBiology);
        edMathematics = findViewById(R.id.edMathematics);
        edComputer = findViewById(R.id.edComputer);
                     //===Button===//
        button4 = findViewById(R.id.button4);
                     //===TexTView===//
        textView8 = findViewById(R.id.textView8);
      ///=================== End Find View===============///

        /////=================Start Onclick From Here===================////
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String physics = edPhysics.getText().toString();
                String chemistry = edChemistry.getText().toString();
                String biology = edBiology.getText().toString();
                String mathematics = edMathematics.getText().toString();
                String computer = edComputer.getText().toString();

                if (physics.length()<=0){
                    edPhysics.setError("please put  Marks");
                }else if (chemistry.length() <=0 ){
                    edChemistry.setError("please put a Marks");
                }else if (biology.length()<=0 ){
                    edBiology.setError("please put a Marks");
                }else if (mathematics.length()<=0){
                    edMathematics.setError("please put a Marks");
                }else if (computer.length()<=0){
                    edComputer.setError("please put a Marks");
                }else {
                    a=Float.parseFloat(physics);
                    b=Float.parseFloat(chemistry);
                    c=Float.parseFloat(biology);
                    d=Float.parseFloat(mathematics);
                    e=Float.parseFloat(computer);

                    if (a>100){
                        edPhysics.setError("Please input Max 100");
                        textView8.setText("");
                    }else if (b>100){
                        edChemistry.setError("Please input Max 100");
                        textView8.setText("");
                    }else if (c>100){
                        edBiology.setError("Please input Max 100");
                        textView8.setText("");
                    }else if (d>100){
                        edMathematics.setError("Please input Max 100");
                        textView8.setText("");
                    }else if (e>100){
                        edComputer.setError("Please input Max 100");
                        textView8.setText("");
                    }

                    else {

                    if (a <=0 || b<=0 || c<=0 || d<=0 || e<=0){
                        textView8.setText("Your Result Grad is fail");
                    }else {
                        persentig=(a+b+c+d+e)/5;

                        if (persentig>90){
                            textView8.setText("Your Result Grade is A+");
                        }else if (persentig>80){
                            textView8.setText("Your Result Grade is A");
                        }else if (persentig>70){
                            textView8.setText("Your Result Grade is B");
                        }else if (persentig>60){
                            textView8.setText("Your Result Grade is C");
                        }else if (persentig>50){
                            textView8.setText("Your Result Grade is D");
                        }else if (persentig>40){
                            textView8.setText("Your Result Grade is E");
                        }else if (persentig<40){
                            textView8.setText("You are Fail");
                        }

                    }

                    }

                }


            }
        });
        ////=================End Onclick Here===================////

    }
}

