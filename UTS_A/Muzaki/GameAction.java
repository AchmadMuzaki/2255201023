/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_A.Muzaki;

/**
 *
 * @author asus
 */
class GameAction extends Game {
    public GameAction(String nama, String deskripsi, double harga) {
        super( nama, deskripsi, harga);
    }

    @Override
    public void konfirmasiPembelian() {
        System.out.println("Selamat datang di dunia aksi! Pembelian Game Action " + getNama() +
                " seharga RP." + getHarga() + " berhasil dikonfirmasi.");
    }
}