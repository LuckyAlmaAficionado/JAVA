/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_2;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Latihan_2 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        int a = 0, b = 0, price = 500, jarak;
        System.out.print("titik A: ");
        a = inUser.nextInt();
        System.out.print("titik B: ");
        b = inUser.nextInt();
        jarak = b - a;
        System.out.printf("jarak = %d\n", jarak);
        System.out.printf("Harga per jarak = Rp. %d\n", price);
        System.out.printf("Harga jarak = %d\n", jarak*price);
    }
}
