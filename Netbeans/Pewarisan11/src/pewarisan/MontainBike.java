/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pewarisan;

/**
 *
 * @author Lucky
 */
public class MontainBike extends Bicycle{
    int seatHeight;
    
    public void setHeigt(int newValue){
        seatHeight += newValue;
        System.out.println("Seat Height = " + seatHeight);
    }
    
    public static void main(String[] args) {
        MontainBike mb = new MontainBike();
        mb.speedUp(10);
        mb.changeGear(3);
        mb.setHeigt(2);
    }
}
