/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_2_vol2;
import java.util.*;
/**
 * 
 * @author Lucky
 */
public class Latihan_2 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.print("Masukan jumlah siswa: ");
        int Jdata = inUser.nextInt();
        int array[] = new int[Jdata];
        
        for (int i = 0; i < Jdata; i++) {
            System.out.println("======== SISWA "+(i+1)+" ========");
            System.out.print("Masukan nilai pbo: ");
            int pbo = inUser.nextInt();
            System.out.print("Masukan nilai pwl: ");
            int pwl = inUser.nextInt();
            System.out.print("Masukan nilai web: ");
            int web = inUser.nextInt();
            int hasil = (pbo + pwl + web)/3;
            array[i] = hasil;
        }
        
        System.out.println("======= Rata-rata =======");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nilai rata-rata Mahasiswa ke-"+(i+1)+": " + array[i]);
        }
    }
}
