package com.example.typeandrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            String make=etMake.getText().toString();
            int year= Integer.parseInt(etYear.getText().toString());
            String color=etColor.getText().toString();
            float price=Float.parseFloat(etPrice.getText().toString());
            int enginesize=Integer.parseInt(etSize.getText().toString());

            tvOutput.append("This is the vehicle no " +i+"\n" +"Made by "+make+ "\n"+ "Make year" +year+"\n"
                    +"Color is "+ color+"\n"+ "Purchase Price  "+price+ "\n"+"Engine size is "+enginesize+" liter ");
            }
        });


    }
}
