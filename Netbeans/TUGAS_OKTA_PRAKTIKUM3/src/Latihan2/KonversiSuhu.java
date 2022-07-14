/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan2;

/**
 *
 * @author Lucky
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        double celcius = 3;
        
        double kelvin = celcius + 273.15;
        double fahrenheit = celcius * 1.8 + 32;
        double rankine = celcius * 1.8 + 491.67;
        double delisle = (100 - celcius) * 1.5;
        double newton = celcius * 33 / 100;
        double reaumur = celcius * 0.8;
        double romer = celcius * 21/40 + 7.5;
        
        
        System.out.println("Kelvin = " + kelvin);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Rankine = " + rankine);
        System.out.println("Delisle = " + delisle);
        System.out.println("Newton = " + newton);
        System.out.println("Reaumur = " + reaumur);
        System.out.println("Romer = " + romer);
    }
}
