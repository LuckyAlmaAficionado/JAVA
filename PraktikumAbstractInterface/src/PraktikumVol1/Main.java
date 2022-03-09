/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PraktikumVol1;

/**
 *
 * @author Lucky
 */

// INTERFACE
interface Software{
    public void infoSoftware();
}

class TestSoftware implements Software{

    @Override
    public void infoSoftware() {
        System.out.println("Selamat menggunakan software ASUS");
    }
    
}

abstract class Component{
    int kondisi = 0;

    public void info(){
        System.out.println("Komponen untuk HP");
    }
    
    abstract void hidupkanHandphone();
    abstract void matikanHandphone();
}

class Handphone extends Component implements Software{
    
    @Override
    void hidupkanHandphone() {
        if (kondisi == 0) {
            kondisi = 1;
            System.out.println("handphone berhasil dinyalakan");
        }else{
            System.out.println("handphone sudah menyala");
        }
    }

    @Override
    void matikanHandphone() {
        if (kondisi == 1) {
            kondisi = 0;
            System.out.println("handphone berhasil dimatikan");
        }else{
            System.out.println("handphone sudah mati");
        }
    }

    @Override
    public void infoSoftware() {
        System.out.println("Software ASUS Zeanfone Max Pro M1 telah ter-install");
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        Handphone nokia = new Handphone();
        nokia.hidupkanHandphone();
        nokia.matikanHandphone();
        nokia.infoSoftware();
    }
}
