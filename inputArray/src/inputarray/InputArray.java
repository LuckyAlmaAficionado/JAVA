/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputarray;
import java.sql.*;
/**
 *
 * @author Lucky
 */
public class InputArray {
   //digunakan untuk menyambungkan java ke sql menggunakan jdbc  
    public static Connection getConnection() {
        Connection Con = null;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/db_android", "root", "");
        } catch (Exception e) {
            System.out.print("Eror: " + e.getMessage());
        }
        return Con;
    }
}
