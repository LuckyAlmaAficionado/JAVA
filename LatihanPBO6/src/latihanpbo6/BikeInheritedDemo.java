/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpbo6;

/**
 *
 * @author Lucky
 */
class Bicycle{
    int speed = 0;
    int gear = 0;
    
    void changeGear(int newValue){
        gear += newValue;
        System.out.println("Gear = " + gear);
    }
    
    void speedUp(int increment){
        speed += increment;
        System.out.println("Speed = " + speed);
    }
}

class RacingBike extends Bicycle{
    int tireSize;
    
    public void changeTireSize(int newTireSize){
        tireSize = newTireSize;
        System.out.println("Tire Size = " + tireSize);;
    }
}

class TandemBike extends Bicycle{
    int seat;
    
    public void totalSet(int newSeat){
        seat += newSeat;
        System.out.println("Seat = " + seat);
    }
}

public class BikeInheritedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RacingBike bike1 = new RacingBike();
        TandemBike bike2 = new TandemBike();
        
        System.out.println("bike1 class RacingBike");
        bike1.changeGear(4);
        bike1.speedUp(30);
        bike1.changeTireSize(3);
        
        System.out.println("\nbike2 class TandemBike");
        bike2.changeGear(3);
        bike2.speedUp(40);
        bike2.totalSet(2);
    }
    
}
