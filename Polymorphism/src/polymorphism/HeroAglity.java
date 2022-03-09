/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package polymorphism;

/**
 *
 * @author Lucky
 */
public class HeroAglity extends Hero{
    String type = "Aglity";

    public HeroAglity(String nama) {
        super(nama);
    }
    
    void display(){
        super.display();
        System.out.println("Type Hero = " + type);
    }
}
