/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package latihanguipbo5dan6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author arumanis
 */
public class Gui extends javax.swing.JFrame {

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<Dosen> dataDosen;
    
    //insert
    private int masukkanData(Connection conn, String nidn, String nama, String alamat, String gender) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("INSERT INTO dosen (nidn, nama, alamat, gender) VALUES(?, ?, ?, ?)");
        pst.setString(1, nidn);
        pst.setString(2, nama);
        pst.setString(3, alamat);
        pst.setString(4, gender);
        return pst.executeUpdate();
    }
    
    //update
    private int perbaruiData(Connection conn, String nidn, String nama, String alamat, String gender) throws SQLException {
    PreparedStatement pst = conn.prepareStatement("UPDATE dosen SET nama=?, alamat=?, gender=? WHERE nidn=?");
    pst.setString(4, nidn);
    pst.setString(1, nama);
    pst.setString(2, alamat);
    pst.setString(3, gender);
    return pst.executeUpdate();
    }
    
    //delete
    private int hapusData(Connection conn, String nidn) throws SQLException {
    PreparedStatement pst = conn.prepareStatement("DELETE FROM dosen WHERE nidn=?");
    pst.setString(1, nidn);
    return pst.executeUpdate();
}




    private void tampil(Connection conn) {
        dataDosen.clear();
        try {
            String sql = "select * from Dosen";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Dosen data = new Dosen();
                data.setNidn(String.valueOf(rs.getObject(1)));
                data.setNama(String.valueOf(rs.getObject(2)));
                data.setAlamat(String.valueOf(rs.getObject(3)));
                data.setGender(String.valueOf(rs.getObject(4)));
                dataDosen.add(data);
            }
            DefaultTableModel model = (DefaultTableModel) jTableDosen.getModel();
            model.setRowCount(0);
            for (Dosen data : dataDosen) {

                Object[] baris = new Object[4];
                baris[0] = data.getNidn();
                baris[1] = data.getNama();
                baris[2] = data.getAlamat();
                baris[3] = data.getGender();

                model.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    /**
     * Creates new form Gui
     */
    public Gui() {
        try {
            dataDosen = new ArrayList<>();
        initComponents();
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "123");
            tampil(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNIM = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jLabelNIDN = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jTextFieldAlamat = new javax.swing.JTextField();
        jTextFieldNIDN = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jLabelAlamat = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabelgender = new javax.swing.JLabel();
        jTextFieldGender = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDosen = new javax.swing.JTable();
        jButtonCetak = new javax.swing.JButton();
        jLabeljudul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNIM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNIM.setToolTipText("");

        jButtonUpdate.setBackground(new java.awt.Color(204, 204, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonHapus.setBackground(new java.awt.Color(204, 204, 255));
        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jLabelNIDN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNIDN.setText("NIDN");
        jLabelNIDN.setToolTipText("");

        jLabelNama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNama.setText("Nama");

        jTextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlamatActionPerformed(evt);
            }
        });

        jTextFieldNIDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIDNActionPerformed(evt);
            }
        });

        jButtonSimpan.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jLabelAlamat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAlamat.setText("Alamat");

        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });

        jLabelgender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelgender.setText("Gender");

        jTextFieldGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGenderActionPerformed(evt);
            }
        });

        jTableDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nidn", "Nama", "Alamat", "Gender"
            }
        ));
        jTableDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDosenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableDosen);

        jButtonCetak.setBackground(new java.awt.Color(255, 255, 0));
        jButtonCetak.setText("Cetak");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jLabeljudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabeljudul.setText("DAFTAR DOSEN");
        jLabeljudul.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNIDN, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelgender, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabeljudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jLabelNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGap(173, 173, 173)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelNIDN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 706, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeljudul, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNIDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNama))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlamat)
                            .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelgender))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSimpan)
                            .addComponent(jButtonUpdate)
                            .addComponent(jButtonHapus))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCetak)))
                .addContainerGap(459, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(jLabelNIM)
                    .addContainerGap(816, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabelNIDN)
                    .addContainerGap(860, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlamatActionPerformed

    private void jTextFieldNIDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIDNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIDNActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String nidn = jTextFieldNIDN.getText().trim();
        String nama = jTextFieldNama.getText();
        String alamat = jTextFieldAlamat.getText();
        String gender = jTextFieldGender.getText();
        
        if (!nidn.isEmpty() && !nama.isEmpty()) {

            try {
                // TODO add your handling code here:
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "123");
                int k = masukkanData(conn, nidn, nama, alamat, gender);
                if (k > 0) {
                    tampil(conn);
                    this.peringatan("Simpan Berhasil");
                } else {
                    this.peringatan("Simpan Gagal");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.peringatan("Input Data Dosen Gagal");
        }
        jTextFieldNIDN.setText("");
        jTextFieldNama.setText("");
        jTextFieldAlamat.setText("");
        jTextFieldGender.setText("");
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jTextFieldGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGenderActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
   
     String nidn = jTextFieldNIDN.getText().trim();
    
    if (!nidn.isEmpty()) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "123");
            int k = hapusData(conn, nidn);
            if (k > 0) {
                tampil(conn);
                this.peringatan("Hapus Data Berhasil");
            } else {
                this.peringatan("Hapus Data Gagal");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        this.peringatan("Masukkan NIDN untuk menghapus data");
    }
    jTextFieldNIDN.setText("");
    jTextFieldNama.setText("");
    jTextFieldAlamat.setText("");
    jTextFieldGender.setText("");
    




    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
                                              
    String nidn = jTextFieldNIDN.getText().trim();
    String nama = jTextFieldNama.getText();
    String alamat = jTextFieldAlamat.getText();
    String gender = jTextFieldGender.getText();
    
    if (!nidn.isEmpty() && !nama.isEmpty()) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "123");
            int k = perbaruiData(conn, nidn, nama, alamat, gender);
            if (k > 0) {
                tampil(conn);
                this.peringatan("Perbarui Data Berhasil");
            } else {
                this.peringatan("Perbarui Data Gagal");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        this.peringatan("Input Data Dosen Gagal");
    }
    jTextFieldNIDN.setText("");
    jTextFieldNama.setText("");
    jTextFieldAlamat.setText("");
    jTextFieldGender.setText("");

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTableDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDosenMouseClicked

    try {            
       Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "123");
            int row = jTableDosen.getSelectedRow();            
            String tabel_klik = (jTableDosen.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm = conn.createStatement();            
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM dosen WHERE nidn='" + tabel_klik + "'");
            if (sql.next()) {                
                String nidn = sql.getString("nidn");
                jTextFieldNIDN.setText(nidn);                
                String nama = sql.getString("nama");
                jTextFieldNama.setText(nama);                
                String alamat = sql.getString("alamat");
                jTextFieldAlamat.setText(alamat);                
                String gender = sql.getString("gender");
                jTextFieldGender.setText(gender);            
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTableDosenMouseClicked

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
     try {
            // TODO add your handling code here:
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dosen", "postgres", "123");

            String jrxmlFile = new String("src/latihanguipbo5dan6/reportDosen.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jrxmlFile);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelNIDN;
    private javax.swing.JLabel jLabelNIM;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelgender;
    private javax.swing.JLabel jLabeljudul;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDosen;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldNIDN;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}