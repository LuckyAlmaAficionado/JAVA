/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package InterfaceVol2;

/**
 *
 * @author Lucky
 */
public class Lampu implements IntLampu{

    private int statusLampu = 0;
    
    @Override
    public void hidupkan() {
        if (statusLampu == KeadaanMati) {
            statusLampu = KeadaanHidup;
            System.out.println("Hidupkan lampu! --> lampu menyala");
        }else{
            System.out.println("Hidupkan lampu! --> lampu sudah menyala");
        }
    }

    @Override
    public void matikan() {
        if (statusLampu == KeadaanHidup) {
            statusLampu = KeadaanMati;
            System.out.println("Matikan lampu! --> lampu dimatikan");
        }else{
            System.out.println("Matikan lampu! --> lampu sudah mati");
        }
    }
    
    public static void main(String[] args) {
        Lampu lamp = new Lampu();
        System.out.println("status lampu saat ini " + lamp.statusLampu);
        lamp.hidupkan();
        lamp.hidupkan();
        lamp.matikan();
        lamp.matikan();
    }
    
}
