/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AbstractClassMain;

/**
 *
 * @author Lucky
 */
abstract class Pegawai{
    private String nama = "who i am";
    private String alamat;
    private int id;
    
    abstract double hitungGaji();
    public String getNama(){
        return this.nama;
    }
}

public class Main extends Pegawai{
    public static void main(String[] args) {
        Main krw = new Main();
        System.out.println(krw.hitungGaji());
    }

    @Override
    double hitungGaji() {
        System.out.println("menghitung gaji " + getNama());
        return 30*50000;
    }
}
