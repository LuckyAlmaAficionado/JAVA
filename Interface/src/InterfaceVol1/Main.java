/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package InterfaceVol1;

/**
 *
 * @author Lucky
 */
public class Main implements Komponen{
    @Override
    public void mesin() {
        System.out.println("kecepatan mesin = " + kecepatan);
    }

    @Override
    public void design() {
        System.out.println("design mobil = " + model);
    }
    
    public static void main(String[] args) {
        Main car1 = new Main();
        car1.mesin();
        car1.design();
    }
}
