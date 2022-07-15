package com.example.mycardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView receRecyclerView;
    AdapterRecylerView adapterRecylerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        receRecyclerView = findViewById(R.id.recyler_view);
        receRecyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        receRecyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();

        MyItem a = new MyItem();
        for (int i = 0; i < MyItem.judulFilm.length; i++){
            data.add(new ItemModel(
                    MyItem.judulFilm[i],
                    MyItem.tahunFilm[i],
                    MyItem.poster[i]
            ));
        }

        adapterRecylerView = new AdapterRecylerView(data);
        receRecyclerView.setAdapter(adapterRecylerView);

    }
}