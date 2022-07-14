/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package p_uas;
import java.sql.*;
/**
 *
 * @author Lucky
 */
public class Koneksi {
    public static Connection getConnection(){
        Connection Con = null;
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost/db_uas", "root", "");
        }catch(Exception ex){
            System.out.println("Error getConnection: " + ex.getMessage());
        }
        return Con;
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
