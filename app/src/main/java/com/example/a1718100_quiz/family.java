package com.example.a1718100_quiz;

import android.graphics.drawable.Drawable;

public class family {
    public String nama ,jabatan ,pekerjaan;
    public Drawable gambar;


    public Drawable getGambar()
    {
        return gambar;
    }

    public void setGambar(Drawable gambar)
    {
        this.gambar = gambar;
    }

    public family(Drawable gambar, String nama, String jabatan, String pekerjaan) {
        this.gambar = gambar;
        this.nama = nama;
        this.jabatan = jabatan;
        this.pekerjaan = pekerjaan;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}

