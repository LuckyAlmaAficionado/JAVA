package com.example.myproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;

    MyDatabaseHelper myDB;
    ArrayList<String> mhs_id, mhs_name, mhs_nim, mhs_ipk;

    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AddDataMahasiswa.class);
                startActivity(i);
            }
        });

        myDB = new MyDatabaseHelper(MainActivity.this);
        // create array list
        mhs_id = new ArrayList<>();
        mhs_name = new ArrayList<>();
        mhs_nim = new ArrayList<>();
        mhs_ipk = new ArrayList<>();

        storeDataInArray();
        customAdapter = new CustomAdapter(this, this, mhs_id, mhs_name, mhs_nim, mhs_ipk);

        // RecyclerView Setting
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    // refresh page
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            recreate();
        }
    }

    void storeDataInArray(){
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0){
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();
        }else{
            while(cursor.moveToNext()){
                mhs_id.add(cursor.getString(0));
                mhs_name.add(cursor.getString(1));
                mhs_nim.add(cursor.getString(2));
                mhs_ipk.add(cursor.getString(3));
            }
        }
    }
}