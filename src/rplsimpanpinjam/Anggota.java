/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rplsimpanpinjam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Mahasiswa
 */
public class Anggota extends javax.swing.JFrame {
    public DefaultTableModel tabModel;
    Connection conn;
    /**
     * Creates new form FAnggota
     */
    public Anggota() {
        initComponents();
        setJTable();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKodeAnggota = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNamaAnggota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtJenisKelamin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNoTelepon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTanggalMasuk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        BSimpan = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAnggota = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        CBCari = new javax.swing.JComboBox();
        txtCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Simpan Pinjam");

        jPanel1.setBackground(new java.awt.Color(203, 203, 81));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Sistem Informasi Koperasi Simpan Pinjam");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Form Anggota");

        jPanel2.setBackground(new java.awt.Color(208, 208, 120));

        jLabel1.setText("Kode Anggota");

        txtKodeAnggota.setEnabled(false);
        txtKodeAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeAnggotaActionPerformed(evt);
            }
        });

        BTambah.setText("Tambah Anggota");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Anggota");

        txtNamaAnggota.setEnabled(false);
        txtNamaAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaAnggotaActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis Kelamin");

        txtJenisKelamin.setEnabled(false);
        txtJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisKelaminActionPerformed(evt);
            }
        });

        jLabel3.setText("Alamat");

        txtAlamat.setEnabled(false);
        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        jLabel6.setText("No Telepon");

        txtNoTelepon.setEnabled(false);

        jLabel7.setText("Tanggal Masuk");

        txtTanggalMasuk.setEnabled(false);

        jLabel8.setText("Status");

        txtStatus.setEnabled(false);

        BSimpan.setText("Simpan");
        BSimpan.setEnabled(false);
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BEdit.setText("Edit");
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });

        BBatal.setText("Batal");
        BBatal.setEnabled(false);
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        BHapus.setText("Hapus");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BClose.setText("Close");
        BClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCloseActionPerformed(evt);
            }
        });

        TAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TAnggota);

        jLabel4.setText("Cari Berdasarkan");

        CBCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KodeAnggota", "NamaAnggota" }));

        BCari.setText("Cari");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(BSimpan)
                                        .addGap(18, 18, 18)
                                        .addComponent(BEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(BBatal)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtKodeAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                            .addComponent(txtNamaAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                            .addComponent(txtTanggalMasuk)
                                            .addComponent(txtNoTelepon)
                                            .addComponent(txtAlamat)
                                            .addComponent(txtJenisKelamin)
                                            .addComponent(txtStatus))
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BHapus)
                                        .addGap(18, 18, 18)
                                        .addComponent(BClose, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BCari)))
                        .addGap(0, 250, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSimpan)
                    .addComponent(BEdit)
                    .addComponent(BBatal)
                    .addComponent(BHapus)
                    .addComponent(BClose))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCari))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeAnggotaActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(BSimpan.getText().equalsIgnoreCase("Simpan"))
            simpanData();
        else
            rubahData();

        txtKodeAnggota.setText(""); // txtKodeAnggota Tidak Aktif
        txtNamaAnggota.setText("");   
        txtJenisKelamin.setText("");
        txtAlamat.setText("");
        txtNoTelepon.setText("");
        txtTanggalMasuk.setText("");
        txtStatus.setText("");
        
        txtKodeAnggota.setEnabled(false); 
        txtNamaAnggota.setEnabled(false);  
        txtJenisKelamin.setEnabled(false);
        txtAlamat.setEnabled(false);   
        txtNoTelepon.setEnabled(false);
        txtTanggalMasuk.setEnabled(false);
        txtStatus.setEnabled(false);

        BTambah.setEnabled(true);
        BSimpan.setEnabled(false);
        BEdit.setEnabled(true);
        BBatal.setEnabled(false);
        BHapus.setEnabled(true);
        BClose.setEnabled(true);       

    }//GEN-LAST:event_BSimpanActionPerformed

    private void txtNamaAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaAnggotaActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        // TODO add your handling code here:
              
        txtKodeAnggota.setEnabled(false); 
        txtNamaAnggota.setEnabled(true);  
        txtJenisKelamin.setEnabled(false);
        txtAlamat.setEnabled(true);   
        txtNoTelepon.setEnabled(true);
        txtTanggalMasuk.setEnabled(false);
        txtStatus.setEnabled(true);

        BSimpan.setText("Update"); 

        BTambah.setEnabled(false);
        BSimpan.setEnabled(true);
        BEdit.setEnabled(false);
        BBatal.setEnabled(true);
        BHapus.setEnabled(false);
        BClose.setEnabled(false);

        // Memanggil Method  ambilData_dari_JTable()
        ambilData_dari_JTable();

    }//GEN-LAST:event_BEditActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
               hapus_Data(); 
    }//GEN-LAST:event_BHapusActionPerformed

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
                String sql;
        int pilih = CBCari.getSelectedIndex();
        String cari = txtCari.getText();
    try {
        conn.close();
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:rplsimpanpinjam");
        if(pilih==0)
        sql ="Select * from Anggota WHERE KodeAnggota ='" +txtCari.getText() + "'";
        else
        sql ="Select * from Anggota WHERE NamaAnggota Like '%" +txtCari.getText() + "%'";

        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs =st.executeQuery();

        hapusIsiJTable();
        int no=0;
        while (rs.next()) {
            no++;

          String KodeAnggota=rs.getString("KodeAnggota");
         String NamaAnggota=rs.getString("NamaAnggota");
         String JenisKelamin=rs.getString("JenisKelamin");
         String Alamat=rs.getString("Alamat");
         String NoTelepon=rs.getString("NoTelepon");
         String TanggalMasuk=rs.getString("TanggalMasuk");
         String Status=rs.getString("Status");
             Object [] data = {no,KodeAnggota,NamaAnggota,JenisKelamin,Alamat,NoTelepon,TanggalMasuk,Status};
             tabModel.addRow(data);
        }

         if(tabModel.getRowCount()>0)         
           JOptionPane.showMessageDialog(this,"Data Ditemukan ");        
        else
            JOptionPane.showMessageDialog(this,"Data Tidak Ditemukan.. ");

      }
      catch (ClassNotFoundException se) {}  // Silahkan tambahkan sendiri informasi eksepsi
      catch (SQLException se) {} 
 // Akhir Event

    }//GEN-LAST:event_BCariActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        txtKodeAnggota.setText(""); // txtKodeAnggota Tidak Aktif
        txtNamaAnggota.setText("");        // txtNamaAnggota          Aktif
        txtAlamat.setText("");

       // Mengatur  Enable Tombol Dan Textfield  
        txtKodeAnggota.setEnabled(false);
        txtNamaAnggota.setEnabled(false);
        txtAlamat.setEnabled(false);

        BTambah.setEnabled(true);
        BSimpan.setEnabled(false);
        BEdit.setEnabled(true);
        BBatal.setEnabled(false);
        BHapus.setEnabled(true);
        BClose.setEnabled(true);

    }//GEN-LAST:event_BBatalActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
                 // Mengatur  Enable Tombol Dan Textfield  
        txtKodeAnggota.setEnabled(true);
        txtNamaAnggota.setEnabled(true);
        txtJenisKelamin.setEnabled(true);
        txtAlamat.setEnabled(true);
        txtNoTelepon.setEnabled(true);
        txtTanggalMasuk.setEnabled(true);
        txtStatus.setEnabled(true);
        BSimpan.setText("Simpan");

        BTambah.setEnabled(false);
        BSimpan.setEnabled(true);
        BEdit.setEnabled(false);
        BBatal.setEnabled(true);
        BHapus.setEnabled(false);
        BClose.setEnabled(false);

    }//GEN-LAST:event_BTambahActionPerformed

    private void BCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCloseActionPerformed
        // TODO add your handling code here:
   int selectedOption = JOptionPane.showConfirmDialog(null,
 "Apakah anda akan menutup form anggota?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
 if (selectedOption == JOptionPane.YES_OPTION) {
 dispose();
 }
    }//GEN-LAST:event_BCloseActionPerformed

    private void txtJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisKelaminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BCari;
    private javax.swing.JButton BClose;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JComboBox CBCari;
    private javax.swing.JTable TAnggota;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJenisKelamin;
    private javax.swing.JTextField txtKodeAnggota;
    private javax.swing.JTextField txtNamaAnggota;
    private javax.swing.JTextField txtNoTelepon;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTanggalMasuk;
    // End of variables declaration//GEN-END:variables

    private void getData(){
  Connection conn;    // import java.sql.connection
  try{
       
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:rplsimpanpinjam");  
        String sql="Select * from Anggota";
        PreparedStatement st=conn.prepareStatement(sql);  
        ResultSet rs=st.executeQuery();  
        String KodeAnggota,NamaAnggota,JenisKelamin,Alamat,NoTelepon,TanggalMasuk,Status;
        int no=0;
        while(rs.next()){
         no=no+1;
         KodeAnggota=rs.getString("KodeAnggota");
         NamaAnggota=rs.getString("NamaAnggota");
         JenisKelamin=rs.getString("JenisKelamin");
         Alamat=rs.getString("Alamat");
         NoTelepon=rs.getString("NoTelepon");
         TanggalMasuk=rs.getString("TanggalMasuk");
         Status=rs.getString("Status");
         Object Data[]={no,KodeAnggota,NamaAnggota,JenisKelamin,Alamat,NoTelepon,TanggalMasuk,Status};
         tabModel.addRow(Data);
        }
          // Tutup Koneksi
          st.close();
          conn.close();
    }
    catch (ClassNotFoundException cnfe) {         // Ketika Gagal Memanggil Driver
           System.out.println("Class Driver tidak ditemukan.. : " + cnfe);
           System.exit(0);
    }
    catch (SQLException sqle) {                   // Ketika Gagal Sql   // import java.sql.SQLException
           System.out.println("Proses Query Gagal = " + sqle);
           System.exit(0);
    }
    catch(Exception e){
           System.out.println("Koneksi Access Gagal " +e.getMessage());
           System.exit(0);
    }

    }    // Akhir Method getData

    private void setJTable(){
    String [] JudulKolom={"No","KodeAnggota","NamaAnggota","JenisKelamin","Alamat","NoTelepon","TanggalMasuk","Status"};
    tabModel = new DefaultTableModel(null, JudulKolom){
                  boolean[] canEdit = new boolean [] { false, false, false, false, false, false, false };
                  @Override
                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit [columnIndex];
                  }
              };
    TAnggota.setModel(tabModel);
    TAnggota.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    TAnggota.getColumnModel().getColumn(0).setPreferredWidth(30);
    TAnggota.getColumnModel().getColumn(1).setPreferredWidth(100);
    TAnggota.getColumnModel().getColumn(2).setPreferredWidth(100);
    TAnggota.getColumnModel().getColumn(3).setPreferredWidth(50);
    TAnggota.getColumnModel().getColumn(4).setPreferredWidth(100);
    TAnggota.getColumnModel().getColumn(5).setPreferredWidth(100);
    TAnggota.getColumnModel().getColumn(6).setPreferredWidth(80);
    TAnggota.getColumnModel().getColumn(7).setPreferredWidth(100);
    getData();
}
void ambilData_dari_JTable() {
    int row = TAnggota.getSelectedRow();

    // Mengambil data yang dipilih pada JTable
    String KodeAnggota = tabModel.getValueAt(row, 1).toString();
    String NamaAnggota = tabModel.getValueAt(row, 2).toString();
    String JenisKelamin = tabModel.getValueAt(row, 3).toString();
    String Alamat = tabModel.getValueAt(row, 4).toString();
    String NoTelepon = tabModel.getValueAt(row, 5).toString();
    String TanggalMasuk = tabModel.getValueAt(row, 6).toString();
    String Status = tabModel.getValueAt(row, 7).toString();
    
    txtKodeAnggota.setText(KodeAnggota);
    txtNamaAnggota.setText(NamaAnggota);
    txtJenisKelamin.setText(JenisKelamin);
    txtAlamat.setText(Alamat);
    txtNoTelepon.setText(NoTelepon);
    txtTanggalMasuk.setText(TanggalMasuk);
    txtStatus.setText(Status);
  }

