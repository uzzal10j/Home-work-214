package com.example.jurbijur;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeWork214_5 extends AppCompatActivity {

    Button bill;
    TextView billTv;
    EditText unit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_work2145);
        bill = findViewById(R.id.bill);
        billTv = findViewById(R.id.billTv);
        unit = findViewById(R.id.unit);



        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myunit =unit.getText().toString();

                if (myunit.length()<=0){
                   unit.setError("please put your unit");
                    billTv.setText("আপনি কোন ইউনিট নাম্বার উল্লেখ করেন নাই ");
                    billTv.setBackgroundColor(Color.GREEN);
                    billTv.setTextColor(Color.RED);

                }else {
                    float mainbill = Float.parseFloat(myunit);
                    float total_bill = 0;
                    if (mainbill <= 75) total_bill = (float) (mainbill * 4.19);
                    else if (mainbill <= 125)
                        total_bill = (float) (314.25 + (mainbill - 75) * 5.72);
                    else if (mainbill <= 300)
                        total_bill = (float) (314.25 + 715 + (mainbill - 200) * 6.00);
                    else if (mainbill <= 400)
                        total_bill = (float) (314.25 + 715 + 600 + (mainbill - 300) * 6.34);
                    else if (mainbill <= 600)
                        total_bill = (float) (314.25 + 715 + 600 + 634 + (mainbill - 400) * 9.94);
                    else
                        total_bill = (float) (314.25 + 715 + 600 + 634 + 1988 + (mainbill - 600) * 9.94);

                    total_bill = (float) (total_bill + total_bill * 0.1 + 10);

                    String s = String.format("%.2f", total_bill);

                    billTv.setText("আপনার মোট বিল হল  \n" + s + " টাকা");
                    billTv.setBackgroundColor(Color.GREEN);
                    billTv.setTextColor(Color.BLACK);

                }
            }
        });



    }
}