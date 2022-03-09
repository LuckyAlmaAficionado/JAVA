/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_4;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Latihan_4 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        
        System.out.print("masukan tinggi TriangleLoop: ");
        int lenght = inUser.nextInt();
        
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
