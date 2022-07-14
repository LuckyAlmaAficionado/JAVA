/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project_akhir;
import java.sql.*;
/**
 *
 * @author Lucky
 */

public class S_Connection {
    
    public static Connection getConnection(){
        Connection Con = null;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/db_projectakhir", "root", "");
            System.out.println("Connection successfully");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Con;
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