// Method Untuk Menghapus Semua Isi JTable
public void hapusIsiJTable() {
    int row = tabModel.getRowCount();
    for (int i = 0; i < row; i++) {
      tabModel.removeRow(0);
    }
  }
//  Method Untuk Menampilkan Data dari tabel Anggota Ke JTable
public void tampilDataKeJTable() {
    hapusIsiJTable();
    try {
        conn.close();
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:rplsimpanpinjam");   // import java.sql.DriverManager
        String sql="Select * from Anggota";
        PreparedStatement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        String KodeAnggota,NamaAnggota,JenisKelamin,Alamat,NoTelepon,TanggalMasuk,Status;
        int no=0;
        while(rs.next()){
         no=no+1;
         KodeAnggota=rs.getString("KodeAnggota");
         NamaAnggota=rs.getString("NamaAnggota");
         JenisKelamin=rs.getString("JenisKelamin");
         Alamat=rs.getString("Alamat");
         NoTelepon=rs.getString("NoTelepon");
         TanggalMasuk=rs.getString("TanggalMasuk");
         Status=rs.getString("Status");
         Object Data[]={no,KodeAnggota,NamaAnggota,JenisKelamin,Alamat,NoTelepon,TanggalMasuk,Status};
         tabModel.addRow(Data);
      }
  }
    catch (Exception e) {}
}

