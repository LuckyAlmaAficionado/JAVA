/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Transportasi;
import Transportasi.Bicycle;
import Transportasi.Mobil;
/**
 *
 * @author Lucky
 */
public class Transportasi {
    public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        Mobil car = new Mobil();
        sepeda.changeGear(3);
        sepeda.speedUp(80);
        
        car.hidupkanMobil();
        car.matikanMobil();
        car.ubahGigi(4);
    }
}
