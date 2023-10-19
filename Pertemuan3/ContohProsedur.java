/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author asus
 */
public class ContohProsedur {
    
    int A = 12;
    int T = 5;
    
    void hitungluasSegitiga(){
        int luas = (int) (0.5*A*T);
        System.out.println("A=  "+A);
        System.out.println("T=  "+T);
        System.out.println("Luas Segitiga = "+luas);
    }

   
    public static void main(String[] args) {
        ContohProsedur P = new ContohProsedur();
        P.hitungluasSegitiga();
    }
    
}
