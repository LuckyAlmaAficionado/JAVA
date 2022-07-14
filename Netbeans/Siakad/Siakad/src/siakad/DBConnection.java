package siakad;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pbo2022", "root", "");
//            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal = " + ex.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
