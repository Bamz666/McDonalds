package com.example.fragmentmcd;

import com.google.gson.annotations.SerializedName;

public class Mcd {

    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("deskripsi")
    private String deskripsi;
    @SerializedName("gambar")
    private String gambar;

    public Mcd(Integer id, String title, String deskripsi, String gambar) {
        this.id = id;
        this.title = title;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
