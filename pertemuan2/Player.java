/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author asus
 */
public class Player {

    /**
     * @param args the command line arguments
     */
    
        String Name;
        int Speed ;
        int HealthPoint;
        
    void run(){
        System.out.println (Name + " Is Running...");
        System.out.println ("Speed :  " + Speed);
    }
        boolean isDead(){
            if (HealthPoint <=0) return true;
            return false;
        
        
       
    }
    
}
