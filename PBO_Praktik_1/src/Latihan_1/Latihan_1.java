/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_1;

import java.util.Scanner;

/**
 *
 * @author Lucky
 */
public class Latihan_1 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        String name, nim, kelompok, ttl, alamat, email, noTlp, ig;
        
        System.out.println("======== INPUT ============");
        System.out.print("Nama         = ");
        name = inUser.nextLine();
        System.out.print("NIM          = ");
        nim = inUser.nextLine();        
        System.out.print("Kelompok     = ");
        kelompok = inUser.nextLine();        
        System.out.print("TTL          = ");
        ttl = inUser.nextLine();
        System.out.print("Alamat       = ");
        alamat = inUser.nextLine();
        System.out.print("Email        = ");
        email = inUser.nextLine();
        System.out.print("No. Tlp      = ");
        noTlp = inUser.nextLine();
        System.out.print("Instagram    = ");
        ig = inUser.nextLine();
        System.out.println("============================\n\n");
        
        System.out.println("=========== OUTPUT ==============");
        System.out.println("Nama         = " + name);
        System.out.println("NIM          = " + nim);
        System.out.println("Kelompok     = " + kelompok);
        System.out.println("TTL          = " + ttl);
        System.out.println("Alamat       = " + alamat);
        System.out.println("Email        = " + email);
        System.out.println("No. Tlp      = " + noTlp);
        System.out.println("Instagram    = " + ig);
        System.out.println("===================================");
    }
}
