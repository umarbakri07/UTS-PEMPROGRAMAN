package com.example.makanantradisional;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.makanantradisional.Model.Makanan;

import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    List<Makanan> makanans;
    int indeksTampil = 0;
    String jenisMakanan;
    Button btnPertama, btnTerakhir, btnSebelumnya, btnBerikutnya;
    TextView txDeskripsi, txJudul, txType;
    ImageView ivFotoMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        Intent intent = getIntent();
        jenisMakanan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        makanans = DataProvider.getMakanansByTipe(this, jenisMakanan);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnberikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> MakananPertama());
        btnTerakhir.setOnClickListener(view -> MakananTerakhir());
        btnSebelumnya.setOnClickListener(view -> MakananSebelumnya());
        btnBerikutnya.setOnClickListener(view -> MakananBerikutnya());


        txType = findViewById(R.id.txType);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoMakanan = findViewById(R.id.gambarMakanan);
        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Makanan Tradisional" + jenisMakanan);
    }


    private void tampilkanProfil() {
        Makanan k = makanans.get(indeksTampil);
        Log.d("Nasi Goreng", "Menampilkan Nasi Goreng " + k.getJenis());
        txType.setText(k.getNama());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoMakanan.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void MakananPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this, "Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void MakananTerakhir() {
        int posAkhir = makanans.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this, "Sudah di posisi terakhir", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void MakananBerikutnya() {
        if (indeksTampil == makanans.size() - 1) {
            Toast.makeText(this, "Sudah di posisi terakhir", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void MakananSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this, "Sudah di posisi pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }

}