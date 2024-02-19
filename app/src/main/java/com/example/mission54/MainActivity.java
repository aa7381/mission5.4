package com.example.mission54;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int mone=0;
    TextView tV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
    }
    public void clicked(View view)
    {
        mone+=1;
        if(mone%7==0)
        {
            tV.setText("Boom!");
        }
        else
            tV.setText("This is a click number:"+mone);
    }
}