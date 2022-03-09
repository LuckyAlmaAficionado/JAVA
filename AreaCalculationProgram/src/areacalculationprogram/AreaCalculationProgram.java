/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacalculationprogram;
import java.util.Scanner;
/**
 *
 * @author Lucky
 */
public class AreaCalculationProgram {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int option, p = 0, l = 0, r = 0, s = 0;
        double phi = 3.14, hasil, temp;
        do {        
            System.out.println("===== MENU =====");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Luas Lingkaran");
            System.out.println("3. Luas Bujursangkar");
            System.out.println("4. Luas Empat Persegi Panjang");
            System.out.println("5. Selesai");
            System.out.print("Masukan opsi anda: ");
            option = inputUser.nextInt();
            System.out.println("=================");
            switch (option){
                case 1:
                    System.out.println("=== Luas Segitiga ===");
                    System.out.print("Masukan panjang segitiga: ");
                    p = inputUser.nextInt();
                    System.out.print("Masukan lebar segitiga: ");                    
                    l = inputUser.nextInt();
                    hasil = 0.5*p*l;
                    System.out.println("Hasil Luas Segitiga adalah: " + hasil);
                    break;
                case 2:
                    System.out.println("=== Luas Lingkarang ===");
                    System.out.print("Masukan jari-jari lingkarang: ");
                    r = inputUser.nextInt();
                    hasil = phi*(r*r);
                    System.out.println("Hasil Luas Lingkaran adalah: " + hasil);
                    break;
                case 3:
                    System.out.println("=== Luas Bujursangkar ===");
                    System.out.print("Masukan sisi bujursangkar: ");
                    s = inputUser.nextInt();
                    hasil = s*s;
                    System.out.println("Hasil Luas Bujursangkar adalah: " + hasil);
                    break;
                case 4:
                    System.out.println("\n=== Luas Empat Persegi Panjang ===");
                    System.out.print("Masukan panjang persegi panjang: ");
                    p = inputUser.nextInt();
                    System.out.print("Masukan lebar persegi panjang: ");
                    l = inputUser.nextInt();
                    temp = p * l;
                    hasil = temp*4;
                    System.out.println("Hasil Luas Satu Persegi Panjang adalah: " + temp);
                    System.out.println("Hasil Luas Empat Persegi Panjang adalah: " + hasil);
                    System.out.println("=== Luas Empat Persegi Panjang ===\n");                    
                    break;
                default:
                    break;
            }
        } while (option < 5);
        
        System.out.println("THANK YOU HAVE A NICE DAY");
        
        
        
//        String nama_var = (kondisi yang ingin di uji) ? (statment_benar) : (statment_salah);
    }
    
}
