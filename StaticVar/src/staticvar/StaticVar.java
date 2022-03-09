/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticvar;

/**
 *
 * @author Lucky
 */
class Mobil{
    public static int gigi = 0;
    public int speedUp = 0;
    
    public int chageGear(int newGear){
        gigi += newGear; 
        return gigi;
    }
    
    public int speedMobil(int newSpeed){
        this.speedUp += newSpeed;
        return this.speedUp;
    }
}

public class StaticVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil bmw = new Mobil();
        
        bmw.speedMobil(6);
        bmw.chageGear(6);
        System.out.println("Change Gear = " + bmw.chageGear(4));
        System.out.println("Speed Mobil = " + bmw.speedMobil(100));
    }
    
}
