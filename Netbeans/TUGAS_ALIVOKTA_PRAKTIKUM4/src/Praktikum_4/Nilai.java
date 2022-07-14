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
public class Nilai {
    
    private char nHuruf;
    private String predikat;
    
    char getNilHuruf(float nilai){
        if (nilai >= 85) {
            nHuruf = 'A';
        }else if(nilai >= 70 && nilai < 85){
            nHuruf = 'B';
        }else if(nilai >= 60 && nilai < 70){
            nHuruf = 'C';
        }else if(nilai >= 40 && nilai < 60){
            nHuruf = 'D';
        }else{
            nHuruf = 'E';
        }
        return nHuruf;
    }
    
    String getPredikat(char huruf){
        switch(huruf)
        {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }
        return predikat;
    }
    
    void cetakNilai(){
        Scanner inUser = new Scanner(System.in);
        System.out.print("Masukan Nim       : ");
        String nim = inUser.nextLine();
        System.out.print("Masukan Nama      : ");
        String nama = inUser.nextLine();
        System.out.print("Masukan Nilai TGS : ");
        double nTGS = inUser.nextDouble();
        System.out.print("Masukan Nilai UTS : ");
        double nUTS = inUser.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        double nUAS = inUser.nextDouble();
        double tempTGS = nTGS*0.2;
        double tempUTS = nUTS*0.35;
        double tempUAS = nUAS*0.45;
        double tempAll = tempTGS + tempUTS + tempUAS;
        System.out.println("\n====== DATA NILAI DAN KELULUSAN MAHASISWA ======");
        System.out.println("Nim         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Tugas : " + nTGS + " 20%      : " + tempTGS);
        System.out.println("Nilai UTS   : " + nUTS + " 35%      : " + tempUTS);
        System.out.println("Nilai UAS   : " + nUAS + " 45%      : " + tempUAS);
        System.out.println("Nilai Akhir : " + tempAll);
        System.out.println("Nilai Huruf : " + getNilHuruf((float)tempAll));
        System.out.println("Predikat    : " + getPredikat(getNilHuruf((float)tempAll)));
        System.out.println("====== DATA NILAI DAN KELULUSAN MAHASISWA ======\n");
    }
    
    public static void main(String[] args) {
        Nilai mhs = new Nilai();
        mhs.cetakNilai();
    }
}
