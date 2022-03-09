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
public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String name;
        
        System.out.print("Siapa Nama Anda? ");
        name = inputUser.next();

        String temp = (name.equals("Lucky")) ? ("Selamar datang Admin"):("Selamat datang User");
        System.out.println(temp);
   }
}
