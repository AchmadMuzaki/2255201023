package UAS_Muzaki;

import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.AbstractButton;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author asus
 */
public class UAS_Muzaki extends javax.swing.JFrame {
    
   
    
    

    /**
     * Creates new form TugassGUI
     */
    public UAS_Muzaki() {
        initComponents();
        this.setTitle("Aplikasi data Perpustakaan");
        this.setLocationRelativeTo(this);

        Koneksi konek = new Koneksi();
        konek.koneksi();
        this.statuskoneksi.setText(konek.statuskoneksi);
        ButtonGroup bG = new ButtonGroup();
        bG.add(in_Fiksi);
        bG.add(in_NonFiksi);
        
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldatabuku = new javax.swing.JTable();
        Pilih = new javax.swing.JComboBox<>();
        Pencarian = new javax.swing.JTextField();
        caridata = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        in_Judul = new javax.swing.JTextField();
        in_Penulis = new javax.swing.JTextField();
        in_Penerbit = new javax.swing.JTextField();
        in_TahunTerbit = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        in_Fiksi = new javax.swing.JRadioButton();
        in_NonFiksi = new javax.swing.JRadioButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        statuskoneksi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabeldatabuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul", "Penulis", "Penerbit", "Tahun Terbit", "Genre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabeldatabuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldatabukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldatabuku);

        Pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  PENCARIAN", "Judul", "Penulis", "Penerbit", "Tahun Terbit", "Genre" }));
        Pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihActionPerformed(evt);
            }
        });

        caridata.setText("Cari");
        caridata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caridataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(caridata)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caridata))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daftar Buku", jPanel1);

        jLabel2.setText("Judul");

        jLabel3.setText("Penulis");

        jLabel4.setText("Penerbit");

        jLabel5.setText("Tahun Terbit");

        in_Penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_PenulisActionPerformed(evt);
            }
        });

        in_Penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_PenerbitActionPerformed(evt);
            }
        });

        in_TahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_TahunTerbitActionPerformed(evt);
            }
        });

        Insert.setText("Tambah Buku");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        jLabel7.setText("Genre Buku");

        in_Fiksi.setText("Fiksi");
        in_Fiksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_FiksiActionPerformed(evt);
            }
        });

        in_NonFiksi.setText("Non Fiksi");

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Hapus");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Reset.setText("Refresh");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete)
                    .addComponent(Update))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(in_Fiksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(in_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(in_Penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(in_TahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(in_Penulis, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(in_NonFiksi)
                                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_Penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_Penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_TahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Reset)
                        .addComponent(Delete)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(in_Fiksi)
                        .addComponent(in_NonFiksi)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Update))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah/Edit Buku", jPanel2);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel1.setText("Perpustakaan Tadika Mesra");

        jLabel6.setText("Status Koneksi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statuskoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statuskoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Statement pst;
    ResultSet rs;

    public void table() {
        Koneksi konek = new Koneksi();
        konek.koneksi();
        try {

            String sql = "select * from data_buku";
            pst =konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabeldatabuku.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
     public void selectByjudul(String Judul){
        Koneksi konek = new Koneksi();
        konek.koneksi();
        
        try{
            String sql = "select * from data_buku where Judul like '%" + Judul + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabeldatabuku.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void selectBypenulis(String Penulis){
        Koneksi konek = new Koneksi();
        konek.koneksi();
        
        try{
            String sql = "select * from data_buku where Penulis like '%" + Penulis + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabeldatabuku.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void selectBypenerbit(String Penerbit){
        Koneksi konek = new Koneksi();
        konek.koneksi();
        
        try{
            String sql = "select * from data_buku where Penerbit like '%" + Penerbit + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabeldatabuku.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void selectBytahunterbit(String tahunterbit){
        Koneksi konek = new Koneksi();
        konek.koneksi();
        
        try{
            String sql = "select * from data_buku where TahunTerbit like '%" + tahunterbit + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabeldatabuku.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void selectBygenre(String Genre){
        Koneksi konek = new Koneksi();
        konek.koneksi();
        
        try{
            String sql = "select * from data_buku where GenreBuku like '%" + Genre + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabeldatabuku.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }



    private void in_PenulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_PenulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_PenulisActionPerformed

    private void in_PenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_PenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_PenerbitActionPerformed

    private void in_TahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_TahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_TahunTerbitActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:

        String Jenis = "";
        if (in_Fiksi.isSelected()) {
            Jenis = "Fiksi";
        } else if (in_NonFiksi.isSelected()) {
            Jenis = "Non Fiksi";
        }

        Insert in = new Insert();
        String Judul = in_Judul.getText();
        String Penulis = in_Penulis.getText();
        String Penerbit = in_Penerbit.getText();
        String Tahunterbit = in_TahunTerbit.getText();

        in.insert(Judul, Penulis, Penerbit, Tahunterbit, Jenis);
        table();

    }//GEN-LAST:event_InsertActionPerformed

    private void in_FiksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_FiksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_FiksiActionPerformed

    private void tabeldatabukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldatabukuMouseClicked
        // TODO add your handling code here:
        int selectedRow = tabeldatabuku.getSelectedRow();
        
        TableModel model = tabeldatabuku.getModel();
        in_Judul.setText(model.getValueAt(selectedRow, 0).toString());
        in_Penulis.setText(model.getValueAt(selectedRow, 1).toString());
        in_Penerbit.setText(model.getValueAt(selectedRow, 2).toString());
        in_TahunTerbit.setText(model.getValueAt(selectedRow, 3).toString());
        String Jenis = model.getValueAt(selectedRow, 4).toString();
            if(Jenis.equals("Fiksi")){
                in_Fiksi.setSelected(true);
            } else if (Jenis.equals("Non Fiksi")){
                in_NonFiksi.setSelected(true);
            }
    }//GEN-LAST:event_tabeldatabukuMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:  
        Koneksi konek = new Koneksi();
        konek.koneksi();
        Delete del = new Delete();
        del.delete(in_Judul.getText());
        
        table();
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        Koneksi konek = new Koneksi();
        konek.koneksi();
                                                                        
        Update up = new Update();
        String Judul = in_Judul.getText();
        String Penulis = in_Penulis.getText();
        String Penerbit = in_Penerbit.getText();
        String Tahunterbit = in_TahunTerbit.getText();
        String Jenis = "";
        
        if (in_Fiksi.isSelected()) {
            Jenis = "Fiksi";
        } else if (in_NonFiksi.isSelected()) {
            Jenis = "NonFiksi";
       
        }
        up.update(Judul, Penulis, Penerbit, Tahunterbit, Jenis);
        
        table();
    }//GEN-LAST:event_UpdateActionPerformed

    private void caridataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caridataActionPerformed
        // TODO add your handling code here:
        if(Pilih.getSelectedIndex() == 1){
            selectByjudul(Pencarian.getText());
        } else if (Pilih.getSelectedIndex() == 2){
            selectBypenulis(Pencarian.getText());
        } else if (Pilih.getSelectedIndex() == 3){
            selectBypenerbit(Pencarian.getText());
        } else if (Pilih.getSelectedIndex() == 4){
            selectBytahunterbit(Pencarian.getText());
        } else if (Pilih.getSelectedIndex() == 5){
            
            String Jenis = "";
            if(in_Fiksi.isSelected()){
                Jenis = "Fiksi";
            }  else if (in_NonFiksi.isSelected()) {
               Jenis = "NonFiksi";
            } 
            
            selectBygenre(Pencarian.getText());
            
      } else{
            table();}
    }//GEN-LAST:event_caridataActionPerformed

    private void PilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PilihActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        in_Judul.setText("");
        in_Penulis.setText("");
        in_Penerbit.setText("");
        in_TahunTerbit.setText("");

        ButtonGroup bG = new ButtonGroup();
        bG.add(in_Fiksi);
        bG.add(in_NonFiksi);
        
        bG.clearSelection();
        
        table();

    }//GEN-LAST:event_ResetActionPerformed
            public static void main (String args[]){
                
            
    /**
     * @param args the command line arguments
     */
 
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UAS_Muzaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UAS_Muzaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UAS_Muzaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UAS_Muzaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UAS_Muzaki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField Pencarian;
    private javax.swing.JComboBox<String> Pilih;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Update;
    private javax.swing.JButton caridata;
    private javax.swing.JRadioButton in_Fiksi;
    private javax.swing.JTextField in_Judul;
    private javax.swing.JRadioButton in_NonFiksi;
    private javax.swing.JTextField in_Penerbit;
    private javax.swing.JTextField in_Penulis;
    private javax.swing.JTextField in_TahunTerbit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField statuskoneksi;
    private javax.swing.JTable tabeldatabuku;
    // End of variables declaration//GEN-END:variables
}
