/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superclass;

/**
 *
 * @author Lucky
 */
class Animal{
    String hewan = "kucing";
    
    String eat(){
        return "makanan kucing";
    }
}

class Dog extends Animal{
    String hewan = "anjing";
    
    public void info() {
        System.out.println("hewan = " + hewan);
        System.out.println("hewan super = " + super.hewan);
    }
    
    String eat(){
        String e = " makanan anjing";
        return super.eat() + e;
    }
}

public class SuperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog animal = new Dog();
        animal.info();
        System.out.println(animal.eat());
    }
    
}
