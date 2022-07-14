/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_1_vol1;
import java.util.Scanner;
/**
 *
 * @author Lucky
 */
public class Latihan_1 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.print("Bilangan : ");
        int bilangan = inUser.nextInt();
        int hasil = 1;
        int temp = 1;
        for (int i = 1; i < bilangan; i++) {
            hasil = hasil*(i+1); 
            System.out.println(temp + " x " + (i+1) + " = " + hasil);
            temp = hasil;
        }
    }
}
