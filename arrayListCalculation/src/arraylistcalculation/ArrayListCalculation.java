/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistcalculation;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class ArrayListCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> hasil = new ArrayList<Integer>();
    
        
        for (int i = 0; i < 5; i++) {
            nilai1.add(i);
        }
        for (int i = 0; i < 5; i++) {
            nilai2.add(i);
        }
        for (int i = 0; i < 5; i++) {
            hasil.add(nilai1.get(i) + nilai2.get(i));
        }
        for (int i = 0; i < 5; i++) {
            hasil.add(nilai1.get(i) + nilai2.get(i));
        }
        for (int i = 0; i < 5; i++) {
            hasil.add(nilai1.get(i) + nilai2.get(i));
        }
        for (int i = 0; i < 5; i++) {
            hasil.add(nilai1.get(i) + nilai2.get(i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(hasil.get(i));
        }
    }
    
}
