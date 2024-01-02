/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UAS_Muzaki;


import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class Update {
     Koneksi konek = new Koneksi();
     
     public void update(String Judul, String Penulis, String Penerbit, String Tahunterbit, String Genre) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            
            String sql_Judul= "UPDATE data_buku SET Judul = '" + Judul + "' WHERE Judul = '" + Judul + "'";
            String sql_Penulis= "UPDATE data_buku SET Penulis = '" + Penulis + "' WHERE Judul = '" + Judul + "'";
            String sql_Penerbit = "UPDATE data_buku SET Penerbit = '" + Penerbit + "' WHERE Judul = '" + Judul + "'";
            String sql_Tahunterbit = "UPDATE data_buku SET TahunTerbit = '" + Tahunterbit + "' WHERE Judul = '" + Judul + "'";
            String sql_Genre = "UPDATE data_buku SET GenreBuku = '" + Genre + "' WHERE Judul = '" + Judul + "'";
            statement.executeUpdate(sql_Judul);
            statement.executeUpdate(sql_Penulis);
            statement.executeUpdate(sql_Penerbit);
            statement.executeUpdate(sql_Tahunterbit);
            statement.executeUpdate(sql_Genre);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}