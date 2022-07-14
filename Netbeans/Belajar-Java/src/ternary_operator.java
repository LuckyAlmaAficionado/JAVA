/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lucky
 */
public class ternary_operator {
    public static void main(String[] args) {
        String temp, nama;
        Scanner input = new Scanner(System.in);
        nama = input.next();
        // var x = conditions ? statment true : statment false;
        
        temp = nama.equals("Lucky") ? ("Benar"):("Salah");
        System.out.println(temp);
    }
}
