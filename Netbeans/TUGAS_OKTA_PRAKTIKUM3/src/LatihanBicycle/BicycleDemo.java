/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LatihanBicycle;

/**
 *
 * @author Lucky
 */
public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        
        bike.speed = 10;
        bike.gear = 2;
        
        bike.speedUp(10);
        bike.changeGear(2);
    }
}
