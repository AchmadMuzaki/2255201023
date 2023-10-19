/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author asus
 */
public class ContohFungsi {
    int A = 12;
    int T = 5;
    
    int hitungluasSegitiga(){
        int luas = (int) (0.5*A*T);
        System.out.println("A = " + A);
        System.out.println("T = "+ T);
        return luas;
    }
            
    public static void main(String[] args) {
       ContohFungsi F = new ContohFungsi();
        System.out.println("Luas Segitiga = " + F.hitungluasSegitiga() );
    }
    
}
