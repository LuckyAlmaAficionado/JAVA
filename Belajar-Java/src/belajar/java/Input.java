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
public class Input {
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("===MENGHITUNG LUAS===");
        System.out.print("panjang = ");
        int panjang = Input.nextInt();
        System.out.print("lebar = ");
        int lebar = Input.nextInt();
        
        int hasil = panjang * lebar;
        System.out.printf("hasil = %d \n", hasil );
        
//        int panjang = 10;
//        int lebar = 4;
//        
//        int luas = panjang * lebar;
//        System.out.println(luas);
    }
}
