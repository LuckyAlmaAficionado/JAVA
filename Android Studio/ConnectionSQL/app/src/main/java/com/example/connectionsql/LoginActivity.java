package com.example.connectionsql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginActivity extends AppCompatActivity {

    ConnectionClass koneksi;
    Button login;
    EditText user, pass;
    TextView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // menghilangkan navbar diatas
        getSupportActionBar().hide();
        // memperbesar tampilan menjadi full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager
        .LayoutParams.FLAG_FULLSCREEN);

        // deklarasi
        user = findViewById(R.id.txtUsername);
        pass = findViewById(R.id.txtPassword);
        alert = findViewById(R.id.alert);
        login = findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        koneksi = new ConnectionClass();
    }

    public void login(){

        try{
            Connection con = koneksi.CONN();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_accounts WHERE `tb_accounts`.`username`='"+user.getText().toString().trim()+"' AND `tb_accounts`.`password`='"+pass.getText().toString().trim()+"'");
            if (rs.next()){
                Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Login Gagal!", Toast.LENGTH_LONG).show();
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}