/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Lucky
 */
public class Arraylist {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        ArrayList<Integer> kurang = new ArrayList<Integer>();
        ArrayList<Integer> kali = new ArrayList<Integer>();
        ArrayList<Integer> bagi = new ArrayList<Integer>();
        System.out.print("Masukan jumlah data: ");
        int data = inUser.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nilai " + (i+1));
            for (int j = 0; j < data; j++) {
                System.out.print("Masukan nilai: ");
                int temp = inUser.nextInt();
                if (i == 0) {
                    nilai1.add(temp);
                    System.out.println("Index ke " + j + " = " + nilai1.get(j));
                }else{
                    nilai2.add(temp);
                    System.out.println("Index ke " + j + " = " + nilai2.get(j));
                }
            }
        }
        
        for (int i = 0; i < data; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            System.out.println("Hasil jumlah nilai1 + nilai2 = " + jumlah.get(i));
        }
        
        for (int i = 0; i < data; i++) {
            kurang.add(nilai1.get(i) - nilai2.get(i));
            System.out.println("Hasil kurang nilai1 - nilai2 = " + kurang.get(i));
        }
        
        for (int i = 0; i < data; i++) {
            kali.add(nilai1.get(i) * nilai2.get(i));
            System.out.println("Hasil kali nilai1 x nilai2 = " + kali.get(i));
        }
        
        for (int i = 0; i < data; i++) {
            bagi.add(nilai1.get(i) / nilai2.get(i));
            System.out.println("Hasil bagi nilai1 / nilai2 = " + bagi.get(i));
        }
        
        for (int i = 0; i < data; i++) {
            System.out.println("Jumlah index ke " + i + " = " + jumlah.get(i));
        }
        for (int i = 0; i < data; i++) {
            System.out.println("Jumlah index ke " + i + " = " + kurang.get(i));
        }
        for (int i = 0; i < data; i++) {
            System.out.println("Jumlah index ke " + i + " = " + kali.get(i));
        }
        for (int i = 0; i < data; i++) {
            System.out.println("Jumlah index ke " + i + " = " + bagi.get(i));
        }
        
    }
}
