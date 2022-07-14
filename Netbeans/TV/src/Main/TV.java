public class TV {
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
