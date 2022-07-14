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
public class Looping {
    public static void main(String[] args) {
        int loop;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many times loop? ");
        loop = scanner.nextInt();
        
        
        
        for (int i = 0; i < loop; i++) {
            System.out.printf("Congratulation %d \n", i );
        }
    }
}
