/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucky
 */
public class db_Connection {

    public static Connection getConnection()
    {
        Connection con = null;
        try{
            String dbName = "db_latihan"; // Nama database
            String url = "jdbc:mysql://localhost/"+dbName; // url JDBC
            String username = "root"; // username
            String password = ""; // password
            con = (Connection) DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null, "Connection Successfully :)");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error = " + e.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) {
        getConnection();
    }
    
}
