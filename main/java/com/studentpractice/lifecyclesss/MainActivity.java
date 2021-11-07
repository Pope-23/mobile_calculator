package com.studentpractice.lifecyclesss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    EditText num1, num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.add);
        num1 = (EditText) findViewById(R.id.v1);
        num2 = (EditText) findViewById(R.id.v2);
        result = (TextView) findViewById(R.id.tv);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View compute) {
        if(compute==btn){

            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double sum = n1 + n2;
            result.setText(Double.toString(sum));

        }
    }
}