/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javatelegram;
import java.sql.*;
/**
 *
 * @author Lucky
 */
public class Koneksi {
    public Connection getConnection(){
        Connection Con = null;
        try{
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_hotel", "root", "");
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        return Con;
    }
}
