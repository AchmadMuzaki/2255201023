/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author asus
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Player petani = new Player();
        
        
        petani.Name = "petani kode";
        petani.Speed = 78;
        petani.HealthPoint = 100;
        
        
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over!");
        }
    }
    
}
