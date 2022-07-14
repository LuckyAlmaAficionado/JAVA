/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_1;

/**
 *
 * @author Lucky
 */
public class Penjualan {
    private String kode, nama, bonus;
    private float harga;
    private int jumlah;
    
    void setData(String kode, String nama, float harga, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        cetakNota();
    }
    
    int getTotalPembelian(){
        return (int) (this.jumlah * this.harga);
    }
    
    String getBonus(){
        if (getTotalPembelian() >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        }else if(getTotalPembelian() >= 100000 && jumlah > 3){
            bonus = "Payung";
        }else if(getTotalPembelian() >= 50000 && jumlah > 2){
            bonus = "Ballpoint";
        }else{
            bonus = "";
        }
        return bonus;
    }
    
    void cetakNota(){
        System.out.println("Nama        : " + nama);
        System.out.println("Kode        : " + kode);
        System.out.println("Jml Barang  : " + jumlah);
        System.out.println("Hrg Barang  : " + harga);
        System.out.println("Bonus       : " + getBonus());
        System.out.println("Total Harga : " + getTotalPembelian());
    }
    

}
