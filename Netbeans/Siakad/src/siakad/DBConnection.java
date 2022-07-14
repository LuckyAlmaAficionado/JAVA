/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package siakad;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Lucky
 */
public class DBConnection {
    public Connection getConnection()
    {
        Connection con = null;
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pbo2022", "root", "");
            JOptionPane.showMessageDialog(null, "Connection  Success :)");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error = " + e.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) {
        DBConnection t = new DBConnection();
        t.getConnection();
    }
}
