/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_A.Muzaki;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
class Pembelian {
    private ArrayList<String> daftarPembeli;
    private ArrayList<Game> daftarGame;

    public Pembelian() {
        daftarPembeli = new ArrayList<>();
        daftarGame = new ArrayList<>();
    }

    public void beliGame(String pembeli, Game game) {
        daftarPembeli.add(pembeli);
        daftarGame.add(game);
        System.out.println("Terima kasih, " + pembeli + "! Anda berhasil membeli " + game.getNama() +
                " seharga RP." + game.getHarga() + "\n" + game.getDeskripsi());
        game.konfirmasiPembelian();
    }

    public void laporanPembelian() {
        System.out.println("Laporan Pembelian:");
        for (int i = 0; i < daftarPembeli.size(); i++) {
            Game game = daftarGame.get(i);
            System.out.println("Pembeli: " + daftarPembeli.get(i) +
                    ", Game: " + game.getNama() +
                    ", Harga: RP." + game.getHarga());
        }
    }
}