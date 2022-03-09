/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan7Vol3;

/**
 *
 * @author Lucky
 */
class Karyawan{
    private int tunjanganAnak = 1000000;
    private int gajiPokok = 3000000;
    
    public int getTunjanganAnak(){
        return tunjanganAnak;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
}

class KaryawanTetap extends Karyawan{
    int gajiPokok;
    int tjgAnak;
    
    public void TotalGaji(){
        gajiPokok = getGajiPokok();
        tjgAnak = getTunjanganAnak();
        System.out.printf("Gaji Karyawan Tetap = %d\n", gajiPokok+tjgAnak);
    }
}

class KaryawanKontrak extends Karyawan{ 
    int upahHarian = 50000;
    
    public void TotalUpah(int jumlahMasuk){
        System.out.printf("Upah Karyawan Kontrak = %d\n", (upahHarian*jumlahMasuk)+getTunjanganAnak());
    }

}

public class Main {
    public static void main(String[] args) {
        KaryawanKontrak kryK1 = new KaryawanKontrak();
        KaryawanTetap kryT1 = new KaryawanTetap();
        kryT1.TotalGaji();
        kryK1.TotalUpah(25);
    }
}
