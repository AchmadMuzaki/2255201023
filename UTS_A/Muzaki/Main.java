/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_A.Muzaki;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pembelian pembelian = new Pembelian();

        int menu;
        do {
            System.out.println(" -------------------------- ");
            System.out.println("         Zeron Store        ");
            System.out.println("      Menjual Video Game    ");
            System.out.println("============================");
            System.out.println("1. Beli Game");
            System.out.println("2. Laporan Pembelian");
            System.out.println("0. Keluar");
            System.out.println("============================");      
            System.out.print("Masukkan angka: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    beliGame(scanner, pembelian);
                    break;
                case 2:
                    pembelian.laporanPembelian();
                    break;
                case 0:
                    System.out.println("Terima kasih telah mengunjungi toko game kami. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        } while (menu != 0);
    }

    private static void beliGame(Scanner scanner, Pembelian pembelian) {
        System.out.print("Selamat datang di Zeron Store! Masukkan Nama Pembeli: ");
        String namaPembeli = scanner.next();
        System.out.println("Pilih Game:\n1. Game Action\n2. Game Adventure\n3. Game Racing");
        System.out.print("Pilih Game (1-3): ");
        int pilihGame = scanner.nextInt();

        switch (pilihGame) {
            case 1:
                pembelian.beliGame(namaPembeli, new GameAction( "Call of Duty", "Pertempuran epik dalam setting modern.", 499000));
                break;
            case 2:
                pembelian.beliGame(namaPembeli, new GameAdventure( "The Legend of Zelda", "Petualangan penuh misteri dan teka-teki.", 368000));
                break;
             case 3:
                pembelian.beliGame(namaPembeli, new GameRacing("Need for Speed", "Balapan seru dengan mobil-mobil keren.", 599000));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    
    }
