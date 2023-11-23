/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_A.Muzaki;

/**
 *
 * @author asus
 */
class GameAdventure extends Game {

    public GameAdventure(String nama, String deskripsi, double harga) {
        super(nama, deskripsi, harga);
    }


    @Override
    public void konfirmasiPembelian() {
        System.out.println("Selamat! Anda akan memulai petualangan epik dengan Game Adventure " + getNama() +
                " seharga RP." + getHarga() + ".");
    }
}