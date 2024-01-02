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
 * @author asus
 */
public class Delete {

    Koneksi konek = new Koneksi();

    public void delete(String Judul) {

         try {
            konek.koneksi();

            // Query DELETE
            String sql = "DELETE FROM data_buku WHERE Judul = ?";

            // Menggunakan PreparedStatement
            try (PreparedStatement preparedStatement = konek.con.prepareStatement(sql)) {
                // Mengatur parameter PreparedStatement
                preparedStatement.setString(1, Judul);

                // Menjalankan query DELETE
                int rowsAffected = preparedStatement.executeUpdate();

                
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}