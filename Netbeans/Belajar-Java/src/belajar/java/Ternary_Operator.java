/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Ternary_Operator {
    public static void main(String[] args) {
        int input;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukan Nilai: ");
        input = inputUser.nextInt();
        System.out.print("Masukan Kelakuan: ");
        int kelakuan = inputUser.nextInt();
        
        
//        x = (input == 10) ? (input*input) : (input/2);
//        
//        System.out.printf("Hasilnya %d", x);

         String x = (input > 50)?("Gagal"):((kelakuan > 80)?("Lulus"):("Gagal"));
 
         
//        if (input > 50) {
//            System.out.println("Lulus");
//        } else {
//            if (kelakuan > 80) {
//                System.out.println("Lulus");
//            }else{
//                System.out.println("Gagal");
//            }
//        }
         
         
         System.out.println("Keterangan = " + x);
        
    }
}
