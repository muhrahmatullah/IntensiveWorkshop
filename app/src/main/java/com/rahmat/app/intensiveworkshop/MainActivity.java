package com.rahmat.app.intensiveworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MakananAdapter.MakananClickListener{

    List<Makanan> makananList = new ArrayList<>();
    RecyclerView recyclerView;
    MakananAdapter makananAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.makanan_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        prepareData();
        makananAdapter = new MakananAdapter( this);
        makananAdapter.setData(makananList, getApplicationContext());
        recyclerView.setAdapter(makananAdapter);
    }


    public void prepareData(){
        Makanan makanan = new Makanan(R.drawable.ayam_bakar, "12,000", "Ayam Bakar Madu");
        makananList.add(makanan);
        makanan = new Makanan(R.drawable.ayam_goreng, "12,000", "Ayam goreng Madu");
        makananList.add(makanan);
        makanan = new Makanan(R.drawable.hamburger, "22,000", "Medium Cheese Burger");
        makananList.add(makanan);
        makanan = new Makanan(R.drawable.sate_ayam, "20,000", "Sate ayam madura");
        makananList.add(makanan);
        makanan = new Makanan(R.drawable.sup_ayam, "21,000", "Sup Ayam Lezat");
        makananList.add(makanan);
        makanan = new Makanan(R.drawable.sup_ayam, "21,000", "Sup Ayam Lezat");
        makananList.add(makanan);
        makanan = new Makanan(R.drawable.sup_ayam, "21,000", "Sup Ayam Lezat");
        makananList.add(makanan);
    }

    @Override
    public void onItemClicked(int position) {
        //Toast.makeText(this, "Makanan yg kamu pilih "+makananList.get(position).
          //      getTitle(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, DetailMakananActivity.class);

        intent.putExtra("nama_makanan", makananList.get(position).getTitle());
        intent.putExtra("harga_makanan", makananList.get(position).getPrice());
        intent.putExtra("gambar_makanan", makananList.get(position).getImage());

        startActivity(intent);

    }
}
