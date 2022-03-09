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
public class IF_ELSE {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan pilihan a: ");
        a = input.nextInt();
        System.out.print("Masukan pilihan b: ");
        b = input.nextInt();
        
        if (a > b) {
            System.out.println(a + " lebih besar dari " + b);
        } else {
            System.out.println(b + " lebih besar dari " + a);
        }
    }
}
