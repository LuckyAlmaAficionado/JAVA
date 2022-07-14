/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package nomor_1;

/**
 *
 * @author Lucky
 */
public class DemoLingkarang {
    public static void main(String[] args) {
        Lingkaran lingkaran_1 = new Lingkaran();
        Lingkaran lingkaran_2 = new Lingkaran();
        lingkaran_2.jari_jari = 20;
        Lingkaran lingkaran_3 = new Lingkaran(20);
        
        // keliling lingkaran
        System.out.println("Keliling Lingkaran");
        System.out.println("Lingkaran 1 = " + lingkaran_1.getKeliling());
        System.out.println("Lingkaran 2 = " + lingkaran_2.getKeliling());
        System.out.println("Lingkaran 3 = " + lingkaran_3.getKeliling());

        // luas lingkaran
        System.out.println("\nLuas Lingkaran");
        System.out.println("Lingkaran 1 = " + lingkaran_1.getLuas());
        System.out.println("Lingkaran 2 = " + lingkaran_2.getLuas());
        System.out.println("Lingkaran 3 = " + lingkaran_3.getLuas());
        
        System.out.println("\nJumlah Lingkaran = " + Lingkaran.getJumlahLigkaran());

    }
}
