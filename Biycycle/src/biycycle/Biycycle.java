/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biycycle;

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

public class Biycycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bike = new Bicycle();
        
        bike.speed = 10;
        bike.gear = 10;
        
        bike.speedUp(10);
        bike.changeGear(2);
    }
    
}
