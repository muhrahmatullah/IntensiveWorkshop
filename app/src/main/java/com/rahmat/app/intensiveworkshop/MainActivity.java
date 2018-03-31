package com.rahmat.app.intensiveworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCount;
    TextView txtCount;
    int angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = findViewById(R.id.btnCount);
        txtCount = findViewById(R.id.txtCount);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka++;
                txtCount.setText(String.valueOf(angka));
            }
        });
    }

    public void btnToast(View view) {
        //Toast.makeText(this, "Halo beb, nomor kamu adalah "+angka, Toast.LENGTH_LONG).show();
    }
}
