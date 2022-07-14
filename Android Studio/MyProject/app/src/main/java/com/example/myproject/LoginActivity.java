package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.*;

public class LoginActivity extends AppCompatActivity {

    TextView msg;
    Button showMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        msg = findViewById(R.id.textView);
        showMsg = findViewById(R.id.button);
        showMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Async().execute();
            }
        });
    }

    class Async extends AsyncTask<Void, Void, Void> {
        Connection Con;
        Statement st;
        ResultSet rs;
        PreparedStatement ps;

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection("jdbc:mysql://192.168.100.8:3306/db_android", "root", "pass");
                showMsg.setText("Connection Successfully!");
            } catch (Exception e) {
                showMsg.setText("Connection Failed!");
            }
            return null;
        }
    }
}