package com.example.typeandrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCreate;
    private EditText etMake, etYear,etColor, etPrice,etSize;
    private TextView tvOutput;
    private int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMake=findViewById(R.id.etMake);
        btnCreate=findViewById(R.id.btnCreate);
        etYear=findViewById(R.id.etYear);
        etPrice=findViewById(R.id.etPrice);
        etSize=findViewById(R.id.etSize);
        etColor=findViewById(R.id.etColor);
        tvOutput=findViewById(R.id.tvOutput);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!vaidate()){
                    return;
                }
            String make=etMake.getText().toString();
            int year= Integer.parseInt(etYear.getText().toString());
            String color=etColor.getText().toString();
            float price=Float.parseFloat(etPrice.getText().toString());
            int enginesize=Integer.parseInt(etSize.getText().toString());
            i++;

            tvOutput.append("\n This is the vehicle no " +i+"\n" +"Made by "+make+ "\n"+ "Make year " +year+"\n"
                    +"Color is "+ color+"\n"+ "Purchase Price  "+price+ "\n"+"Engine size is "+enginesize+" liter ");
            }
        });


    }
    public boolean vaidate(){
        boolean isValid=true;

        if(TextUtils.isEmpty(etMake.getText().toString())){
            etMake.setError("Please Enter Manufacturer");
            etMake.requestFocus();
            isValid=false;
        }else if(TextUtils.isEmpty(etColor.getText().toString())){
            etColor.setError("Please Enter Color");
            etColor.requestFocus();
            isValid=false;
        }
        if(TextUtils.isEmpty(etSize.getText().toString())){
            etSize.setError("Please Enter Engine size");
            etSize.requestFocus();
            isValid=false;
        }
        if(TextUtils.isEmpty(etPrice.getText().toString())){
            etPrice.setError("Please Enter Price");
            etPrice.requestFocus();
            isValid=false;
        }if(TextUtils.isEmpty(etYear.getText().toString())){
            etYear.setError("Please Enter Year");
            etYear.requestFocus();
            isValid=false;
        }if(TextUtils.isEmpty(etColor.getText().toString())){
            etColor.setError("Please Enter color");
            etColor.requestFocus();
            isValid=false;
        }return isValid;
    }
}
