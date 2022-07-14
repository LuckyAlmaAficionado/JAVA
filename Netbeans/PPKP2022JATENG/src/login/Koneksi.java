/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import java.sql.*;
/**
 *
 * @author Devan
 */
public class Koneksi {
    
    Connection Con = null;
    public Connection getConnection(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/db_projectakhir", "root", "");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Con;
    }
}
