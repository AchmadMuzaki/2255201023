/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author asus
 */
public class Masternilai {

     // Prosedur
  void penilaian1(int nilai, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if ( nilai >= 70 ){
            keterangan ="Lulus\n";
            System.out.println(" Anda " + keterangan);
        }else {
            keterangan ="Belum Lulus\n";
            System.out.println(" Anda " + keterangan);
        }
    }
  //Fungsi
  String penilaian2(int nilai, String nama, String keterangan){
      System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
       
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        if ( nilai >= 70 ){
            keterangan =" Anda Lulus\n";
        }else {
            keterangan =" Anda Belum Lulus\n";
        }
        return keterangan;
  }
  
  //Static Prosedur
  static void penilaian3(int nilai, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        if ( nilai >= 70 ){
            keterangan ="Lulus\n";
            System.out.println(" Anda " + keterangan);
        }else {
            keterangan ="Belum Lulus\n";
            System.out.println(" Anda " + keterangan);
        }
    }
  
  //Static Fungsi
  static String penilaian4(int nilai, String nama, String keterangan){
      System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        if ( nilai >= 70 ){
            keterangan =" Anda Lulus\n";
        }else {
            keterangan =" Anda Belum Lulus\n";
        }

        return keterangan;
  }
  
}