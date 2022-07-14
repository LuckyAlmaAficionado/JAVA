/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ppkp2022jateng;
import java.sql.*;
/**
 *
 * @author Devan
 */
public class PPKP2022JATENG {

    /**
     * @param args the command line arguments
     */
    public static Connection getConnection(){
        Connection Con = null;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/db_telebot", "root", "");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Con;
    }
}
