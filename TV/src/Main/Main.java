/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Main;

/**
 *
 * @author Lucky
 */

class TV{
    int channel = 1, volumeLevel = 1;
    boolean on = false;
    
    TV() { 
    
    }
    
    public void turnOn() {
        this.on = true;
    }
    
    public void turnOff() {
        this.on = false;
    }
    
    public void setChannel(int newChannel) {
        this.channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel) {
        this.volumeLevel = newVolumeLevel;
    }
    
    public void channelUp() {
        this.channel += 1;
    }
    
    public void channelDown() {
        this.channel -= 1;
    }

    public void volumeUp() {
        this.volumeLevel += 1;
    }
    
    public void volumeDown() {
        this.volumeLevel -= 1;
    }
}

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("Tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("Tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
