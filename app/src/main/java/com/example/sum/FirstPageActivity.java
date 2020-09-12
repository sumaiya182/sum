package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPageActivity extends AppCompatActivity {
    private Button btnNormal;
    private Button btnScientific;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        btnNormal = (Button)findViewById(R.id.btnNormal);
        btnScientific = (Button)findViewById(R.id.btnScientific);
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
        btnScientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScientificActivity();
            }
        });
    }

    public void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openScientificActivity()
    {
        Intent intent = new Intent(this, ScientificActivity.class);
        startActivity(intent);
    }
}
