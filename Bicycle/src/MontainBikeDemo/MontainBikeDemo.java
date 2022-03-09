/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MontainBikeDemo;

/**
 *
 * @author Lucky
 */
class Bicycle{
    int speed = 0;
    int gear = 0;
    
    void chageGear(int newValue){
        gear += newValue;
        System.out.printf("Gear %d\n", gear);
    }
    
    void speedUp(int increment){
        speed += increment;
        System.out.printf("Speed %d\n", speed);
    }
}

class MontainBike extends Bicycle{
    int setHeight;
    
    public void setHeight(int newValue){
        setHeight = newValue;
        System.out.printf("Seat Height %d\n", setHeight);
    }
}

public class MontainBikeDemo {
    public static void main(String[] args) {
        MontainBike bike1 = new MontainBike();
        
        bike1.speedUp(5);
        bike1.chageGear(3);
        bike1.setHeight(5);
    }
}
