package com.example.makanantradisional;

import android.content.Context;

import com.example.makanantradisional.Model.Makanan;
import com.example.makanantradisional.Model.NasiGoreng;
import com.example.makanantradisional.Model.Soto;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Makanan> makanans = new ArrayList<>();

    private static List<NasiGoreng> initDataNasiGoreng(Context ctx) {
        List<NasiGoreng> nasigorengs = new ArrayList<>();
        nasigorengs.add(new NasiGoreng("Nasi Goreng Bakso",
                        "- masukkan nasi beri kecap, garam, gula dan merica aduk rata sampai matang, sesaat sebelum di angkat beri daun bawang, koreksi rasa, angkat dan hidangkan.", R.drawable.nasi_goreng_bakso));
        nasigorengs.add(new NasiGoreng("Nasi Goreng Biasa",
                        "- Ceplok telur lalu orak-arik rata, masukkan bumbu yang sudah dihaluskan, tumis sampai harum.- Masukkan mi, nasi, kaldu, garam dan kecap manis secukupnya. Aduk rata, koreksi rasa.", R.drawable.nasi_goreng_biasa));
        nasigorengs.add(new NasiGoreng("Nasi Goreng Kmapung",
                        "- Masukkan nasi, sambil di aduk-aduk. Kemudian beri garam aduk terus hingga matang- Terakhir masukkan kecap, saus dan daun bawang iris- Aduk rata dan sajikan dengan ikan teri.", R.drawable.nasi_goreng_kampung));
        nasigorengs.add(new NasiGoreng("Nasi Goreng Makasar",
                        "- Panaskan sedikit minyak, masukkan telur lalu orak-arik, beri sejumput garam dan merica, sisihkan- Ulek kasar bawang putih, merah, dan cabai rawit- Tumis bumbu tersebut hingga harum- Masukkan sosis babi, lalu irisan daun prei- Tumis hingga sosis agak kering- Masukkan nasi beserta bumbu pelengkap lainnya- Aduk rata dengan api sedang- Koreksi rasa, jika sudah pas api bisa dinaikkan menjadi besar- Angkat dan sajikan.", R.drawable.nasi_goreng_makasar));
        nasigorengs.add(new NasiGoreng("Nasi Goreng Omelet",
                "- Kocok telur masukkan susu full cream, lada, penyedap rasa dan daun bawang- Tumis bawang bombay dengan mentega menggunakan api kecil- Masukkan telur jika sudah setengah matang taburi keju lalu lipat- Balik-balik telur sampai dalamnya matang, namun jangan terllau kering.", R.drawable.nasi_goreng_omelet));
        nasigorengs.add(new NasiGoreng("Nasi Goreng Soto",
                        "- Tumis bawang merah, bawang putih, cabai merah, serai, daun jeruk hingga harum, masukkan ayam suwirnya , aduk-aduk, masukkan nasi putih, kemudian Royco bumbu nasi goreng soto, aduk hingga rata. Bumbui, koreksi rasa, tambahkan daun bawang, aduk rata kembali- Siapkan daun pisang untuk membungkus, oleskan minyak secukupnya, tata nasi hangat kemudian beri daun kemangi, cabai rawit utuh, bungkus, kemudian bakar sebentar sekitar 5 menit, sajikan.", R.drawable.nasi_goreng_soto));
        return nasigorengs;
    }

    private static List<Soto> initDataSoto(Context ctx) {
        List<Soto> sotos = new ArrayList<>();
        sotos.add(new Soto("Soto Lamongan",
                "Sesuai namanya, soto Lamongan adalah makanan khas daerah Lamongan, Jawa Timur. Ciri khas dari soto ini adalah suwiran ayam kampong yang empuk. Selain itu, ada juga koya yang merupakan remahan kerupuk udang.", R.drawable.soto_lamongan));
        sotos.add(new Soto("Soto Madura ",
                "Yang membedakan soto Madura dengan soto yang lain adalah bahan-bahannya. Soto Madura terdiri dari irisan daging sapi, kentang goreng, dan kecambah. Biasanya, dalam penyajiannya didampingi dengan rempeyek.", R.drawable.soto_madura));
        sotos.add(new Soto("Betawi",
                "Selain kuahnya yang berbeda, kuah santan atau kuah susu, irisan daging sapi, dan jeroan juga menjadi ciri khas dari soto Betawi. Tak hanya itu, jeruk nipis, sambal, minyak samin, dan emping yang menjadi pendampingnya juga menjadi pembeda dari soto yang lain.", R.drawable.soto_betawi));
        sotos.add(new Soto("Banjar",
                "Banjar adalah salah satu nama suku yang ada di Pulau Kalimantan. Soto Banjar tidak dibumbui dengan kunyit. Potongan lontong selalu hadir dalam setiap penyajiannya. Perkedel, telur, dan potongan daun bawang menjadi pelengkapnya. Terkadang juga ada sate Banjar.", R.drawable.soto_banjar));
        sotos.add(new Soto("Medan",
                "Soto Medan hampir mirip dengan soto Betawi. Kuahnya sama-sama dari santan. Akan tetapi, kuah kental berwarna kuningnya memiliki aroma kapulaga yang sangat khas.", R.drawable.soto_medan));
        sotos.add(new Soto("Kudus",
                "Kalau tidak memakai daging ayam, soto Kudus memakai daging kerbau. Daging sapi tidak dipakai konon kabarnya karena Sunan Kudus ingin bertoleransi dengan umat Hindu.", R.drawable.soto_kudus));
        return sotos;
    }



    private static void initAllMakanans(Context ctx) {
        makanans.addAll(initDataNasiGoreng(ctx));
        makanans.addAll(initDataSoto(ctx));

    }

    public static List<Makanan> getAllMakanan(Context ctx) {
        if (makanans.size() == 0) {
            initAllMakanans(ctx);
        }
        return  makanans;
    }

    public static List<Makanan> getMakanansByTipe(Context ctx, String nama) {
        List<Makanan> makanansByType = new ArrayList<>();
        if (makanans.size() == 0) {
            initAllMakanans(ctx);
        }
        for (Makanan h : makanans) {
            if (h.getJenis().equals(nama)) {
                makanansByType.add(h);
            }
        }
        return makanansByType;
    }

}

