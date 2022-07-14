/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan1;

/**
 *
 * @author Lucky
 */
public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        int a = 10, b = 5;
        double tambah = math.Pertambahan(a, b);
        double kurang = math.Pengurangan(a, b);
        double kali = math.Perkalian(a, b);
        double bagi = math.Pembagian(a, b);
        System.out.println("======= Desimal =======");
        System.out.println("Pertambahan: " + a + " + " + b + " = " + math.Pertambahan(a,b));
        System.out.println("Pengurangan: " + a + " - " + b + " = " + math.Pengurangan(a,b));
        System.out.println("Perkalian: " + a + " x " + b + " = " + math.Perkalian(a,b));
        System.out.println("Pembagian: " + a + " / " + b + " = " + math.Pembagian(a,b));
        
        System.out.println("======= Pecahan =======");
        System.out.println("Pertambahan Pecahan : " + a + " + " + b + " = " + tambah);
        System.out.println("Pengurangan Pecahan : " + a + " - " + b + " = " + kurang);
        System.out.println("Perkalian Pecahan : " + a + " x " + b + " = " + kali);
        System.out.println("Pembagian Pecahan : " + a + " / " + b + " = " + bagi);
        
        
    }
}
