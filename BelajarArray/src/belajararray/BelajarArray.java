/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajararray;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class BelajarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inUser = new Scanner(System.in);
        int[][] data = new int[2][4];
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("Masukan data [%d][%d]: ", i, j);
                data[i][j] = inUser.nextInt();
            }
        }
       
        
        for (int i = 0; i < data.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("] ");
        }

    }
    
}
