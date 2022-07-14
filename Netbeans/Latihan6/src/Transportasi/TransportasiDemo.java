/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Transportasi;

/**
 *
 * @author Lucky
 */
class Bicycle{
    int speed;
    int gear;
    
    void changeGear(int newValue){
        gear += newValue;
        System.out.println("Gear = " + gear);
    }
    
    void speedUp(int newValue){
        speed += newValue;
        System.out.println("speed = " + speed);
    }
}

class Mobil{
    public void hidupkanMobil(){
        System.out.println("Mobil hidup");
    }
    
    public void matikanMobil(){
        System.out.println("Mobil mati");
    }
    
    public void ubahGigi(int gear){
        System.out.println("Mobil dalam keadaan gigi " + gear);
    }
}

public class TransportasiDemo {

}
