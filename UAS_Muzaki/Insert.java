/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UAS_Muzaki;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(String Judul, String Penulis, String Penerbit, String Tahunterbit,String Genre) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            String sql = "insert into data_buku values('" + Judul + "','" + Penulis + "','" + Penerbit + "','" + Tahunterbit + "','"+ Genre +"')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
