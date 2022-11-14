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
    float a,b,c,d,e;


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

                if (physics.length()<=0 && chemistry.length() <=0 && biology.length()<=0 && mathematics.length()<=0 && computer.length()<=0){
                    edPhysics.setError("please put a number");
                    edChemistry.setError("please put a number");
                    edBiology.setError("please put a number");
                    edMathematics.setError("please put a number");
                    edComputer.setError("please put a number");
                }else if (chemistry.length() <=0 && physics.length()>=0 && biology.length()>=0 && mathematics.length()>=0 && computer.length()>=0){
                    edChemistry.setError("please put number");
                }else if (biology.length()<=0 && chemistry.length() >=0 && physics.length()>=0 && mathematics.length()>=0 && computer.length()>=0){
                    edBiology.setError("jhfjkdhkj");
                }else if (biology.length()>=0 && chemistry.length() >=0 && physics.length()<=0 && mathematics.length()>=0 && computer.length()>=0){
                    edPhysics.setError("please put a number");
                }else if (biology.length()>=0 && chemistry.length() >=0 && physics.length()>=0 && mathematics.length()<=0 && computer.length()>=0){
                    edMathematics.setError("please put a number");
                }else if (biology.length()>=0 && chemistry.length() >=0 && physics.length()>=0 && mathematics.length()>=0 && computer.length()<=0){
                    edComputer.setError("please put a number");
                }


            }
        });
        ////=================End Onclick Here===================////

    }
}

////
///float marks = (a+b+c+d+e)/5;
               ///         if (marks >=90){
               ///                 textView8.setText("aponar GPA = A+ " );
                 ///               }else if (marks>=80){
                  //              textView8.setText("aponar GPA = A " );
                  //              }else if (marks>=70){
                   //             textView8.setText("aponar GPA = B " );
                  //              }else if (marks>=60){
                    //            textView8.setText("aponar GPA = C " );
                  //              }else if (marks>=40){
                     //           textView8.setText("aponar GPA = D " );
                     //           }else if (marks<40){
    //    textView8.setText("aponar GPA = F " );
   //     }



     //   textView8.setText("Dear user please put a number max 100");