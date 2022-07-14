/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author Devan
 */
public class bike {

    static int speed;
    static int gear;

    static void changeGear(int newValue) {
        gear = gear +newValue;
        System.out.print("\nGear : " + gear);
    }

    static void speedUp(int increment) {
        speed = speed + increment;
        System.out.println(" \nspeed : " + speed);
    }
}