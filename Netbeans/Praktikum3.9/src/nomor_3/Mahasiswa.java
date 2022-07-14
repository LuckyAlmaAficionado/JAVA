/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package nomor_3;

/**
 *
 * @author Lucky
 */
public class Mahasiswa {
    String nim, nama, alamat;
    double ipk;
    
    Mahasiswa(){
        
    }
    
    Mahasiswa(String nim){
        this.nim = nim;
    }
    
    Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, String ipkBaru){
        nim = nimBaru;
        nama = namaBaru;
        alamat = alamatBaru;
        double temp = Double.parseDouble(ipkBaru);
        ipk = temp;
    }
    
    String predikat(double ipk){
        if (ipk < 2.75) {
            return "Memuaskan";
        }else if(ipk < 3.5 ){
            return "Sangat memuaskan";
        }else if(ipk <= 4.0){
            return "Dengan pujian";
        }
        return null;
    }
    
    void cetak(){
        System.out.println("Nama     = " + this.nama);
        System.out.println("Alamat   = " + this.alamat);
        System.out.println("NIM      = " + this.nim);
        System.out.println("IPK      = " + this.ipk);
        System.out.println("Predikat = " + predikat(this.ipk));
    }
}
