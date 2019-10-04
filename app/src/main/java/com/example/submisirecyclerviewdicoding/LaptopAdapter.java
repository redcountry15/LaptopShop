package com.example.submisirecyclerviewdicoding;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.ListViewHolder> {
    private ArrayList<Laptop> listLaptop ;



    public LaptopAdapter(ArrayList<Laptop>list){
        this.listLaptop = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new  ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Laptop laptop = listLaptop.get(position);

        Glide.with(holder.itemView.getContext())
                .load(laptop.getImage())
                .into(holder.image);
        holder.tvName.setText(laptop.getName());
        holder.tvPrice.setText(laptop.getPrice());

        holder.cvMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context mContext = view.getContext();
                Intent keSana= new Intent(holder.itemView.getContext(), DeskripsiAct.class);
                keSana.putExtra("Nama",laptop.getName());
                keSana.putExtra("Price",laptop.getPrice());
                keSana.putExtra("Desc",laptop.getDesc());
                keSana.putExtra("Gambar",laptop.getImage());
                mContext.startActivity(keSana);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listLaptop.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tvName,tvPrice,tvDesc;
        CardView cvMain;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            cvMain = itemView.findViewById(R.id.CardView);
            image = itemView.findViewById(R.id.GambarLaptop);
            tvName = itemView.findViewById(R.id.NamaLaptop);
            tvPrice = itemView.findViewById(R.id.price);
            tvDesc = itemView.findViewById(R.id.listSpesifikasi);

        }


}

}


