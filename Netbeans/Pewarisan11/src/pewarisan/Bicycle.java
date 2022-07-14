/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pewarisan;

/**
 *
 * @author Lucky
 */
public class Bicycle {

    int speed = 0;
    int gear = 10;
    
    void changeGear(int newValue){
        gear += newValue;
        System.out.println("Gear = " + gear);
    }
    
    void speedUp(int increment){
        speed += increment;
        System.out.println("speed = " + speed);
    }
}
