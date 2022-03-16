package com.example.wee_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    EditText fn,sn;
    double v1,v2;
    TextView res;
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn = (EditText) findViewById(R.id.fnum);
        sn = (EditText) findViewById(R.id.snum);
        res = (TextView) findViewById(R.id.result);

        b1 = (Button) findViewById(R.id.button_multiplication);
        b2 = (Button) findViewById(R.id.button_division);
        b3 = (Button) findViewById(R.id.button_addition);
        b4 = (Button) findViewById(R.id.button_subtraction);
        b5 = (Button) findViewById(R.id.button_modulo);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        v1 = Double.parseDouble(fn.getText().toString());
        v2 = Double.parseDouble(sn.getText().toString());

        switch (v.getId()) {
            case R.id.button_multiplication:
                result(v1, v2, res, 0);
                break;
            case R.id.button_division:
                result(v1, v2, res, 1);
                break;
            case R.id.button_addition:
                result(v1, v2, res, 2);
                break;
            case R.id.button_subtraction:
                result(v1, v2, res, 3);
                break;
            case R.id.button_modulo:
                result(v1, v2, res, 4);
                break;
        }
    }
    public void result(double v1,double v2,TextView res, int opr) {
        if (opr == 0) { res.setText("Answer: " + Double.toString(v1 * v2)); }
        else if(opr == 1) { res.setText("Answer: " + Double.toString(v1 / v2)); }
        else if(opr == 2) { res.setText("Answer: " + Double.toString(v1 + v2)); }
        else if(opr == 3) { res.setText("Answer: " + Double.toString(v1 - v2)); }
        else if(opr == 4) { res.setText("Answer: " + Double.toString(v1 % v2)); }
    }
}