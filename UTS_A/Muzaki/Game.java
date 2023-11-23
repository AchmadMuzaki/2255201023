/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_A.Muzaki;

/**
 *
 * @author asus
 */
abstract class Game {
    private String nama;
    private String deskripsi;
    private double harga;

    public Game( String nama, String deskripsi, double harga) { 
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public abstract void konfirmasiPembelian();
}
