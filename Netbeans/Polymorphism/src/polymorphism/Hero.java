/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package polymorphism;

/**
 *
 * @author Lucky
 */
public class Hero {
    String name;
    
    Hero(String name){
        this.name = name;
    }
    
    void display(){
        System.out.println("Name = " + this.name);
    }
}
