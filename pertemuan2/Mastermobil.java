/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author asus
 */
// Kelas Mastermobil
public class Mastermobil {
     
    

      String warnamobil = "Biru";
    String merkmobil = "Mercy";
    int tahunmobil = 2016;
    
    public void berjalan(){
        System.out.println("Mobil Sedang berjalan");
    }
    public void berhenti(){
        System.out.println("Mobil Sedang berhenti");
    }
    public static void main(String[] args) {
    //buat objec mastermobil
    Mastermobil mobil = new Mastermobil();
    mobil.berjalan();
    mobil.berhenti();
    }
    }
