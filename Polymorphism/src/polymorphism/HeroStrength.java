/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package polymorphism;

/**
 *
 * @author Lucky
 */
public class HeroStrength extends Hero{
    String type = "Strength";
    String nama;

    public HeroStrength(String name) {
        super(name);
    }
    
    void display(){
        super.display();
        System.out.println("Type Hero = " + type);
    }
    
    void showoff(){
        System.out.println("lmao");
    }
}