public void rubahData() {
    // Konfirmasi sebelum melakukan perubahan data
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Mengubah Data\n Dengan Kode Anggota = '" + txtKodeAnggota.getText() +
        "'", "Konfirmasi ",JOptionPane.YES_NO_OPTION);
    // Apabila tombol Yes ditekan
    if (ok == 0) {
      try {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:rplsimpanpinjam");
        String sql ="UPDATE Anggota SET NamaAnggota = ?, Alamat= ?, NoTelepon= ?, Status=? WHERE KodeAnggota = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        try {
          st.setString(1, txtNamaAnggota.getText());
          st.setString(2, txtAlamat.getText());
          st.setString(3, txtNoTelepon.getText());
          st.setString(4, txtStatus.getText());
          st.setString(5, txtKodeAnggota.getText());
          st.executeUpdate();
         // Memanggil Method   tampilDataKeJTable();
          tampilDataKeJTable();
        txtKodeAnggota.setText(""); // txtKodeAnggota Tidak Aktif
        txtNamaAnggota.setText("");   
        txtJenisKelamin.setText("");
        txtAlamat.setText("");
        txtNoTelepon.setText("");
        txtTanggalMasuk.setText("");
        txtStatus.setText("");
        } catch (SQLException se) { }     // Silahkan tambahkan Sendiri informasi Eksepsi
      } catch (ClassNotFoundException se) {} // Silahkan tambahkan Sendiri informasi Eksepsi
      catch (SQLException se) {}  // Silahkan tambahkan Sendiri informasi Eksepsi
    }  
  }

