/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lucky
 */
public class Latihan_3 {
    int hari = 86400, jam = 3600, menit = 60, tempHari, tempJam, tempMenit, tempDetik;
    void proses(int detik){
        int count = detik;
        tempHari = count / hari;
        count -= hari * tempHari;
        tempJam = count / jam;
        count -= jam * tempJam;
        tempMenit = count / menit;
        count -= menit * tempMenit;
        tempDetik = count % 60;
        
        System.out.println("Detik   : " + detik);
        System.out.println("Hari    : " + tempHari);
        System.out.println("Jam     : " + tempJam);
        System.out.println("Menit   : " + tempMenit);
        System.out.println("Detik   : " + tempDetik);

    }
    
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        Latihan_3 test = new Latihan_3();
        int detik;
        
//        detik = inUser.nextInt();
        test.proses(180061);
    }
}
