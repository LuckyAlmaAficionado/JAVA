package com.example.connectionsql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {

    ConnectionClass connectionClass;
    TextView alert;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        menghilangkan navbar diatas
        getSupportActionBar().hide();
//        memperbesar tampilan menjadi full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager
        .LayoutParams.FLAG_FULLSCREEN);

//        deklarasi TEXTVIEW
        alert = findViewById(R.id.textView);
        btn = findViewById(R.id.btnCek);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Doregister doregister = new Doregister();
                doregister.execute("");
            }
        });

        connectionClass = new ConnectionClass();
    }

    public class Doregister extends AsyncTask<String, String, String>{

        @Override
        protected String doInBackground(String... strings) {
            try{
                Connection conn = connectionClass.CONN();
                if (conn == null){
                    alert.setText("Koneksi tidak berhasil!");
                }else{
                    alert.setText("Koneksi berhasil!");
                }
            }catch (Exception e){
                alert.setText("Error: " + e.getMessage());
            }
            return null;
        }
    }
}