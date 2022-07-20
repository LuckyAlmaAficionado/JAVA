package com.example.rumahsakit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MyDatabaseHelper myDB;
    ArrayList<String> id_pasien, nik_pasien, nama_pasien, age_pasien, address_pasien;

    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        myDB = new MyDatabaseHelper(MainActivity.this);
        id_pasien = new ArrayList<>();
        nik_pasien = new ArrayList<>();
        nama_pasien = new ArrayList<>();
        age_pasien = new ArrayList<>();
        address_pasien = new ArrayList<>();

        storeDataInArray();
        customAdapter = new CustomAdapter(this,this, id_pasien, nik_pasien, nama_pasien, age_pasien, address_pasien);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    void storeDataInArray(){
        Cursor cursor = myDB.readAllData();
        if(cursor.getCount() == 0){
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()){
                id_pasien.add(cursor.getString(0));
                nik_pasien.add(cursor.getString(1));
                nama_pasien.add(cursor.getString(2));
                age_pasien.add(cursor.getString(3));
                address_pasien.add(cursor.getString(4));
            }
        }
    }
}