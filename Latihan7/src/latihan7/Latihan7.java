/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan7;

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

class Mobil2BMW extends Mobil2{
    String channel;
    
    public void hidupkanTv(String inUser){
        System.out.println("TV menyala");
        findChannel(inUser);
    }
    public void findChannel(String inUser){
        channel = inUser;
        System.out.printf("TV saluran %s\n", channel);
        menampilkanGambar();
    }
    public void menampilkanGambar(){
        System.out.println("Menampilkan Gambar");
    }
}

public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil2BMW bmw = new Mobil2BMW();
        bmw.hidupkanMobil();
        bmw.hidupkanTv("GTV");
        bmw.ubahGigi(3);
        bmw.matikanMobil();
    }
    
}
