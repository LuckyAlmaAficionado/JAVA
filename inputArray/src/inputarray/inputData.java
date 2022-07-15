/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package inputarray;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucky
 */
public class inputData {
    Connection Con = InputArray.getConnection();
    Statement st;
    ResultSet rs;
    
    int lenght = getLenght();
    public String[] judulFilm = new String[lenght];
    
    
    public int getLenght(){
        int a = 0;
        try{
            String string = "SELECT * FROM tb_cardview";
            st = Con.createStatement();
            rs = st.executeQuery(string);
            while (rs.next()){
                a++;
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return a;
    }
    
    
    public void getData(){
        int a = 0;
        try{
            String string = "SELECT * FROM tb_cardview";
            st = Con.createStatement();
            rs = st.executeQuery(string);
            while (rs.next()){
                judulFilm[a] = rs.getString("judul_film").toString();
                a++;
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void printData(){
        for (int i = 0; i < judulFilm.length; i++) {

            System.out.println("judul film yang diterima adalah: " + judulFilm[i]);
        }
    }
    
    public static void main(String[] args) {
        inputData a = new inputData();
        a.getData();
        a.printData();
    }
}
