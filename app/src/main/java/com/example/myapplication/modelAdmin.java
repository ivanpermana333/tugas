package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class modelAdmin implements Parcelable {




    private String id;
    private String nama;
    private String nohp;
    private String email;


    protected modelAdmin(Parcel in) {
        id = in.readString();
        nama = in.readString();
        nohp = in.readString();
        email = in.readString();
    }

    public static final Creator<modelAdmin> CREATOR = new Creator<modelAdmin>() {
        @Override
        public modelAdmin createFromParcel(Parcel in) {
            return new modelAdmin(in);
        }

        @Override
        public modelAdmin[] newArray(int size) {
            return new modelAdmin[size];
        }
    };

    public modelAdmin() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(nama);
        parcel.writeString(nohp);
        parcel.writeString(email    );
    }
}
