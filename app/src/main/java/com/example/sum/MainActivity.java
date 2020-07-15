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
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.input1);
        input2 = (EditText)findViewById(R.id.input2);
        addBtn = (Button)findViewById(R.id.button);
        subBtn = (Button)findViewById(R.id.btnSub);
        result = (TextView) findViewById(R.id.result);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                int c = a + b;
                result.setText("Result: " + String.valueOf(c));
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                int c = a - b;
                result.setText("Result: " + String.valueOf(c));
            }
        });
    }
}
