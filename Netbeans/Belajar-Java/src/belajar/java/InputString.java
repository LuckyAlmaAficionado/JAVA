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
public class InputString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String nama, kelas;
        int umur;

        System.out.print("input nama: ");
        nama = userInput.next();
        System.out.print("Input umur: ");
        umur = userInput.nextInt();
        System.out.print("Masukan nama sekolah: ");
        kelas = userInput.next();
        
        System.out.println("Nama: " + nama + ", Umur: " + umur + ", Kelas: " + kelas);
    }
}
