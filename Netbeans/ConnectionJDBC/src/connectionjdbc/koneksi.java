package connectionjdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {
    public static Connection con;
    public static Statement stm;
    
    public static Connection getKoneksi(){
        try {
            String url ="jdbc:mysql://localhost/register";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal " +e.getMessage());
        }
        return con;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }

}