/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajararraylist;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Lucky
 */

public class BelajarArrayList {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inUser = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            data.add("Data ke-"+(i+1));
        }
        
        for (String x : data) {
            System.out.println(x);
        }

        System.out.println(data.set(3, "Hallo"));

        
        for (String x : data) {
            System.out.println(x);
        }
    }
    
    
}
