package com.example.currencon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amount_input;
    RadioButton inr,usd;
    TextView ansShow;
    Button convert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amount_input=findViewById(R.id.editAmount);
        inr=findViewById(R.id.btnInr);
        usd=findViewById(R.id.btnUsd);
        ansShow=findViewById(R.id.txtAns);
        convert=findViewById(R.id.button);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sn=amount_input.getText().toString();
                double in=Double.parseDouble(sn);
                if (inr.isChecked()){
                    in=in*1.26;
                    ansShow.setText("INR amount: "+in+" Taka");

                }
                if (usd.isChecked()){
                    in*=102.34;
                    ansShow.setText("USD amount: "+in+" Taka");
                }
                Toast.makeText(MainActivity.this, "Process Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}