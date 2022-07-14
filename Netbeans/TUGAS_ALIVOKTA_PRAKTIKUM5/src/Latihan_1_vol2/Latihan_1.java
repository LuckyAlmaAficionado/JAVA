/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_1_vol2;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Latihan_1 {
    public static void main(String[] args) {
        int [] array;
        Scanner inUser = new Scanner(System.in);
        System.out.print("Jumlah Data : ");
        int Jdata = inUser.nextInt();
        array = new int[Jdata];
        
        for (int i = 0; i < Jdata; i++) {
            System.out.print("Data ke-"+(i+1)+" = ");
            array[i] = inUser.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hasil nilai["+i+"] = " + array[i]);
        }
    }
}
