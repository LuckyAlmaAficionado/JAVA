/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LatihanBicycle;

/**
 *
 * @author Lucky
 */
public class Bicycle {
    int speed = 0;
    int gear = 0;
    
    void changeGear(int newValue){
        gear = gear + newValue;
        System.out.println("Gear: " + gear);
    }
    
    void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Speed: " + speed);
    }
}