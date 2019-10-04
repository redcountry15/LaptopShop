package com.example.submisirecyclerviewdicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiAct extends AppCompatActivity {
    ImageView img;
    TextView tvDesc,TvPrice,tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img= findViewById(R.id.GambarLaptopp);

        tvName =findViewById(R.id.NamaLaptopp);
        tvDesc = findViewById(R.id.listSpesifikasi);
        TvPrice = findViewById(R.id.Price);

        Intent i = getIntent();
        String nama =  i.getStringExtra("Nama");
        String price = i.getStringExtra("Price");
        String desc = i.getStringExtra("Desc");
        img.setImageResource(i.getIntExtra("Gambar",1));
        tvName.setText(nama);
        TvPrice.setText(price);
        tvDesc.setText(desc);

    }
}
