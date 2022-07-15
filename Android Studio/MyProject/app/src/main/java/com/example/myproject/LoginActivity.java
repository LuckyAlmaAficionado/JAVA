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
    Button btnMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        msg = findViewById(R.id.textView);
        btnMsg = findViewById(R.id.btnMSG);
        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Async().execute();
                msg.setText("ini di click");
            }
        });
    }

    class Async extends AsyncTask<Void, Void, Void> {
        Connection connection;

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://192.168.100.8:3306/db_android", "root", "pass");
                Statement statement = connection.createStatement();
                msg.setText("Conenction Successfuly!");
            } catch (Exception e) {
                msg.setText("Connection Failed");
            }
            return null;
        }

        // send connection
        public Connection getConnection(){
            return this.connection;
        }
    }
}