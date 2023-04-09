package com.example.fragmentmcd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.CustomViewHolder> {
    private List<Mcd> dataMcd;
    private MainActivity context;

    public ItemAdapter(List<Mcd> dataCountry, MainActivity context) {
        this.dataMcd = dataCountry;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
//        holder.txtId.setText(String.valueOf(dataCountry.get(position).getId()));
        holder.txtTitle.setText(dataMcd.get(position).getTitle());
        holder.txtDeskripsi.setText(dataMcd.get(position).getDeskripsi());
        Picasso.get().load(dataMcd.get(position).getGambar()).into(holder.imageView);
    }

    @Override
    public int getItemCount(){
        return dataMcd.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public final View nView;

        TextView txtTitle, txtDeskripsi;
        ImageView imageView;

        CustomViewHolder(View itemView){
            super(itemView);
            nView = itemView;

            txtTitle = nView.findViewById(R.id.description_text_view);
            txtDeskripsi = nView.findViewById(R.id.title_text_view);
            imageView = nView.findViewById(R.id.image_view);
        }
    }
}
