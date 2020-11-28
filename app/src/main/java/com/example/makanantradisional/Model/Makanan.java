package com.example.makanantradisional.Model;

 public class Makanan {
    private String jenis;
    private String nama;
    private String deskripsi;
    private int drawableRes;

    public Makanan(String jenis, String nama, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() { return nama; }

    public void setNama(String nama) { this.nama = nama; }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}

