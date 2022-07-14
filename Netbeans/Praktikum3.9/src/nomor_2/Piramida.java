/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package nomor_2;

/**
 *
 * @author Lucky
 */
public class Piramida {
    // T = tinggi
    // LA = luas alas
    
    double a, t, rumus = 0.3333333333333333;
    
    Piramida(){
        
    }
    
    Piramida(double a, double t){
        this.a = a;
        this.t = t;
    }
    
    double getVolumeLimas(){
        double volume = rumus * a * a * t;
        return volume;
    }
    
    void gambarLimas2D(int tinggi){
        System.out.println("\nGambar Limas 2D");
        for (int i = 0; i < tinggi+1; i++) {
            for (int j = 0; j < tinggi+1; j++) {
                if (j > i) {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < tinggi+1; j++) {
                if (j < i) {
                    System.out.print("   *");
                }
            }
            System.out.println("");
        }
        
        System.out.println("    Gambar Limas 2D");
    }
}
