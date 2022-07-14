/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lucky
 */
public class FormNilaiMhs extends javax.swing.JFrame {

    /**
     * Creates new form FormNilaiMhs
     */
    DefaultTableModel tabel1;
    Object[] list_mhs = new Object[9];
    int x = 0; // counter
    DBConnection dbConn = new DBConnection();
    Connection con = dbConn.getConnection();
    
    public FormNilaiMhs() throws SQLException {
        initComponents();
        
        tabel1 = new DefaultTableModel();
        tabel.setModel(tabel1); // tabel nama table GUI
        // siapkan array yg akan dimasukkan ke table
        tabel1.addColumn("No");
        tabel1.addColumn("Nim");
        tabel1.addColumn("Nama");
        tabel1.addColumn("UTS 35%");
        tabel1.addColumn("UAS 35%");
        tabel1.addColumn("Tugas 30%");
        tabel1.addColumn("N. Akhir");
        tabel1.addColumn("N. Huruf");
        
        setResizable(false); // tdk dpt diperbesar
        // tdk bisa diketik
        nUTS1.setEditable(false);
        nUAS1.setEditable(false);
        nTugas1.setEditable(false);
        nUTS2.setEditable(false);
        nUAS2.setEditable(false);
        nTugas2.setEditable(false);
        // tdk bisa diklik
        simpan.setEnabled(false);
        update.setEnabled(false);
        hapus.setEnabled(false);
        proses1.setEnabled(false);
        
        tampilkanDiTabel();
    }

    public ArrayList[] getMhsList() throws SQLException{
        // mendapatkan data dari tb dan disimpan di arraylist
        String queryCount = "SELECT COUNT(*) AS c FROM mhs";
        Statement st;
        ResultSet rsCount, rs;
        st = con.createStatement();
        rsCount = st.executeQuery(queryCount);
        int sizeTable = 0;
        while (rsCount.next()) {
            sizeTable = rsCount.getInt("c");
            // panggil alias c dari querycount
        }
        ArrayList[] mhsList = new ArrayList[sizeTable];
        // membuat arraylist dengan size sebanyak data di db
        String query = "SELECT * FROM mhs";
        rs = st.executeQuery(query);
        int x = 0;
        while (rs.next()) {
            mhsList[x] = new ArrayList<>();
            mhsList[x].add(rs.getString("nim"));
            mhsList[x].add(rs.getString("nama"));
            mhsList[x].add(rs.getString("nilai_uts"));
            mhsList[x].add(rs.getString("nilai_uas"));
            mhsList[x].add(rs.getString("nilai_tugas"));
            mhsList[x].add(rs.getString("nilai_akhir"));
            mhsList[x].add(rs.getString("nilai_huruf"));
            mhsList[x].add(rs.getString("predikat"));
            x++;
        }
        return mhsList;
    }
    
    public void tampilkanDiTabel() throws SQLException{
        ArrayList[] list = getMhsList();
        // sebelum lanjut, buat fungsi getMhsList dulu
        DefaultTableModel model = (DefaultTableModel)tabel.getModel();
        
        Object[] row = new Object[9];
        for(int i=0; i<list.length; i++){
            row[0] = i+1;
            row[1] = list[i].get(0);
            row[2] = list[i].get(1);
            row[3] = list[i].get(2);
            row[4] = list[i].get(3);
            row[5] = list[i].get(4);
            row[6] = list[i].get(5);
            row[7] = list[i].get(6);
            row[8] = list[i].get(7);
            
            model.addRow(row);
        }
    }
    
    public void kosongkanTextField(){
        NIM.setText(""); nama.setText("");
        nUTS.setText(""); nUAS.setText(""); nTugas.setText("");
        nUTS1.setText(""); nUAS1.setText(""); nTugas1.setText("");
        nUTS2.setText(""); nUAS2.setText(""); nTugas2.setText("");
    }
    
