/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_rpl;

/**
 *
 * @author Lucky
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksi {
    public static Connection con;
    public static Statement st;
    
    public static Connection getConnection(){
        try{
            String url = "jdbc:mysql://localhost/db_hotel";
            String user = "root";
            String pw = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pw);
            System.out.println("Connection Successfully");
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) {
        getConnection();
    }
    
}
