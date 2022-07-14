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
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b, hasil = 0;
        String operator;
        
        System.out.print("input a: ");
        a = input.nextFloat();
        System.out.print("input Operator: ");
        operator = input.next();
        System.out.print("input b: ");
        b = input.nextInt();
        
        
        switch(operator){
            case "-":
                hasil = a - b;
                break;
            case "+":
                hasil = a + b;
                break;
            case "/":
                hasil = a / b;
                break;
            case "*":
                hasil = a * b;
                break;
            default:
                System.out.println("Hasil tidak ditemukan");
        }
        
        System.out.println(a + " " + operator + " " + b + " = " + hasil);
        
        
    }
}
