package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connection();
    }

    public void connection(){
        LoginActivity.Async a = null;
        a.getConnection();
        if (a.getConnection() != null){
            System.out.println("Connection successfuly!");
        }
    }
}