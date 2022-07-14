/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Praktikum_4;
import java.util.Scanner;
/**
 *
 * @author Lucky
 */
public class NilaiDemo {
    public static void main(String[] args) {
        Nilai mhs = new Nilai();
        String repeat = null;
        Scanner inUser = new Scanner(System.in);
        
        
        do{
            mhs.cetakNilai();
            System.out.print("Jalankan Program Kembali? ");
            repeat = inUser.nextLine().toLowerCase();
        }while(repeat.equals("y"));
    }
}
