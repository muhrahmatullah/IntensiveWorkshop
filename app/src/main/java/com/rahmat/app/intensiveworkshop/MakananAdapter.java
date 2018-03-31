package com.rahmat.app.intensiveworkshop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by muhrahmatullah on 3/31/18.
 */

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder>{


    List<Makanan> makanan;
    Context context;

    public MakananAdapter(List<Makanan> makanan, Context context) {
        this.makanan = makanan;
        this.context = context;
    }

    @Override
    public MakananViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false);

        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MakananViewHolder holder, int position) {
        Makanan m = makanan.get(position);

        holder.txtTitle.setText(m.getTitle());
        holder.txtPrice.setText(m.getPrice());
        holder.imgFood.setImageResource(m.getImage());
    }

    @Override
    public int getItemCount() {
        return makanan.size();
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder{

        ImageView imgFood;
        TextView txtTitle, txtPrice;

        public MakananViewHolder(View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.item_image_food);
            txtTitle = itemView.findViewById(R.id.item_title);
            txtPrice = itemView.findViewById(R.id.item_price);

        }
    }

}
