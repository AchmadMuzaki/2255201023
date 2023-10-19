/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author asus
 */
 public class Run {

  
    public static void main(String[] args) {
    Enemy mosnter = new Enemy();
    Zombie zumbi = new Zombie();
    Pocong hantupocong = new Pocong();
    Burung garuda = new Burung();
    
    
    mosnter.attack();
    
    zumbi.attack();
    zumbi.walk();
    
    hantupocong.attack();
    hantupocong.jump();
    
    garuda.attack();
    garuda.jump();
    garuda.fly();
    garuda.walk();
   
    }
    
}
