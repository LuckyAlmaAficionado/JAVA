package com.example.rumahsakit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDataPasien extends AppCompatActivity {

    EditText nik, name, age, address;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_pasien);

        nik = findViewById(R.id.nik_input);
        name = findViewById(R.id.name_input);
        age = findViewById(R.id.age_input);
        address = findViewById(R.id.address_input);

        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper db = new MyDatabaseHelper(AddDataPasien.this);
                db.addData(nik.getText().toString().trim(), name.getText().toString().trim(),
                        age.getText().toString().trim(), address.getText().toString().trim());
            }
        });
    }
}