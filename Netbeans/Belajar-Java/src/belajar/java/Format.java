/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;
import java.util.Scanner;
/**
 *
 * @author Lucky
 */
public class Format {
    public static void main(String[] args) {
//        String nama;
//        
        Scanner input = new Scanner(System.in);
//        System.out.print("Input Nama Anda? ");
//        nama = input.next();
//        
//        System.out.printf("Nama Anda %s\n", nama);
        int value;
        
        value = input.nextInt();
        String s1 = String.valueOf(value);
        System.out.println(s1+10);
    }
}
