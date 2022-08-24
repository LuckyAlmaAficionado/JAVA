package com.example.bookapplibrary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "BookLibrary.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "my_library";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_TITLE = "book_title";
    private static final String COLUMN_AUTHOR = "book_author";
    private static final String COLUMN_PAGES = " book_pages";
    private final Context context;


    // mengambil semua data dan memasukannya kedalam var/array this.
    MyDatabaseHelper(@Nullable Context context) {
        // membuat database?
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    // membuat tabel
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " TEXT, " +
                COLUMN_AUTHOR + " TEXT, " +
                COLUMN_PAGES + " INTEGER);";
        db.execSQL(query);
    }

    // drop table jika tersedia agar menghindari tabrakan data
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        // eksekusi SQLite3
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        // memaggil onCreate untuk membuat table yang baru
        onCreate(db);
    }

    // menambahkan data kedalam database SQLite3
    void addBook(String title, String author, int pages) {
        // db untuk menggunakan func yang ingin digunakan?
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        // memasukan data kedalam cv
        cv.put(COLUMN_TITLE, title);
        cv.put(COLUMN_AUTHOR, author);
        cv.put(COLUMN_PAGES, pages);
        // memasukan data kedalam database db.insert
        long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1) {
            Toast.makeText(context, "Failed!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Added Successfully!", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readAllData() {
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        /* Apa itu RawQuery di Android SQLite?
        Di sisi lain, RawQuery berfungsi sebagai pintu keluar di mana Anda dapat
        membuat kueri SQL Anda sendiri saat runtime tetapi masih menggunakan Room
        untuk mengubahnya menjadi objek. Metode RawQuery harus mengembalikan tipe non-void.
        Jika Anda ingin menjalankan kueri mentah yang tidak mengembalikan nilai apa pun,
        gunakan metode RoomDatabase#query */
        if (db != null) {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    void updateData(String row_id, String title, String author, String pages) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        // Format cv.put(Nama Column yang ingin di isi, Data/Value);
        cv.put(COLUMN_TITLE, title);
        cv.put(COLUMN_AUTHOR, author);
        cv.put(COLUMN_PAGES, pages);
        long result = db.update(TABLE_NAME, cv, "id=?", new String[]{row_id});
        if (result == -1) {
            Toast.makeText(context, "Failed to Update!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Successfully Update!", Toast.LENGTH_SHORT).show();
        }
    }

    // untuk menghapus satu data
    void deleteOneRow(String row_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_NAME, "id=?", new String[]{row_id});
        if (result == -1) {
            Toast.makeText(context, "Failed to Delete!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Successfully Deleted!", Toast.LENGTH_SHORT).show();
        }
    }

    void deleteAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_NAME);
    }
}
