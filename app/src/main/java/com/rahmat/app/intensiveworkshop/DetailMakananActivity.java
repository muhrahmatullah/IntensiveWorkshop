package com.rahmat.app.intensiveworkshop;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakananActivity extends AppCompatActivity {

    TextView nama, harga;
    ImageView gambar;
    String name, price;
    int pict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        nama = findViewById(R.id.title_detail);
        harga = findViewById(R.id.price_detail);
        gambar = findViewById(R.id.img_detail);

        Intent receivedIntent = getIntent();
        name = receivedIntent.getStringExtra("nama_makanan");
        price = receivedIntent.getStringExtra("harga_makanan");
        pict = receivedIntent.getIntExtra("gambar_makanan", 0);

        nama.setText(name);
        harga.setText(price);
        gambar.setImageResource(pict);

    }
}