public void simpanData(){
//Connection conn;
     try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn=DriverManager.getConnection("jdbc:odbc:rplsimpanpinjam");
            String sql="Insert into Anggota values(?,?,?,?,?,?,?)";
            PreparedStatement st=conn.prepareStatement(sql);
                st.setString(1, txtKodeAnggota.getText());
                st.setString(2, txtNamaAnggota.getText());
                 st.setString(3, txtJenisKelamin.getText());
                st.setString(4, txtAlamat.getText());
                 st.setString(5, txtNoTelepon.getText());
                  st.setString(6, txtTanggalMasuk.getText());
                   st.setString(7, txtStatus.getText());
            int rs=st.executeUpdate();

            if(rs>0){
            JOptionPane.showMessageDialog(this,"Input Berhasil");
      	    tampilDataKeJTable();
            }
            st.close();
            conn.close();
        }
        catch (ClassNotFoundException cnfe) {
           System.out.println("Class Driver tidak ditemukan.. : " + cnfe);
        }
        catch (SQLException sqle) {
           System.out.println("Input  Gagal = " + sqle.getMessage());
        }
        catch(Exception e){
           System.out.println("Koneksi Gagal " +e.getMessage());
        }
  }

public void hapus_Data() {
    // Konfirmasi sebelum melakukan penghapusan data
    ambilData_dari_JTable();
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Menghapus Data\nDengan Kode Anggota = '" + txtKodeAnggota.getText() +
        "'", "Konfirmasi Menghapus Data",JOptionPane.YES_NO_OPTION);
    if (ok == 0) {     // Apabila tombol OK ditekan
      try {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       conn=DriverManager.getConnection("jdbc:odbc:rplsimpanpinjam");
        String sql = "DELETE FROM Anggota WHERE KodeAnggota = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, txtKodeAnggota.getText());
        int rs=st.executeUpdate();
        if(rs>0){
        tampilDataKeJTable();
        JOptionPane.showMessageDialog(this,"Data Sudah dihapus");
        }
        txtKodeAnggota.setText(""); // txtKodeAnggota Tidak Aktif
        txtNamaAnggota.setText("");   
        txtJenisKelamin.setText("");
        txtAlamat.setText("");
        txtNoTelepon.setText("");
        txtTanggalMasuk.setText("");
        txtStatus.setText("");
      } catch (Exception se) {  // Silahkan tambahkan catch Exception yang lain
         JOptionPane.showMessageDialog(this,"Gagal Hapus Data.. ");
       }
    }
  }

 
}
