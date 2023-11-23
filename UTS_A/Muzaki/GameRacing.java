/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_A.Muzaki;

/**
 *
 * @author asus
 */
class GameRacing extends Game {
     public GameRacing(String nama, String deskripsi, double harga) {
        super(nama, deskripsi, harga);
    }


    @Override
    public void konfirmasiPembelian() {
        System.out.println("Selamat! Anda akan memulai balapan yang menegangkan dengan Game Racing " + getNama() +
                " seharga RP." + getHarga() + ".");
    }
}
    
    

