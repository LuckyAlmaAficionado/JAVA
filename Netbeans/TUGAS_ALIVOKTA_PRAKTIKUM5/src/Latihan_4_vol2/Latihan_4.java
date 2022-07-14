/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_4_vol2;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Latihan_4 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.print("input baris matrix A= ");
        int baris_a = inUser.nextInt();
        System.out.print("input kolom matrix A= ");
        int kolom_a = inUser.nextInt();
        int matrix_a[][] = new int [baris_a][kolom_a];
        int matrix_c[][] = new int [baris_a][kolom_a];
        
        
        for (int i = 0; i < matrix_a.length; i++) {
            for (int j = 0; j < matrix_a[i].length; j++) {
                System.out.print("input element matrix A ["+i+","+j+"] = ");
                matrix_a[i][j] = inUser.nextInt();
            }
        }
        
        System.out.print("input baris matrix B= ");
        int baris_b = inUser.nextInt();
        System.out.print("input kolom matrix B= ");
        int kolom_b = inUser.nextInt();
        int matrix_b[][] = new int [baris_b][kolom_b];
        for (int i = 0; i < matrix_b.length; i++) {
            for (int j = 0; j < matrix_b[i].length; j++) {
                System.out.print("input element matrix A ["+i+","+j+"] = ");
                matrix_b[i][j] = inUser.nextInt();
            }
        }
        int option = 0;
        
        do {
            System.out.println("1. Hasil penjumlahan matrix A");
            System.out.println("2. Hasil transfos matrix c");    
            System.out.println("3. Hasil perkalian matrix A dengan matrix B =");
            System.out.print("Masukan pilihan: ");
            option = inUser.nextInt();
            switch(option){
                case 1:
                    System.out.println("Hasil penjumlahan matrix A");
                    for (int i = 0; i < matrix_a.length; i++) {
                        for (int j = 0; j < matrix_a[i].length; j++) {
                            int hasil = matrix_a[i][j] + matrix_b[i][j];
                            System.out.print(hasil + " ");
                            matrix_c[i][j] = hasil;
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Hasil transfos matrix c");        
                    for (int i = 0; i < matrix_c.length; i++) {
                        for (int j = 0; j < matrix_c[i].length; j++) {
                            System.out.print(matrix_c[j][i] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Hasil perkalian matrix A dengan matrix B =");
                    for (int i = 0; i < matrix_a.length; i++) {
                        for (int j = 0; j < matrix_a[i].length; j++) {
                            int hasil = matrix_a[i][j] * matrix_b[i][j];
                            System.out.print(hasil + " ");
                            matrix_c[i][j] = hasil;
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }
        } while (option < 4);
        
    }
}
