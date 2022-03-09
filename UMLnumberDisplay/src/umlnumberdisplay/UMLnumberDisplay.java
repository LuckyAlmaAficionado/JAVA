/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package umlnumberdisplay;

/**
 *
 * @author Lucky
 */
class NumberDisplay{
    private int limit;
    private int value;
    
    NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int replacementValue){
        if (replacementValue > 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }
    
    public String getDisplayValue(){
        if (value < 10) {
            return "0" + value;
        }else{
            return "" + value;
        }
    }
    
    public void increment(){
        value = (value+1)%limit;
    }
 }
    
class ClockDisplay{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    public String displayString;

    ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    
    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(hour);
        minutes = new NumberDisplay(minute);
        updateDisplay();
    }
    
    public void timeTick(){
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    
    public void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
    
    
}

public class UMLnumberDisplay {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        ClockDisplay cd = new ClockDisplay();
        System.out.println(cd.displayString);
        cd.setTime(11, 58);
        System.out.println("After setTime = " + cd.displayString);
        cd.timeTick();
        System.out.println("After timeTick = " + cd.displayString);
    }    
    
}
