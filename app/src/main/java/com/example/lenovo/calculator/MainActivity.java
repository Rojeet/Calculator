package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private String str1, str2, str3, result, str, sign;
    private double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView) findViewById(R.id.textview);
        str = "";
    }

    public void onClick(View V) {
        Button button = (Button) V;
        str += button.getText().toString();
        screen.setText(str);
        a = Double.parseDouble(str);
    }

    public void onClickSigns(View V) {
        Button button = (Button) V;
        sign = button.getText().toString();
        screen.setText(str);
        str = "";
    }

    public void calculate(View V) {
        Button button = (Button) V;
        str2 = button.getText().toString();
        b = Double.parseDouble(str2);
        if (sign.equals("+")) {
            result = a + b + "";
        }
        else if (sign.equals("-")) {
            result = a - b + "";
        } else if (sign.equals("*")) {
            result = a * b + "";
        } else if (sign.equals("/")) {
            result = a / b + "";
        } else {
            screen.setText("anything");
        }
        screen.setText("result");
    }
}