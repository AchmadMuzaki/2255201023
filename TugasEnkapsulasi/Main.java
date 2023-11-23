/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasEnkapsulasi;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        Rumah rumahSaya = new Rumah ();
        
        rumahSaya.Setalamat("Jalan Gandusari 011");
        rumahSaya.SetluasTaman(500);

        System.out.println("Alamat rumah saya: " + rumahSaya.Getalamat());
        System.out.println("Luas taman rumah saya: " + rumahSaya.GetluasTaman()+ " meter persegi");

    }
}