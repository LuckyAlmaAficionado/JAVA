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
public class isBlank {
    public static void main(String[] args) {
        String name = "s";
        Scanner scanner = new Scanner(System.in);
        
        if (name.isBlank()) {
            System.out.print("Input your name: ");
            name = scanner.next();
        }
        else
        {
            System.out.println("Your name is Empty");
        }
        
        System.out.printf("Yout name is %s \n", name);
        
    }
}
