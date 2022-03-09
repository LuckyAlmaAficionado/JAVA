/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobildemo;

import java.util.Scanner;

/**
 *
 * @author Lucky
 */

class Mobil {
    String warna;
    int tahunProduksi;
    
    Mobil(String warnaMobil, int tahunProduksiMobil){
        warna = warnaMobil;
        tahunProduksi = tahunProduksiMobil;
    }
}

class Mobil2 {
    String OnOff;
    int gear;
    
    Mobil2(String kondisi, int gigi){
        OnOff = kondisi;
        gear = gigi;
        turnOnOffCar();
        gearUpDown();
    }
    
    void turnOnOffCar(){
        System.out.printf("Kondosi mobil saat ini %s", OnOff);
    }
    
    void gearUpDown(){
        System.out.printf("Gear mobil saat ini %d\n", gear);
    }
}

public class MobilDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputUser = new Scanner(System.in);
        
        Mobil2 mobil = new Mobil2("Hidup", 1);
        
//        String color;
//        int tP;
//        
//        System.out.print("Masukan warna mobil: ");
//        color = inputUser.next();
//        System.out.print("Masukan tahun mobil: ");
//        tP = inputUser.nextInt();
//        
//        Mobil mobil1 = new Mobil(color, tP);
//        
//        System.out.printf("Mobil berwarna %s dengan tahun produksi %d\n", mobil1.warna, mobil1.tahunProduksi);
    }
    
}
