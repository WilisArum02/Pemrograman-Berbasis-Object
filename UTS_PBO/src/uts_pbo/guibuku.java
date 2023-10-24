/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts_pbo;


/**
 *
 * @author HP
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Vector;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;


public class guibuku extends javax.swing.JFrame {
    
    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<BukuPOJO> dataBuku;
    
    //insert
    private int masukkanData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("INSERT INTO buku (isbn, judul_buku, tahun_terbit, penerbit) VALUES(?, ?, ?, ?)");
        pst.setString(1, isbn);
        pst.setString(2, judul_buku);
        pst.setString(3, tahun_terbit);
        pst.setString(4, penerbit);
        return pst.executeUpdate();
    }
    
    //update
    private int perbaruiData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit) throws SQLException {
    PreparedStatement pst = conn.prepareStatement("UPDATE buku SET judul_buku=?, tahun_terbit=?, penerbit=? WHERE isbn=?");
    pst.setString(4, isbn);
    pst.setString(1, judul_buku);
    pst.setString(2, tahun_terbit);
    pst.setString(3, penerbit);
    return pst.executeUpdate();
    }
    
    //delete
    private int hapusData(Connection conn, String isbn) throws SQLException {
    PreparedStatement pst = conn.prepareStatement("DELETE FROM buku WHERE isbn=?");
    pst.setString(1, isbn);
    return pst.executeUpdate();
}
    
    
    private void tampil(Connection conn) {
        dataBuku.clear();
        try {
            String sql = "select * from buku";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                BukuPOJO data = new BukuPOJO();
                data.setIsbn(String.valueOf(rs.getObject(1)));
                data.setJudulBuku(String.valueOf(rs.getObject(2)));
                data.setTahunTerbit(String.valueOf(rs.getObject(3)));
                data.setPenerbit(String.valueOf(rs.getObject(4)));
                dataBuku.add(data);
            }
            DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
            model.setRowCount(0);
            for (BukuPOJO data : dataBuku) {

                Object[] baris = new Object[4];
                baris[0] = data.getIsbn();
                baris[1] = data.getJudulBuku();
                baris[2] = data.getTahunTerbit();
                baris[3] = data.getPenerbit();

                model.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(guibuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Creates new form guibuku
     */
    private Timer refreshTimer;
    
    public guibuku() {
       try {
            dataBuku = new ArrayList<>();
        initComponents();
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Buku", "postgres", "123");
            tampil(conn);
            
        // Membuat dan mengatur timer untuk auto-refresh setiap 5 detik (5000 milidetik)
        refreshTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampil(conn);
            }
        });
        refreshTimer.start();

        } catch (SQLException ex) {
            Logger.getLogger(guibuku.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabelISBN = new javax.swing.JLabel();
        jTextFieldTahunTerbit = new javax.swing.JTextField();
        jLabelJudulBuku = new javax.swing.JLabel();
        jTextFieldJudulBuku = new javax.swing.JTextField();
        jLabelTahunTerbit = new javax.swing.JLabel();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldPenerbit = new javax.swing.JTextField();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabeljudul = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jButtonSimpan = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonUploadCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelISBN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelISBN.setText("ISBN");
        jLabelISBN.setToolTipText("");

        jTextFieldTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunTerbitActionPerformed(evt);
            }
        });

        jLabelJudulBuku.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJudulBuku.setText("Judul Buku");

        jTextFieldJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulBukuActionPerformed(evt);
            }
        });

        jLabelTahunTerbit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTahunTerbit.setText("Tahun Terbit");

        jLabelPenerbit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPenerbit.setText("Penerbit");

        jTextFieldPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbitActionPerformed(evt);
            }
        });

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jLabeljudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabeljudul.setText("DAFTAR BUKU");
        jLabeljudul.setToolTipText("");

        jTableBuku.setForeground(new java.awt.Color(51, 51, 51));
        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Tahun Terbit", "Penerbit"
            }
        ));
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableBuku);

        jButtonSimpan.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(255, 102, 102));
        jButtonUpdate.setText("Edit");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonCetak.setBackground(new java.awt.Color(255, 102, 102));
        jButtonCetak.setText("Cetak");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jButtonHapus.setBackground(new java.awt.Color(255, 102, 102));
        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonUploadCSV.setBackground(new java.awt.Color(255, 102, 102));
        jButtonUploadCSV.setText("Upload File");
        jButtonUploadCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeljudul)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelTahunTerbit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabelJudulBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTahunTerbit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPenerbit)
                            .addComponent(jButtonSimpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUploadCSV, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabeljudul, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelISBN)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJudulBuku)
                    .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTahunTerbit)
                    .addComponent(jTextFieldTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPenerbit)
                    .addComponent(jTextFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonUpdate))
                .addGap(18, 18, 18)
                .addComponent(jButtonCetak)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUploadCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunTerbitActionPerformed

    private void jTextFieldJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulBukuActionPerformed

    private void jTextFieldPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbitActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Buku", "postgres", "123");
            int row = jTableBuku.getSelectedRow();
            String tabel_klik = (jTableBuku.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM buku WHERE isbn='" + tabel_klik + "'");
            if (sql.next()) {
                String isbn = sql.getString("isbn");
                jTextFieldISBN.setText(isbn);
                String judul_buku = sql.getString("judul_buku");
                jTextFieldJudulBuku.setText(judul_buku);
                String tahun_terbit = sql.getString("tahun_terbit");
                jTextFieldTahunTerbit.setText(tahun_terbit);
                String penerbit = sql.getString("penerbit");
                jTextFieldPenerbit.setText(penerbit);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldISBN.getText().trim();
        String judul_buku = jTextFieldJudulBuku.getText();
        String tahun_terbit = jTextFieldTahunTerbit.getText();
        String penerbit = jTextFieldPenerbit.getText();

        // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = new Buku();
        b.setIsbn(isbn);
        
        if (b != null) {
        b.setJudulBuku(judul_buku);
        b.setTahunTerbit(tahun_terbit);
        b.setPenerbit(penerbit);
        entityManager.persist(b);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan.");
        }
        
        // akhir persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        String isbn = jTextFieldISBN.getText().trim();
        String judul_buku = jTextFieldJudulBuku.getText();
        String tahun_terbit = jTextFieldTahunTerbit.getText();
        String penerbit = jTextFieldPenerbit.getText();

        // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, isbn);
        
        if (b != null) {
        b.setJudulBuku(judul_buku);
        b.setTahunTerbit(tahun_terbit);
        b.setPenerbit(penerbit);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Data berhasil diedit.");
        } else {
            JOptionPane.showMessageDialog(null, "data dengan ISBN " + isbn + " gagal diedit.");
        }
        // akhir persistence
        
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        
        InputStream reportTemplate = Buku.class.getResourceAsStream("reportBuku.jrxml");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UTS_PBOPU");
        EntityManager em = emf.createEntityManager();
        List<Buku> data = em.createQuery("SELECT b FROM Buku b", Buku.class).getResultList();
        JasperReport jasperReport;
        try {
            jasperReport = JasperCompileManager.compileReport(reportTemplate);
            Map<String, Object> parameters = null;
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(data));
            JasperViewer.viewReport(jasperPrint, false);

        } catch (JRException ex) {
            ex.printStackTrace();
        } finally {

            em.close();
            emf.close();
        }
        
        
        

        
    }//GEN-LAST:event_jButtonCetakActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed

        String isbn = jTextFieldISBN.getText().trim();

        //awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, isbn);
        
        if (b != null) {
        entityManager.remove(b);
        entityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(null, "Data dengan ISBN " + isbn + " gagal dihapus.");
        }
        // akhir persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");

    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonUploadCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadCSVActionPerformed
        // TODO add your handling code here:
        
        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTS_PBOPU").createEntityManager();
        entityManager.getTransaction().begin();

                    
                    File f = filechooser.getSelectedFile();
                    String filepath = f.getPath();
                    String fi = f.getName();
                    //Parsing CSV Data
                    System.out.print(filepath);
                    DefaultTableModel csv_data = new DefaultTableModel();

                    try {

                        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                        org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                        for (CSVRecord csvRecord : csvParser) {

                        Buku b = new Buku();
                        b.setIsbn(csvRecord.get(0));
                        b.setJudulBuku(csvRecord.get(1));
                        b.setTahunTerbit(csvRecord.get(2));
                        b.setPenerbit(csvRecord.get(3));
                        entityManager.persist(b);
                        
                        }
                        
                    } catch (Exception ex) {
                        System.out.println("Error in Parsing CSV File");
                    }
                    
                    entityManager.getTransaction().commit();
        
        }
       

    
    }//GEN-LAST:event_jButtonUploadCSVActionPerformed

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
            java.util.logging.Logger.getLogger(guibuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guibuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guibuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guibuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guibuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUploadCSV;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelJudulBuku;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelTahunTerbit;
    private javax.swing.JLabel jLabeljudul;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
