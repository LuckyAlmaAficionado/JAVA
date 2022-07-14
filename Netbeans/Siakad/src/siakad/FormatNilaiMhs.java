/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siakad;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucky
 */
public class FormatNilaiMhs extends javax.swing.JFrame {

    /**
     * Creates new form FormatNilaiMhs
     */
    DefaultTableModel tabel1;
    Object[] list_mhs = new Object[9];
    int x = 0;
    DBConnection dbConn = new DBConnection();
    Connection con = dbConn.getConnection();
    
    public FormatNilaiMhs() throws SQLException {
        initComponents();
        tabel1 = new DefaultTableModel();
        tabel.setModel(tabel1);
        //siapkan array yang akan dimaksukan ke table
        tabel1.addColumn("No");
        tabel1.addColumn("Nim");
        tabel1.addColumn("Nama");
        tabel1.addColumn("Uts 35%");
        tabel1.addColumn("Uas 35%");
        tabel1.addColumn("Tugas 30%");
        tabel1.addColumn("N. Akhir");
        tabel1.addColumn("N. Huruf");
        setResizable(false); // layout tidak bisa diperbesar
//        Tidak bisa diketik
        txt_uts.setEditable(false);
        txt_uas.setEditable(false);
        txt_tugas.setEditable(false);
        txt_uts1.setEditable(false);
        txt_uas1.setEditable(false);
        txt_tugas1.setEditable(false);
    
//        Tidak bisa di Click
        btn_simpan.setEnabled(false);
        btn_update.setEnabled(false);
        btn_hapus.setEnabled(false);
        btn_proses1.setEnabled(false);
        
        tampilkanDiTabel();
    }
    
    public void tampilkanDiTabel() throws SQLException
    {
        ArrayList[] list = getMhsList();
//        sebelum lanjut, buat void getMhsList dulu
        DefaultTableModel model = (DefaultTableModel)tabel.getModel();
    
        Object[] row = new Object[9];
        for (int i = 0; i < list.length; i++) {
            row[0] = i+1;
            row[1] = list[0].get(0);
            row[2] = list[0].get(1);
            row[3] = list[0].get(2);
            row[4] = list[0].get(3);
            row[5] = list[0].get(4);
            row[6] = list[0].get(5); 
            row[7] = list[0].get(6);
            
            model.addRow(row);
        }
    }
    
    public ArrayList[] getMhsList() throws SQLException
    {
//        Tujuan: mendaparkan data dari database dan disimpan ke arraylist
        String queryCount = "SELECT COUNT(*) AS c FROM mhs";
        Statement st;
        ResultSet rsCount, rs;
        st = con.createStatement();
        rsCount = st.executeQuery(queryCount);
        int sizeTable = 0;
        while(rsCount.next()){
            sizeTable = rsCount.getInt("c");
//            Panggil  alias c dari queryCount
        }
        ArrayList[] mhsList = new ArrayList[sizeTable];
//        Membuat array list sebanyak yang di database

        String query = "SELECT * FROM mhs";
        rs = st.executeQuery(query);
        int x = 0;
        while(rs.next()){
            mhsList[x] = new ArrayList<>();
            mhsList[x].add(rs.getString("nim"));
            mhsList[x].add(rs.getString("nama"));
            mhsList[x].add(rs.getString("nilai_uts"));
            mhsList[x].add(rs.getString("nilai_uas"));
            mhsList[x].add(rs.getString("nilai_tugas"));
            mhsList[x].add(rs.getString("nilai_akhir"));
            mhsList[x].add(rs.getString("nilai_huruf"));
        }
        return mhsList;
    }
    
    public void kosongkanTextField()
    {
        txt_nim.setText(""); 
        txt_nama.setText("");
        txt_uts.setText("");
        txt_uas.setText("");
        txt_tugas.setText("");
        txt_uts1.setText("");
        txt_uas1.setText("");
        txt_tugas1.setText("");
        txt_nAkhir.setText("");
        txt_uas2.setText("");
        txt_tugas2.setText("");
    }
    
