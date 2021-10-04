package com.company;

public class Barang {
    String idProduk;
    String nama;
    double harga;

    Barang(String idProduk, String nama, double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    Barang(String idProduk, String nama){
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }
    public String getIdProduk() {
        return idProduk;
    }
    public void print(){
        System.out.println(getIdProduk()+" - "+getNama()+" - "+getHarga());
    }
}
