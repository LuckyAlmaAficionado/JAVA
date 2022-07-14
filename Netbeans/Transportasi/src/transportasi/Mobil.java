/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author Devan
 */
public class Mobil {
    int roda = 4;
    int mesin = 1;
    static int body =1;
    int off = 1;
    
    String warna;
    
    public static void maju(){
        System.out.println("Maju.....");
    }
    public void mundur(){
        System.out.println("Mundur.....");
    }
    public void belok(){
        System.out.println("Belok.....");
    }
    public void hidupkanMobil(){
        System.out.println ("Hidupkan Mobil : Avanza Silver");
    off = 0;
    }
    public void matikanMobil(){
    off = 1; //tanda bahwa mesin mobil mati
        System.out.println ("Matikan Mobil  : Avanza Silver ");
    }
    public void UbahGigi(){
        System.out.println ("Ubah Gigi Mobil : Avanza Silver");
    }
    
}
