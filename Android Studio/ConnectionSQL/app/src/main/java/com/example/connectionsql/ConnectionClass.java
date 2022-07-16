package com.example.connectionsql;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

    @SuppressLint("NewApi")

    public Connection CONN(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.100.8:3306/db_android", "root", "pass");
            System.out.println("Connection Successfuly!");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        ConnectionClass a = new ConnectionClass();
        a.CONN();
    }
}
