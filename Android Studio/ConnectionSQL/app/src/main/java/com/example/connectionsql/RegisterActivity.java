package com.example.connectionsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterActivity extends AppCompatActivity {

    Button register;
    TextView alert;
    EditText username, password, confirmPassword;
    ConnectionClass connectionClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // menghilangkan navbar diatas
        getSupportActionBar().hide();
        // memperbesar tampilan menjadi full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager
        .LayoutParams.FLAG_FULLSCREEN);

        // EditText
        username = findViewById(R.id.txtUsername);
        password = findViewById(R.id.txtPass);
        confirmPassword = findViewById(R.id.txtConPass);
        // TextView
        alert = findViewById(R.id.txtAlert);
        // Button
        register = findViewById(R.id.btn_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputData();
            }
        });

        connectionClass = new ConnectionClass();
    }

    Statement st;
    ResultSet rs;
    PreparedStatement ps;

    public boolean checkUsername(){
        boolean hasil = false;
        String user = username.getText().toString().trim();
        try{
            Connection con = connectionClass.CONN();
            st = (Statement) con.createStatement();
            rs = st.executeQuery("SELECT * FROM tb_accounts WHERE `tb_accounts`.`username`='"+user+"'");
            if (!rs.next()){
                hasil = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hasil;
    }

    public void inputData(){
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();
        String Cpass = confirmPassword.getText().toString().trim();
        if (user.isEmpty() || pass.isEmpty() || Cpass.isEmpty()){
//            alert.setText("fill empty column!");
            Toast.makeText(this, "Fill empty coloumn!", Toast.LENGTH_SHORT).show();
        }else if (!pass.contains(Cpass)){
//            alert.setText("password and confirm password doesn't match!");
            Toast.makeText(this, "Password and confirm password doesn`t match!", Toast.LENGTH_SHORT).show();
        }else if(!checkUsername()){
            Toast.makeText(this, "Account already exist!", Toast.LENGTH_SHORT).show();
        }else{
            try{
                Connection con = connectionClass.CONN();
                if (con == null){
                    alert.setText("Disconnect inputData()");
                }else{
                    ps = con.prepareStatement("INSERT INTO `tb_accounts` (`id_mahasiswa`, `username`, `password`) VALUES (NULL, ?, ?)");
                    ps.setString(1, user);
                    ps.setString(2, pass);
                    ps.executeUpdate();
                    Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(this, LoginActivity.class);
                    startActivity(i);
                }
            }catch (Exception ex){
                alert.setText("Error inputData(): " + ex.getMessage());
            }
        }
    }
}