/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PraktikumVol2;

/**
 *
 * @author Lucky
 */
interface Handphone{    
    
    void On();
    void Off();
    void VolUp(int newVol);
    void VolDown(int newVol);
}

abstract class Software{
    abstract void Google();
    abstract void MobileLegend();
    abstract void Camera();
    abstract void Whatsapp();
    
    public void info(){
        System.out.println("kumpulan software untuk handphone");
    }
}

class AsusZenfone extends Software implements Handphone{
    boolean kondisi = false;
    int vol = 0;
    
    @Override
    void Google() {
        if (!kondisi) {
            System.out.println("Turn it on first");
        }else{
            System.out.println("What");
        }
    }

    @Override
    void MobileLegend() {
        if (!kondisi) {
            System.out.println("Turn it on first");
        }else{
            System.out.println("Welcome to mobile legends");
        }
    }

    @Override
    void Camera() {
        if (!kondisi) {
            System.out.println("Turn it on first");
        }else{
            System.out.println("Camera Open");
        }        
    }

    @Override
    void Whatsapp() {
        if (!kondisi) {
            System.out.println("Turn it on first");
        }else{
            System.out.println("Whatsapp Open");
        }
    }

    @Override
    public void On() {
        if (kondisi) {
            System.out.println("Handphone already on");
        } else {
            kondisi = true;
            System.out.println("Handphone turn on");
        }
    }

    @Override
    public void Off() {
        if (kondisi) {
            kondisi = false;
            System.out.println("Handphone turn off");
        }else{
            System.out.println("Handphone already off");
        }
    }

    @Override
    public void VolUp(int newVol) {
        if (!kondisi) {
            System.out.println("Turn it on first");
        }else{
            if (vol >= 100 || newVol >= 100) {
                vol = 100;
               System.out.println("Volume " + vol + "%");
            }else{
                vol += newVol;
                System.out.println("Volume " + vol + "%");
            }
        }
    }

    @Override
    public void VolDown(int newVol) {
        if (!kondisi) {
            System.out.println("Turn it on first");
        }else{
            if (newVol > vol) {
                vol = 0;
                System.out.println("Volume " + vol + "%");
            }else{
                vol -= newVol;
                System.out.println("Volume " + vol + "%");
            }
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        AsusZenfone hp = new AsusZenfone();
        hp.On();
//        hp.Off();
        hp.Whatsapp();
        hp.VolUp(150);
//        hp.VolDown(20);
//        hp.VolDown(20);
//        hp.VolDown(20);
        
    }
}
