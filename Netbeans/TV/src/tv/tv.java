/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tv;

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

public class tv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
    }
    
}
