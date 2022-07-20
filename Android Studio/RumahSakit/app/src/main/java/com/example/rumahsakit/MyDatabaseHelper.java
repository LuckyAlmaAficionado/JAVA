package com.example.rumahsakit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    Context context;
    private static final String DATABASE_NAME = "RumahSakit.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "data_pasien";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NIK = "nik";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_AGE = "age";
    private static final String COLUMN_ADDRESS = "address";

    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TABLE_NAME+ " " + "("+COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_NIK +" TEXT, "+ COLUMN_NAME +" TEXT, "+ COLUMN_AGE +" INTEGER, "+ COLUMN_ADDRESS +" TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    void addData(String nik, String name, String age, String address){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NIK, nik);
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_AGE, age);
        cv.put(COLUMN_ADDRESS, address);

        long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1){
            Toast.makeText(context, "Gagal Menambahkan!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Berhasil Menambahkan!", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readAllData(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    void updateData(String row_id, String nik, String name, String age, String address){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NIK, nik);
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_AGE, age);
        cv.put(COLUMN_ADDRESS, address);
        long result = db.update(TABLE_NAME, cv, "_id=?", new String[]{row_id});
        if (result == -1){
            Toast.makeText(context, "Gagal Update!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Berhasil Update!", Toast.LENGTH_SHORT).show();
        }
    }
}
