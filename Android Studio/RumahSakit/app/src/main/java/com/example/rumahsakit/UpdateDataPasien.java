package com.example.rumahsakit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateDataPasien extends AppCompatActivity {

    EditText nik_input, name_input, age_input, address_input;
    Button update_button;
    String id, nik, name, age, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data_pasien);

        nik_input = findViewById(R.id.nik_input2);
        name_input = findViewById(R.id.name_input2);
        age_input = findViewById(R.id.age_input2);
        address_input = findViewById(R.id.address_input2);

        getAndSetIntentData();

        update_button = findViewById(R.id.update_button);
        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateDataPasien.this);
                nik = nik_input.getText().toString().trim();
                name = name_input.getText().toString().trim();
                age = age_input.getText().toString().trim();
                address = address_input.getText().toString().trim();
                myDB.updateData(id, nik, name, age, address);
            }
        });
    }

    void getAndSetIntentData(){
        id = getIntent().getStringExtra("id");
        nik = getIntent().getStringExtra("nik");
        name = getIntent().getStringExtra("name");
        age = getIntent().getStringExtra("age");
        address = getIntent().getStringExtra("address");

        nik_input.setText(nik);
        name_input.setText(name);
        age_input.setText(age);
        address_input.setText(address);
    }
}