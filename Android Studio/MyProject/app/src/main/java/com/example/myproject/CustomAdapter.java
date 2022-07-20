package com.example.myproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    Activity activity;
    ArrayList mhs_id, mhs_name, mhs_nim, mhs_ipk;

    CustomAdapter(Activity activity, Context context, ArrayList mhs_id,
                  ArrayList mhs_name, ArrayList mhs_nim, ArrayList mhs_ipk){
        this.context = context;
        this.mhs_id = mhs_id;
        this.mhs_name = mhs_name;
        this.mhs_nim = mhs_nim;
        this.mhs_ipk = mhs_ipk;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        System.out.println(position);
        holder.mhs_id_txt.setText(String.valueOf(mhs_id.get(position)));
        holder.mhs_name_txt.setText(String.valueOf(mhs_name.get(position)));
        holder.mhs_nim_txt.setText(String.valueOf(mhs_nim.get(position)));
        holder.mhs_ipk_txt.setText(String.valueOf(mhs_ipk.get(position)));

        // ketika mainLayout ditekan
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Position inside mainLayout: " + position);
                Intent intent = new Intent(context, UpdateDataMahasiswa.class);
                intent.putExtra("id", String.valueOf(mhs_id.get(position)));
                intent.putExtra("name", String.valueOf(mhs_name.get(position)));
                intent.putExtra("nim", String.valueOf(mhs_nim.get(position)));
                intent.putExtra("ipk", String.valueOf(mhs_ipk.get(position)));
                activity.startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mhs_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mhs_id_txt, mhs_name_txt, mhs_nim_txt, mhs_ipk_txt;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mhs_id_txt = itemView.findViewById(R.id.mhs_id_txt);
            mhs_name_txt = itemView.findViewById(R.id.mhs_name_txt);
            mhs_nim_txt = itemView.findViewById(R.id.mhs_nim_txt);
            mhs_ipk_txt = itemView.findViewById(R.id.mhs_ipk_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
