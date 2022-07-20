package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDataMahasiswa extends AppCompatActivity {

    EditText mhs_name, mhs_nim, mhs_ipk;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_mahasiswa);

        mhs_name = findViewById(R.id.mhs_name);
        mhs_nim = findViewById(R.id.mhs_nim);
        mhs_ipk = findViewById(R.id.mhs_ipk);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper db = new MyDatabaseHelper(AddDataMahasiswa.this);
                db.addMahasiswa(mhs_name.getText().toString().trim(),
                        mhs_nim.getText().toString().trim(), mhs_ipk.getText().toString().trim());
            }
        });

    }
}