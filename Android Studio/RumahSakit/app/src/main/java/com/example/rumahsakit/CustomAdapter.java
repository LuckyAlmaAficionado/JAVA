package com.example.rumahsakit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    ArrayList id_pasien, nik_pasien, name_pasien, age_pasien, address_pasien;
    Activity activity;

    CustomAdapter(Activity activity, Context context, ArrayList id_pasien, ArrayList nik_pasien,
                  ArrayList name_pasien, ArrayList age_pasien, ArrayList address_pasien){
        this.context = context;
        this.id_pasien = id_pasien;
        this.nik_pasien = nik_pasien;
        this.name_pasien = name_pasien;
        this.age_pasien = age_pasien;
        this.address_pasien = address_pasien;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id_pasien_txt.setText(String.valueOf(id_pasien.get(position)));
        holder.nik_pasien_txt.setText(String.valueOf(nik_pasien.get(position)));
        holder.name_pasien_txt.setText(String.valueOf(name_pasien.get(position)));
        holder.age_pasien_txt.setText(String.valueOf(age_pasien.get(position)));
        holder.address_pasien_txt.setText(String.valueOf(address_pasien.get(position)));

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateDataPasien.class);
                intent.putExtra("id", String.valueOf(id_pasien.get(position)));
                intent.putExtra("nik", String.valueOf(nik_pasien.get(position)));
                intent.putExtra("name", String.valueOf(name_pasien.get(position)));
                intent.putExtra("age", String.valueOf(age_pasien.get(position)));
                intent.putExtra("address", String.valueOf(address_pasien.get(position)));
                System.out.println("sampai sini?");
                activity.startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return id_pasien.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id_pasien_txt, nik_pasien_txt, name_pasien_txt, age_pasien_txt, address_pasien_txt;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            id_pasien_txt = itemView.findViewById(R.id.id_pasien_txt);
            nik_pasien_txt = itemView.findViewById(R.id.nik_pasien_txt);
            name_pasien_txt = itemView.findViewById(R.id.name_pasien_txt);
            age_pasien_txt = itemView.findViewById(R.id.age_pasien_txt);
            address_pasien_txt = itemView.findViewById(R.id.address_pasien_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
