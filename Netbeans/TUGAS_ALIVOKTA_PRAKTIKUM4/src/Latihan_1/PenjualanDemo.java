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
public class PenjualanDemo {
    static void input()
    {
        Penjualan brg = new Penjualan();
        int harga, jumlah;
        Scanner inUser = new Scanner(System.in);
        String kode, nama;
        System.out.print("Kode barang    : ");
        kode = inUser.nextLine();
        System.out.print("Nama Pelanggan : ");
        nama = inUser.nextLine();
        System.out.print("Harga Barang   : ");
        harga = inUser.nextInt();
        System.out.print("Jumlah Barang  : ");
        jumlah = inUser.nextInt();
        brg.setData(kode, nama, harga, jumlah);
    }
    
    public static void main(String[] args) {
        String repeat = null;
        Scanner inUser = new Scanner(System.in);
        do{
            PenjualanDemo.input();
            System.out.print("Ulang program? ");
            repeat = inUser.next();
        }while(repeat.equals("y"));
    }
}
