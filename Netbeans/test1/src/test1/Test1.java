/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucky
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
