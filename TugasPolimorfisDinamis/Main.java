/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPolimorfisDinamis;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        Hewan hewan3 = new Burung();
        
        hewan1.suara();
        hewan2.suara();
        hewan3.suara();
        
    }
    
}
