/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclass;

/**
 *
 * @author Lucky
 */
abstract class Resep{
    void cetakBiasa(){
        System.out.println("Resep");
    }
    
    // method abstract
    abstract void bahan_bahan();
    abstract void peralatan();
    abstract void proses_pembuatan();
}

public class AbstractClass extends Resep{
    void bahan_bahan(){
        System.out.println("Bahan");
    }
    void peralatan(){
        System.out.println("Peralatan");
    }
    void proses_pembuatan(){
        System.out.println("Pembuatan");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractClass tg = new AbstractClass();
        tg.cetakBiasa();
        tg.bahan_bahan();
        tg.peralatan();
        tg.proses_pembuatan();
    }
    
}
