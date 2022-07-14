/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans8.pkg2;
import java.sql.*;
/**
 *
 * @author Lucky
 */
public class Netbeans82 {

    public Connection getConnetion(){
        Connection Con;
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        try {
            String query = "SELECT * FROM db_akun";
            Con = DriverManager.getConnection("jdbc:mysql://localhost/db_telebot", "root", "");
            st = Con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {                
                System.out.println(rs.getString("username"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal Koneksi!");
        }
        return Con;
    }
    
    public static void main(String[] args) {
        Netbeans82 test = new Netbeans82();
        test.getConnetion();
    }
    
}
