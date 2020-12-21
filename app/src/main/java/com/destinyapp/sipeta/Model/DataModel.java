package com.destinyapp.sipeta.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModel {
    @SerializedName("id_kabar_berita")
    @Expose
    public String id_kabar_berita;

    @SerializedName("judul_berita")
    @Expose
    public String judul_berita;

    @SerializedName("cover_berita")
    @Expose
    public String cover_berita;

    @SerializedName("isi_berita")
    @Expose
    public String isi_berita;

    @SerializedName("status_berita")
    @Expose
    public String status_berita;

    @SerializedName("created_at_berita")
    @Expose
    public String created_at_berita;

    public String getId_kabar_berita() {
        return id_kabar_berita;
    }

    public void setId_kabar_berita(String id_kabar_berita) {
        this.id_kabar_berita = id_kabar_berita;
    }

    public String getJudul_berita() {
        return judul_berita;
    }

    public void setJudul_berita(String judul_berita) {
        this.judul_berita = judul_berita;
    }

    public String getCover_berita() {
        return cover_berita;
    }

    public void setCover_berita(String cover_berita) {
        this.cover_berita = cover_berita;
    }

    public String getIsi_berita() {
        return isi_berita;
    }

    public void setIsi_berita(String isi_berita) {
        this.isi_berita = isi_berita;
    }

    public String getStatus_berita() {
        return status_berita;
    }

    public void setStatus_berita(String status_berita) {
        this.status_berita = status_berita;
    }

    public String getCreated_at_berita() {
        return created_at_berita;
    }

    public void setCreated_at_berita(String created_at_berita) {
        this.created_at_berita = created_at_berita;
    }
}
