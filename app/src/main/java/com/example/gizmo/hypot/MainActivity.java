package com.example.gizmo.hypot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView HypotValue;
    EditText sideA, sideB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HypotValue = (TextView) findViewById(R.id.HypotValue);
        sideA = (EditText) findViewById(R.id.sideA);
        sideB = (EditText) findViewById(R.id.sideB);
    }

    public void onClick(View v)
    {
        String A, B, C;
        double a, b, c;

        A = sideA.getText().toString();
        B = sideB.getText().toString();
        a = Double.parseDouble(A);
        b = Double.parseDouble(B);
        c = Math.hypot(a, b);
        C = Double.toString(c);
        HypotValue.setText(C);


    }

}
