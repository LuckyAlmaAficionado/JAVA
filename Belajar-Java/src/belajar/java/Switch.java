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
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option, a, b, hasil;
        
        do{
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Pengurangan");
            System.out.println("4. Penambahan");
            System.out.println("5. EXIT");
            System.out.print("Masukan pilihan: ");
            option = input.nextInt();
            switch(option){
                case 1:
                    System.out.print("Masukan A, B: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    hasil = a * b;
                    System.out.println(a + " x " + b + " = " + hasil);
                    break;
                case 2:
                    System.out.print("Masukan A, B: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    hasil = a / b;
                    System.out.println(a + " / " + b + " = " + hasil);
                    break;
                case 3:
                    System.out.print("Masukan A, B: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    hasil = a - b;
                    System.out.println(a + " - " + b + " = " + hasil);
                    break;
                case 4:
                    System.out.print("Masukan A, B: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    hasil = a + b;
                    System.out.println(a + " + " + b + " = " + hasil);
                    break;
            }
        }while(option < 5);
        System.out.println("Thanks For Use This Calculator :)");
    }
    
}
