/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Lucky
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero hero = new Hero("Ucup");
        HeroStrength hero1 = new HeroStrength("Lucky");
        hero.display();
        hero1.display();
        
        Hero baru = new HeroStrength("alma");
        baru.display();
        
        HeroStrength[] arr = new HeroStrength[3];
        arr[0] = hero1;
        
        arr[0].display();
        arr[0].showoff();
        
    }
    
}
