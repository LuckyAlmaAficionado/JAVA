/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package senddataarray;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lucky
 */
public class SendDataArray {
    
    Scanner inUser = new Scanner(System.in);

    public String nama(){
        System.out.print("Enter Username: ");
        String namaPengunjung = inUser.nextLine();
        return namaPengunjung;
    }
    
    public String alamat(){
        System.out.print("Enter Address: ");
        String alamatPengunjung = inUser.nextLine();
        return alamatPengunjung;
    }
    
    public ArrayList<String> SendArray(){
        ArrayList<String> data = new ArrayList<String>();
        data.add(nama());
        data.add(alamat());
        return data;
    }
    
    public static void main(String[] args) {
        String[] format = {"Your Name: ", "Your Address: "};
        
        SendDataArray test = new SendDataArray();
        for (String y : format){
        for (String x : test.SendArray()){
            System.out.println(y + x);
        }
        }
    }
}
