package com.example.mycardview;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecylerView extends RecyclerView.Adapter<AdapterRecylerView.ViewHolder> {

    ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textJudul, textTahun;
        ImageView posterFilm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textJudul = itemView.findViewById(R.id.text_judul);
            textTahun = itemView.findViewById(R.id.text_tahun);
            posterFilm = itemView.findViewById(R.id.img_poster);

        }
    }

    AdapterRecylerView (ArrayList<ItemModel> data){
        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecylerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecylerView.ViewHolder holder, int position) {

        TextView text_judul = holder.textJudul;
        TextView text_tahun = holder.textTahun;
        ImageView image_poster = holder.posterFilm;

        text_judul.setText(dataItem.get(position).getName());
        text_tahun.setText(dataItem.get(position).getYear());
        image_poster.setImageResource(dataItem.get(position).getPoster());

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }
}
