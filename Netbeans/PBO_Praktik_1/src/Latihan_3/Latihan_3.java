/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_3;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Latihan_3 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        double r = 0, tinggi = 0, volume = 0;
        double phi = 3.14;

        System.out.println("Phi    = " + phi);
        System.out.print("R      = ");
        r = inUser.nextDouble();
        System.out.print("Tinggi = ");
        tinggi = inUser.nextDouble();
        volume = phi * r * r * tinggi;
        System.out.println("Volume = " + volume);
        
        String x = (volume > 100) ? ("Besar") : ("Kecil");
        System.out.println(x);
    }
}
