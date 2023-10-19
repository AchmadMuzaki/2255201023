/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugaspertemuan4;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Hewan hewan = new Hewan();
     Anjing anjing = new Anjing();
     Ikan ikan = new Ikan();
     Kucing kucing = new Kucing();
     
     
     hewan.makan();
     
     anjing.makan();
     anjing.menggonggong();
     
     ikan.makan();
     ikan.Renang();
     
     kucing.makan();
     kucing.cakar();
    }
    
}
