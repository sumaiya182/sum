package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScientificActivity extends AppCompatActivity {
    private EditText input;
    private Button sinBtn;
    private Button cosBtn;
    private Button tanBtn;
    private Button cotBtn;
    private Button squareBtn;
    private Button cubeBtn;
    private Button rootBtn;
    private Button facBtn;
    private TextView result;
    private TextView resultOp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);

        input = (EditText)findViewById(R.id.input);
        sinBtn = (Button)findViewById(R.id.btnSin);
        cosBtn = (Button)findViewById(R.id.btnCos);
        tanBtn = (Button)findViewById(R.id.btnTan);
        cotBtn = (Button)findViewById(R.id.btnCot);
        squareBtn = (Button)findViewById(R.id.btnSquare);
        cubeBtn = (Button)findViewById(R.id.btnQube);
        rootBtn = (Button)findViewById(R.id.btnRoot);
        facBtn = (Button)findViewById(R.id.btnfac);
        result = (TextView) findViewById(R.id.result);
        resultOp = (TextView) findViewById(R.id.resultOp);


        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double res = Math.sin(Math.toRadians(a));
                String strDouble = String.format("%.2f", res);
                result.setText("Result: " + strDouble);
                resultOp.setText("Operation: sin ");
            }
        });

        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double res = Math.cos(Math.toRadians(a));
                String strDouble = String.format("%.2f", res);
                result.setText("Result: " + strDouble);
                resultOp.setText("Operation: cos ");
            }
        });

        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double res = Math.tan(Math.toRadians(a));
                String strDouble = String.format("%.2f", res);
                result.setText("Result: " + strDouble);
                resultOp.setText("Operation: tan ");
            }
        });

        cotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double res = 1/Math.tan(Math.toRadians(a));
                String strDouble = String.format("%.2f", res);
                result.setText("Result: " + strDouble);
                resultOp.setText("Operation: cot");
            }
        });

        squareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                result.setText("Result: " + a*a);
                resultOp.setText("Operation: x^2");
            }
        });

        cubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                result.setText("Result: " + a*a*a);
                resultOp.setText("Operation: x^3");
            }
        });

        rootBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double res = Math.sqrt(a);
                String strDouble = String.format("%.2f", res);
                result.setText("Result: " + strDouble);
                resultOp.setText("Operation: root");
            }
        });

        facBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                int i,fact=1;
                int number= (int) a;
                for(i=1;i<=number;i++){
                    fact=fact*i;
                }
                result.setText("Result: " + fact);
                resultOp.setText("Operation: factorial");
            }
        });




    }
}