    public void prosesHitungNilai(){
        try{
            String ni = NIM.getText();
            String na = nama.getText();
            Double ts = Double.parseDouble(nUTS.getText());
            Double as = Double.parseDouble(nUAS.getText());
            Double tgs = Double.parseDouble(nTugas.getText());

            Mhs m = new Mhs(ni, na, ts, as, tgs);
            nUTS1.setText(""+m.uts()); nUAS1.setText(""+m.uas());
            // m.uts kan Double, sedangkan textField itu String
            // maka diberi "" agar terdetek String
            nTugas1.setText(""+m.tugas());
            nUTS2.setText(""+m.nilaiAkhir());
            nUAS2.setText(""+m.getNilHuruf(m.nilaiAkhir()));
            nTugas2.setText(""+m.getPredikat(m.getNilHuruf(m.nilaiAkhir())));
            simpan.setEnabled(true);
        } catch(NumberFormatException e){
            // jika ada text field yang belum terisi
            JOptionPane.showMessageDialog(null, "Inputan anda kosong", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void kosongkanTabel(){
        DefaultTableModel model = (DefaultTableModel)this.tabel.getModel();
        model.setRowCount(0);
    }
    
    public void terpilih(int index) throws SQLException{
        ArrayList[] list = getMhsList();
        NIM.setText((String) list[index].get(0));
        nama.setText((String) list[index].get(1));
        nUTS.setText((String) list[index].get(2).toString()); // karena dia Double
        nUAS.setText((String) list[index].get(3).toString());
        nTugas.setText((String) list[index].get(4).toString());
        
        proses.setEnabled(false);
        simpan.setEnabled(false);
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        NIM = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nUTS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nUAS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nTugas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        proses = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        tambahLain = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        hapus = new javax.swing.JButton();
        update = new javax.swing.JButton();
        proses1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nUTS1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nUAS1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nTugas1 = new javax.swing.JTextField();
        nTugas2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nUAS2 = new javax.swing.JTextField();
        nUTS2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Nilai Mahasiswa");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Form Nilai Mahasiswa");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NIM");

        NIM.setText(" ");

        nama.setText(" ");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama");

        nUTS.setText(" ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nilai UTS");

        nUAS.setText(" ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nilai UAS");

        nTugas.setText(" ");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nilai Tugas");

        proses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_intelligence_50px.png"))); // NOI18N
        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_downloading_updates_50px_2.png"))); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        tambahLain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_new_copy_50px.png"))); // NOI18N
        tambahLain.setText("Tambah Lain");
        tambahLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahLainActionPerformed(evt);
            }
        });

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_logout_rounded_up_50px.png"))); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_trash_50px_1.png"))); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_refresh_50px.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        proses1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_intelligence_50px.png"))); // NOI18N
        proses1.setText("Proses");
        proses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proses1ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("UTS 35%");

        nUTS1.setText(" ");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("UAS 35%");

        nUAS1.setText(" ");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tugas 30%");

        nTugas1.setText(" ");

        nTugas2.setText(" ");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nilai Huruf");

        nUAS2.setText(" ");

        nUTS2.setText(" ");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Predikat");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nilai Akhir");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_print_50px_1.png"))); // NOI18N
        cetak.setText("Cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nUTS, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(nUAS, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(nUTS2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(25, 25, 25)
                                .addComponent(nUAS2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nTugas2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(nUTS1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(nUAS1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(nTugas1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1)))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(proses)
                                .addGap(18, 18, 18)
                                .addComponent(simpan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(proses1)
                                .addGap(18, 18, 18)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tambahLain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keluar)
                    .addComponent(cetak))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(nTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proses)
                            .addComponent(simpan)
                            .addComponent(tambahLain))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proses1)
                            .addComponent(update)
                            .addComponent(hapus)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(keluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cetak)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nUTS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nUAS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(nTugas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nUTS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(nUAS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(nTugas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahLainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahLainActionPerformed
        kosongkanTextField();
        proses.setEnabled(true);
        
        nUTS1.setEnabled(false); nUAS1.setEnabled(false); nTugas1.setEnabled(false);
        nUTS2.setEnabled(false); nUAS2.setEnabled(false); nTugas2.setEnabled(false);
        
        simpan.setEnabled(false); update.setEnabled(false);
        hapus.setEnabled(false); proses1.setEnabled(false);
    }//GEN-LAST:event_tambahLainActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("DELETE FROM mhs WHERE nim=?");
            ps.setString(1, NIM.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
        
        kosongkanTextField();
        kosongkanTabel();
        try {
            tampilkanDiTabel();
        } catch (SQLException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        simpan.setEnabled(false); update.setEnabled(false);
        hapus.setEnabled(false); proses1.setEnabled(false);
    }//GEN-LAST:event_hapusActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        prosesHitungNilai();
    }//GEN-LAST:event_prosesActionPerformed

    private void proses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proses1ActionPerformed
        prosesHitungNilai();
        update.setEnabled(true);
        simpan.setEnabled(false);
    }//GEN-LAST:event_proses1ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int index = tabel.getSelectedRow();
        try {
            terpilih(index);
        } catch (SQLException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        proses1.setEnabled(true);
        hapus.setEnabled(true);
    }//GEN-LAST:event_tabelMouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO mhs(nim, nama, nilai_uts, nilai_uas, nilai_tugas, nilai_akhir, nilai_huruf, predikat) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, NIM.getText()); ps.setString(2, nama.getText());
            ps.setString(3, nUTS.getText()); ps.setString(4, nUAS.getText());
            ps.setString(5, nTugas.getText());
            ps.setString(6, nUTS2.getText()); ps.setString(7, nUAS2.getText());
            ps.setString(8, nTugas2.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data tersimpan");
        } catch (SQLException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data tidak tersimpan");
        }
        
        kosongkanTextField();
        kosongkanTabel();
        try {
            tampilkanDiTabel();
        } catch (SQLException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String updateQuery = null;
        PreparedStatement ps = null;
        
        updateQuery = "UPDATE mhs SET nim=?, nama=?, nilai_uts=?, nilai_uas=?, nilai_tugas=?, nilai_akhir=?, nilai_huruf=?, predikat=? WHERE nim=?";
        
        try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, NIM.getText()); ps.setString(2, nama.getText());
            ps.setString(3, nUTS.getText()); ps.setString(4, nUAS.getText());
            ps.setString(5, nTugas.getText());
            ps.setString(6, nUTS2.getText()); ps.setString(7, nUAS2.getText());
            ps.setString(8, nTugas2.getText());
            ps.setString(9, NIM.getText()); // nim jangan digonta-ganti ya
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch (SQLException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal diupdate");
        }
        
        kosongkanTextField();
        kosongkanTabel();
        try {
            tampilkanDiTabel();
        } catch (SQLException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        try {
            String path = "G:\\Coding\\SIAKAD\\Siakad\\src\\siakad\\reportMhs.jasper";
            JasperReport reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, con);
            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cetakActionPerformed

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
            java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormNilaiMhs().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIM;
    private javax.swing.JButton cetak;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nTugas;
    private javax.swing.JTextField nTugas1;
    private javax.swing.JTextField nTugas2;
    private javax.swing.JTextField nUAS;
    private javax.swing.JTextField nUAS1;
    private javax.swing.JTextField nUAS2;
    private javax.swing.JTextField nUTS;
    private javax.swing.JTextField nUTS1;
    private javax.swing.JTextField nUTS2;
    private javax.swing.JTextField nama;
    private javax.swing.JButton proses;
    private javax.swing.JButton proses1;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambahLain;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