    public void prosesHitungNilai()
    {
        try{
            String ni = txt_nim.getText();
            String na = txt_nama.getText();
            Double ts = Double.parseDouble(txt_uts.getText());
            Double as = Double.parseDouble(txt_uas.getText());
            Double tgs = Double.parseDouble(txt_tugas.getText());

            Mhs m = new Mhs(ni, na, ts, as, tgs);
            txt_uts1.setText(""+m.uts()); txt_uas1.setText(""+m.uas());
            //
            txt_tugas1.setText(""+m.tugas()); 
            txt_nAkhir.setText(""+m.nilaiAkhir());
            txt_uas2.setText(""+m.getPredikat(m.getNilaiHuruf(m.nilaiAkhir())));
            txt_tugas2.setText(""+m.getPredikat(m.getNilaiHuruf(m.nilaiAkhir())));
            btn_simpan.setEnabled(true);
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Inputan Anda Kosong", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void kosongkanTable()
    {
        DefaultTableModel model = (DefaultTableModel)this.tabel.getModel();
        model.setRowCount(0);
    }
    
    public void terpilih(int index) throws SQLException{
        ArrayList[] list = getMhsList();
        txt_nim.setText((String) list[index].get(0));
        txt_nama.setText((String) list[index].get(1));
        txt_uts.setText((String) list[index].get(2).toString());
        txt_uas.setText((String) list[index].get(3).toString());
        txt_uas.setText((String) list[index].get(4).toString());
 
        btn_proses.setEnabled(false);
        btn_simpan.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txt_nim = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_uts = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_uas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tugas = new javax.swing.JTextField();
        btn_proses = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btn_hapus = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_proses1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_uts1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_uas1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_tugas1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_nAkhir = new javax.swing.JTextField();
        nHuruf = new javax.swing.JLabel();
        txt_uas2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_tugas2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Nilai Mahasiswa");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Nilai Mahasiswa");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NIM");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nama");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nilai UTS");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nilai UAS");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nilai Tugas");

        btn_proses.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_proses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_intelligence_50px.png"))); // NOI18N
        btn_proses.setText("Proses");
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });

        btn_simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_downloading_updates_50px_2.png"))); // NOI18N
        btn_simpan.setText("Simpan");

        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_add_50px.png"))); // NOI18N
        btn_tambah.setText("Tambah Lain");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_keluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_export_50px.png"))); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_trash_50px_1.png"))); // NOI18N
        btn_hapus.setText("Hapus");

        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_refresh_50px.png"))); // NOI18N
        btn_update.setText("Update");

        btn_proses1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_proses1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIMahasiswaIcon/icons8_intelligence_50px.png"))); // NOI18N
        btn_proses1.setText("Proses");
        btn_proses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proses1ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("UTS 35%");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("UAS 35%");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("TUGAS 30%");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Nilai Akhir");

        nHuruf.setForeground(new java.awt.Color(0, 0, 0));
        nHuruf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nHuruf.setText("Nilai Huruf");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Predikat");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_uts, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_uas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_tugas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_proses, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_proses1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10)
                        .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_uts1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_uas1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_tugas1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_nAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(nHuruf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_uas2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_tugas2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_uts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(txt_uas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_tugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_proses, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_proses1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_uts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_uas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_tugas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_nAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nHuruf)
                    .addComponent(txt_uas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_tugas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesActionPerformed
        prosesHitungNilai();
    }//GEN-LAST:event_btn_prosesActionPerformed

    private void btn_proses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proses1ActionPerformed
        prosesHitungNilai();
        btn_update.setEnabled(true);
        btn_simpan.setEnabled(false);
    }//GEN-LAST:event_btn_proses1ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int index = tabel.getSelectedRow();
        try{
            terpilih(index);
        }catch(SQLException ex){
            Logger.getLogger(FormatNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        btn_proses1.setEnabled(true);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tabelMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        
        kosongkanTextField();
        btn_proses.setEnabled(true);
        
        txt_uts1.setEditable(false);txt_uas1.setEditable(false);txt_tugas1.setEditable(false);
        txt_nAkhir.setEditable(false);txt_uas2.setEditable(false);txt_tugas2.setEditable(false);
        
        btn_simpan.setEnabled(false);btn_update.setEnabled(false);
        btn_hapus.setEnabled(false);btn_proses1.setEnabled(false);
    }//GEN-LAST:event_btn_tambahActionPerformed

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
            java.util.logging.Logger.getLogger(FormatNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormatNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormatNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormatNilaiMhs().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormatNilaiMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_proses;
    private javax.swing.JButton btn_proses1;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nHuruf;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txt_nAkhir;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    private javax.swing.JTextField txt_tugas;
    private javax.swing.JTextField txt_tugas1;
    private javax.swing.JTextField txt_tugas2;
    private javax.swing.JTextField txt_uas;
    private javax.swing.JTextField txt_uas1;
    private javax.swing.JTextField txt_uas2;
    private javax.swing.JTextField txt_uts;
    private javax.swing.JTextField txt_uts1;
    // End of variables declaration//GEN-END:variables

    private void setDisable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
