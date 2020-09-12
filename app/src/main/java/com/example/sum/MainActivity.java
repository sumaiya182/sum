package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private Button addBtn;
    private Button subBtn;
    private Button multBtn;
    private Button divBtn;
    private TextView result;
    private TextView resultOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.input1);
        input2 = (EditText)findViewById(R.id.input2);
        addBtn = (Button)findViewById(R.id.btnAdd);
        subBtn = (Button)findViewById(R.id.btnSub);
        multBtn = (Button)findViewById(R.id.btnMulti);
        divBtn = (Button)findViewById(R.id.btnDiv);
        result = (TextView) findViewById(R.id.result);
        resultOp = (TextView) findViewById(R.id.resultOp);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                int c = a + b;
                result.setText("Result: " + String.valueOf(c));
                resultOp.setText("Operation: +");
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                int c = a - b;
                result.setText("Result: " + String.valueOf(c));
                resultOp.setText("Operation: -");
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                int c = a * b;
                result.setText("Result: " + String.valueOf(c));
                resultOp.setText("Operation: x");
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input1.getText().toString());
                double b = Double.parseDouble(input2.getText().toString());
                double c = a / b;
                String strDouble = String.format("%.2f", c);
                result.setText("Result: " + String.valueOf(strDouble));
                resultOp.setText("Operation: /");
            }
        });
    }
}
