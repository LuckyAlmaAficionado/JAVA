/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mobil;

/**
 *
 * @author Lucky
 */
public class Mobil {
    String warna;
    int tahunProduksi;
    int gigi = 0;
    
    void tambahGigi(){
        gigi += 1;
        System.out.println("Gigi sekarang = " + gigi);
    }
    void kurangGigi(){
        gigi -= 1;
        System.out.println("Gigi sekarang = " + gigi);
    }
    
    public static void main(String[] args) {
        Mobil car = new Mobil();

        car.warna = "merah";
        car.tahunProduksi = 2018;

        System.out.println("warna mobilku = " + car.warna);
        System.out.println("tahun produksi = " + car.tahunProduksi);

        car.tambahGigi();
        car.tambahGigi();
        car.kurangGigi();
    }
}
