package com.example.makanantradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnNasiGoreng,btnSoto;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnSoto = findViewById(R.id.btn_buka_nama_Soto);
        btnNasiGoreng = findViewById(R.id.btn_buka_nama_NasiGoreng);
        btnSoto.setOnClickListener(view -> bukaGaleri("Soto"));
        btnNasiGoreng.setOnClickListener(view -> bukaGaleri("Nasi Goreng"));
    }

    private void bukaGaleri(String jenisMakanan) {
        Log.d("MAIN","Buka activity Nasigoreng");
        Intent intent = new Intent(this, GalleryActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisMakanan);
        startActivity(intent);
    }

}
