package com.example.inflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

//    Context context;
    Button button;
    TextView text;
//    public static boolean click = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView2);
        button = findViewById(R.id.button2);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (click){
//                    Toast.makeText(MainActivity.this, "Link berikut ini lmaooo", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                click = true;
//                Toast.makeText(MainActivity.this, "Click kembali untuk mendapatkan link", Toast.LENGTH_SHORT).show();
//                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        click = false;
//                    }
//                }, 2000);
//            }
//        });

    }


//    boolean doubleBackToExitPressedOnce = false;
//
//    @Override
//    public void onBackPressed() {
//        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed();
//            return;
//        }
//
//        this.doubleBackToExitPressedOnce = true;
//        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
//
//        // membuat tombol kembali reset menjadi false kembali
//        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                doubleBackToExitPressedOnce=false;
//            }
//        }, 2000);
//    }

    public static boolean a = false;

    public void clickBTN(View view) {
        if (a){
            ConstraintLayout utama = findViewById(R.id.layoutUtama);
            View view1 = getLayoutInflater().inflate(R.layout.layout1, null);
            utama.addView(view1);
        }

        a = true;
        Toast.makeText(MainActivity.this, "Click one more time for confirm", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                a = false;
            }
        }, 2000);
    }
}