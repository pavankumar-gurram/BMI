package com.example.bmi1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.ceil;

public class Main2Activity extends AppCompatActivity {
    TextView txt5,txt6,txt7,txt8,txt9,txt10;
    Button b1;
    static float n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt5=findViewById(R.id.text5);
        txt6=findViewById(R.id.text6);
        txt7=findViewById(R.id.text7);
        txt8=findViewById(R.id.text8);
        txt9=findViewById(R.id.text9);
        txt10=findViewById(R.id.text10);
        b1=findViewById(R.id.btn);
        String txt1=getIntent().getStringExtra("Name");
        int txt2=getIntent().getIntExtra("Age",0);
        int txt3=getIntent().getIntExtra("Hfeet",0);
        int txt4=getIntent().getIntExtra("Hinch",0);
        double txt11=getIntent().getDoubleExtra("Weight",0);
        double txt12=getIntent().getDoubleExtra("Bmi",0);
        float i= (float) txt12;
        n=i;
        txt5.setText("Hii "+txt1);
        txt6.setText("Your age is "+txt2);
        txt7.setText("Your height is "+txt3+"'"+txt4+"''");
        txt8.setText("Your Weight is "+txt11);
        txt9.setText("BMI is "+i);
        if(i<18.5)
        {
            underweight();
        }
        if((i >= 18.5) && (i <= 24.9))
        {
            normalweight();
        }
        if ((i >= 25) && (i <= 29.9))
        {
            overweight();
        }
        if(i>=30)
        {
            obesity();
        }

    }

    private void underweight() {
        txt10.setText("You are UnderWeight");
    }

    private void normalweight() {
        txt10.setText("You are NormalWeight");
    }

    private void overweight() {
        txt10.setText("You are OverWeight");
    }

    private void obesity() {
        txt10.setText("You have Obesity");
    }


    public void third(View view) {
        Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
        intent.putExtra("bmi",n);
        startActivity(intent);
    }
}

