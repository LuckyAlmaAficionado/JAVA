/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomor_1;

/**
 *
 * @author Lucky
 */
public class Lingkaran {
    double jari_jari;
    double phi = Math.PI;
    private static int jumlahLingkaran = 0;
    
    Lingkaran(){
        jumlahLingkaran++;
    }
    
    Lingkaran(double jari_jari){
        this.jari_jari = jari_jari;
        jumlahLingkaran++;
    }
    
    double getLuas(){
        return phi * (jari_jari * jari_jari);
    }
    
    double getKeliling(){
        return 2 * phi * jari_jari; 
    }
    
    static double getJumlahLigkaran(){
        return jumlahLingkaran;
    }
}
