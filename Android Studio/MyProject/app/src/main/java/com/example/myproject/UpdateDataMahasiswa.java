package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateDataMahasiswa extends AppCompatActivity {

    EditText name_input,nim_input, ipk_input;
    Button update_button;
    String id, name, nim, ipk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data_mahasiswa);

        name_input = findViewById(R.id.mhs_name2);
        nim_input = findViewById(R.id.mhs_nim2);
        ipk_input = findViewById(R.id.mhs_ipk2);
        update_button = findViewById(R.id.update_button);

        // call getAndSetIntentData for getting data and set to Global var
        getAndSetIntentData();

        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateDataMahasiswa.this);
                name = name_input.getText().toString().trim();
                nim = nim_input.getText().toString().trim();
                ipk = ipk_input.getText().toString().trim();
                myDB.updateData(id, name, nim, ipk);
            }
        });
    }

    void getAndSetIntentData(){
        if (getIntent().hasExtra("id") && getIntent().hasExtra("name") &&
                getIntent().hasExtra("nim") && getIntent().hasExtra("ipk")){
            // Getting data dan set to global variable
            id = getIntent().getStringExtra("id");
            name = getIntent().getStringExtra("name");
            nim = getIntent().getStringExtra("nim");
            ipk = getIntent().getStringExtra("ipk");

            // set Text
            name_input.setText(name);
            nim_input.setText(nim);
            ipk_input.setText(ipk);
        }else{
            Toast.makeText(this, "No Data!", Toast.LENGTH_SHORT).show();
        }
    }
}