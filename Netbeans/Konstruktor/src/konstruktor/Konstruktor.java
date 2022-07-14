/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konstruktor;

/**
 *
 * @author Lucky
 */
class Mobil{
    private String warna;
    private int tahunProduksi;
    
    public Mobil(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public void info(){
        System.out.println("Warna : " + this.warna);
        System.out.println("Tahun Produksi : " + this.tahunProduksi);
    }
}

public class Konstruktor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil car = new Mobil("Merah", 1991);
        car.info();
    }
    
}
