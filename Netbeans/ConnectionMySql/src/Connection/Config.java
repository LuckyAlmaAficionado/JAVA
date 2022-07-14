/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Connection;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Lucky
 */
public class Config {
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:msql://localhost:3306/dbName";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver((new com.mysql.jdbc.Driver()));
            MySQLConfig = (Connection) DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            System.out.println("gagal koneksi" + e.getMessage());
        }
        return MySQLConfig; 
    }
}
