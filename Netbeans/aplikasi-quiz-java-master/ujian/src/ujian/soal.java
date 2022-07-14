/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian;

/**
 *
 * @author Fitria Nurshoimah
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
public class soal extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    int detik,menit;
    String nold,nolm;
    String npm1,nama1;
    int menit12, no_soal, benar = 0;
    /**
     * Creates new form soal
     */
    public soal(String nama,String npm) {
        initComponents();
        this.setLocationRelativeTo(null);
        koneksi DB=new koneksi();
        DB.config();
        con=DB.con;
        stat=DB.stm;
        jMenu2.setText(nama);
        npm1=npm;
        nama1=nama;
        setResizable(false);
        jButton2.setVisible(false);
        tampil_setting();
        setting(0);
        txt_soal.setEditable(false);
    }
    
    public void setting(int i){
        Boolean bool;
        if (i == 0) {
            bool = false;
        }else{
            bool = true;
        }
        txt_soal.setVisible(bool);
        radio_a.setVisible(bool);
        radio_b.setVisible(bool);
        radio_c.setVisible(bool);
        radio_d.setVisible(bool);
    }
    
    public int totalSoal(){
        int tot_soal = 0;
        try {
            String query = "SELECT * FROM soal";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                tot_soal++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        return tot_soal;
    }

    private soal(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void checkJawaban(){
        try{
            stat = con.createStatement();
            rs = stat.executeQuery("SELECT * FROM soal WHERE `id_soal`='"+no_soal+"'");
            if (rs.next()) {
                txt_soal.setText(rs.getString("jawaban_benar"));
            }else{
                no_soal = 0;
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        no_soal++;
    }
    
    public char getAnswer(){
        char value = 0;
        if (radio_a.isSelected()) {
            value = 'a';
        }
        else if (radio_b.isSelected()) {
            value = 'b';
        }
        else if (radio_c.isSelected()) {
            value = 'c';
        }
        else if (radio_d.isSelected()) {
            value = 'd';
        }
        return value;
    }

    public String checkAnswer(){
        String jawaban_benar, keterangan = null;
        try {
            stat = con.createStatement();
            rs = stat.executeQuery("SELECT * FROM soal WHERE `id_soal`='"+ (no_soal-1) +"'");
            if (rs.next()) {
                jawaban_benar = rs.getString("jawaban_benar");
                System.out.println("jawaban benar no " + (no_soal-1) + " : " + jawaban_benar);
                if (jawaban_benar.charAt(0) == getAnswer()) {
                    benar++;
                    keterangan = "Benar";
                }else{
                    keterangan = "Salah";
                }
//                JOptionPane.showMessageDialog(null, "Jawaban " + getAnswer() + " yang benar " + checkAnswer());
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return keterangan;
    }
    
    public void showSoal(int i){
        if (i == 1) {
            no_soal++;
        }else{
            if (no_soal == 0) {
               JOptionPane.showMessageDialog(null, "Sudah nomor terakhir!");
            }else{
                no_soal--;
            }
        }
        System.out.println(no_soal);
        try{
            stat = con.createStatement();
            rs = stat.executeQuery("SELECT * FROM soal WHERE `id_soal`='"+no_soal+"'");
            if (rs.next()) {
                txt_soal.setText(no_soal + ". " + rs.getString("soal"));
                radio_a.setText("a. " + rs.getString("jawaban_a"));
                radio_b.setText("b. " + rs.getString("jawaban_b"));
                radio_c.setText("c. " + rs.getString("jawaban_c"));
                radio_d.setText("d. " + rs.getString("jawaban_d"));
                System.out.println("Jawaban soal nomor " + no_soal + " adalah: " + getAnswer() + " jawabannya " + checkAnswer());
            }else{
                selesai();
                System.out.println("selesai");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        buttonGroup6.clearSelection();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_soal = new javax.swing.JTextArea();
        radio_a = new javax.swing.JRadioButton();
        radio_b = new javax.swing.JRadioButton();
        radio_c = new javax.swing.JRadioButton();
        radio_d = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel1.setText("Token : ");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Durasi : ");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel5.setText("Mapel : ");

        jButton1.setBackground(new java.awt.Color(39, 151, 0));
        jButton1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(250, 250, 253));
        jButton1.setText("Mulai Quiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(39, 151, 0));
        jButton2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(250, 250, 253));
        jButton2.setText("Selesai");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        txt_soal.setColumns(20);
        txt_soal.setRows(5);
        jScrollPane7.setViewportView(txt_soal);

        buttonGroup6.add(radio_a);
        radio_a.setText("jRadioButton41");

        buttonGroup6.add(radio_b);
        radio_b.setText("jRadioButton41");

        buttonGroup6.add(radio_c);
        radio_c.setText("jRadioButton41");

        buttonGroup6.add(radio_d);
        radio_d.setText("jRadioButton41");

        jButton3.setBackground(new java.awt.Color(39, 151, 0));
        jButton3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(250, 250, 253));
        jButton3.setText("Selanjutnya");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Hai, ");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Logout");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane7)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE))
                    .addComponent(radio_a, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_b, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_c, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_d, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radio_a)
                .addGap(18, 18, 18)
                .addComponent(radio_b)
                .addGap(18, 18, 18)
                .addComponent(radio_c)
                .addGap(18, 18, 18)
                .addComponent(radio_d)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            sql="select * from nilai where token='"+jLabel2.getText()+"' and npm='"+npm1+"'";
            rs=stat.executeQuery(sql);
            if (rs.next()) {
                if (rs.getString("token").equals(jLabel2.getText())) {
                    JOptionPane.showMessageDialog(null, "Kamu sudah mengerjakan soal dengan token ini, nilai kamu "+rs.getString("score"));
                }
            }else{
                setting(1);
                showSoal(1);
                jButton1.setVisible(false);
                jButton2.setVisible(true);
                jLabel17.setVisible(true);
                detik=0;
                menit=menit12;
                countdown();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void selesai(){
        System.out.println("total benar: " + benar);
        System.out.println("total soal: " + totalSoal());
        float nilai=benar*100/totalSoal();
        int nilaiInt = Math.round(nilai);
        System.out.println("Nilai akhir: " + nilaiInt);
        String sql="insert into nilai set npm='"+npm1+"',nama='"+nama1+"',score='"+nilaiInt+"',token='"+jLabel2.getText()+"'";
        try {
            stat.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Nilai anda: " + nilaiInt);
        dispose();
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selesai();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showSoal(1);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    private void tampil_setting(){
        try {
            sql="select *  from setting limit 1";
            rs=stat.executeQuery(sql);
            if (rs.next()) {
                if (rs.getString("id_setting").equals("1")) {        
                String waktu=rs.getString("waktu_mengerjakan");
                String token=rs.getString("token");
                String mapel=rs.getString("mapel");
                jLabel2.setText(token);
                jLabel4.setText(waktu+" Menit");
                jLabel6.setText(mapel);
                jLabel17.setVisible(false);
                menit12=Integer.parseInt(waktu);
                
                }
            }
        } catch (Exception e) {
        }
    }
    
    
    public final void countdown(){
        ActionListener taskperformer=new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
                if (detik==0) {
                    menit=menit-1;
                }
                if(detik==0&&menit==-1){
                    detik=-1;
                    jButton2.doClick();
                }
                if (detik==0&&menit>=0) {
                    detik=60;
                }
                if (detik<=60&&detik>=0) {
                    detik=detik-1;
                }
                if (detik<=9) {
                    nold="0";
                }
                if (menit<=9) {
                    nolm="0";
                }
                if (detik>=0&&menit>=0) {
                    jLabel17.setText(menit+":"+detik);
                }
                if (detik>=0&&menit<0) {
                    jLabel17.setText("00:"+detik);
                }
            }
        };
        new Timer(1000,taskperformer).start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (Exception e) {
        }
        new soal(null).setVisible(true);
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
            java.util.logging.Logger.getLogger(soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radio_a;
    private javax.swing.JRadioButton radio_b;
    private javax.swing.JRadioButton radio_c;
    private javax.swing.JRadioButton radio_d;
    private javax.swing.JTextArea txt_soal;
    // End of variables declaration//GEN-END:variables
}
