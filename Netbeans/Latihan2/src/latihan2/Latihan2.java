/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan2;

/**
 *
 * @author Lucky
 */
class Mobil2{
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

public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil2 car = new Mobil2();
        car.hidupkanMobil();
    }
    
}
