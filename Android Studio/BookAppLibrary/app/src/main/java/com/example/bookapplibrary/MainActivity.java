package com.example.bookapplibrary;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;

    MyDatabaseHelper myDB;
    ArrayList<String> book_id, book_title, book_author, book_pages;

    CustomAdapter customAdapter;

    ImageView empty_imageview;
    TextView no_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        // id floating action button
        add_button = findViewById(R.id.add_button);

        // id decoration
        empty_imageview = findViewById(R.id.empty_imageview);
        no_data = findViewById(R.id.no_data);

        // ketika button di click maka akan menjalankan activity AddActivity.class
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AddActivity.class);
                startActivity(i);
            }
        });

        // memanggil database di MyDatabaseHelper & membuat array untuk menampung data
        myDB = new MyDatabaseHelper(MainActivity.this);
        book_id = new ArrayList<>();
        book_title = new ArrayList<>();
        book_author = new ArrayList<>();
        book_pages = new ArrayList<>();

        // memasukan data kedalam array untuk mengirimkan ke CustomAdapter
        storeDataInArray();
        // mengirimkan data dalam bentuk array ke CustomAdapter
        customAdapter = new CustomAdapter(MainActivity.this, this, book_id, book_title, book_author, book_pages);

        // memanggil recyclerview untuk di jalankan dan juga mendambil semua data dari customAdapter
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            recreate();
        }
    }

    // memasukan data kedalam array
    void storeDataInArray() {
        // Cursor berguna untuk readAllData/membaca semua data
        Cursor cursor = myDB.readAllData();
        Log.d("storeDataInArray", "Value dalam Cursor " + cursor);
        Log.d("storeDataInArray", "Value dalam Cursor.getCount() " + cursor.getCount());
        // untuk mengetahui apakah ada data atau tidak
        if (cursor.getCount() == 0) {
            // memunculkan gambar empty_imageview apabila No Data.
            empty_imageview.setVisibility(View.VISIBLE);
            no_data.setVisibility(View.VISIBLE);
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        } else {
            // jika tidak sembunyikan gambar
            empty_imageview.setVisibility(View.GONE);
            no_data.setVisibility(View.GONE);
            // jika data tersedia maka menambahkan data/memasukan data ke dalam array
            while (cursor.moveToNext()) {
                book_id.add(cursor.getString(0));
                book_title.add(cursor.getString(1));
                book_author.add(cursor.getString(2));
                book_pages.add(cursor.getString(3));
            }
        }
    }

    // for show my_menu from folder menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // apabila salah satu option dari applikasi ditekan akan memunculkan
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.delete_all:
                confirmDialogDeleteAll();
            case R.id.add_data:
                Log.d("xxx", "opsi ini dipilih");
                confirmDialogAddData();
        }
//        if (item.getItemId() == R.id.delete_all) {
//            confirmDialog();
//        }
        return super.onOptionsItemSelected(item);
    }

    void confirmDialogAddData(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add Data");
        builder.setMessage("Are you want to add new Data?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent ix = new Intent(MainActivity.this, AddActivity.class);
                startActivity(ix);
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        builder.create().show();
    }

    void confirmDialogDeleteAll() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete All");
        builder.setMessage("Are you sure want to delete all Data?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MyDatabaseHelper db = new MyDatabaseHelper(MainActivity.this);
                db.deleteAllData();
                // refresh activity
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();
    }
}