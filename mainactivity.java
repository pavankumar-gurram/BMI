package com.example.bmi1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2, editText3, editText4, editText5;
    Button button;
    double height = 0.025;
    double square;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.ed1);
        editText2 = (EditText) findViewById(R.id.ed2);
        editText3 = (EditText) findViewById(R.id.ed3);
        editText4 = (EditText) findViewById(R.id.ed4);
        editText5 =(EditText) findViewById(R.id.ed5);
        button =(Button) findViewById(R.id.btn_1);
    }

    public void second(View view) {
        if (editText1.getText().toString().trim().length() == 0) {
            editText1.setError("Enter Name");
        } else if (editText2.getText().toString().trim().length() == 0) {
            editText2.setError("Enter Age");
        } else if (editText3.getText().toString().trim().length() == 0) {
            editText3.setError("Enter Weight");
        } else if (editText4.getText().toString().trim().length() == 0) {
            editText4.setError("Enter Height");
        } else if (editText5.getText().toString().trim().length() == 0) {
            editText5.setError("Enter Height");
        }
        else {
            call();

        }
    }

    private void call() {
        String uname = editText1.getText().toString();
        int uage = Integer.parseInt(editText2.getText().toString());
        double uweight = Double.parseDouble(editText3.getText().toString());
        int ufeet = Integer.parseInt(editText4.getText().toString());
        int uinch = Integer.parseInt(editText5.getText().toString());
        double uheight = ((ufeet * 12) + uinch) * height;
        square = uheight * uheight;
        double bmi = uweight / square;
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("Name", uname);
        intent.putExtra("Age", uage);
        intent.putExtra("Hfeet", ufeet);
        intent.putExtra("Hinch", uinch);
        intent.putExtra("Weight", uweight);
        intent.putExtra("Bmi", bmi);
        startActivity(intent);
    }
}
