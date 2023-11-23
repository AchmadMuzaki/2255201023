/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasEnkapsulasi;

/**
 *
 * @author asus
 */
public class Rumah {
    private String alamat;
    private int luasTaman;

  public void Setalamat(String alamat){
        this.alamat = alamat;
    }
    public void SetluasTaman (int luasTaman){
        this.luasTaman = luasTaman;
    }
    
    public String Getalamat(){
        return this.alamat;
    }
    public int GetluasTaman(){
        return this.luasTaman;
    }
}