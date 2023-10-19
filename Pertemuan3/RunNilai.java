/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author asus
 */
public class RunNilai {
     public static void main(String[] args) {
    Masternilai P = new Masternilai(); 
    
        //Prosedur
        P.penilaian1(82, "Joni Yespapa", "");
        
        //Fungsi
        System.out.println(P.penilaian2(56, "Uday wikwik", ""));
        
        //Static Prosedur
        Masternilai.penilaian3(94, "Budi Watermelon", "");
        
        //Static Fungsi
        System.out.println(Masternilai.penilaian4(45, "Agus Twinkle Twinkle", ""));
    }
}

    
