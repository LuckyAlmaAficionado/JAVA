package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button enable, disable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enable = findViewById(R.id.enable);
        disable = findViewById(R.id.disable);

        enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enable.setEnabled(false);
                disable.setEnabled(true);
                // memanggi button disable
                // disable.callOnClick();

                disable.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });

        disable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enable.setEnabled(true);
                disable.setEnabled(false);
                Log.d("testing", "disable juga dipanggil");
            }
        });
    }
}