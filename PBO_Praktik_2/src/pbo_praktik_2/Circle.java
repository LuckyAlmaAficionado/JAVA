/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pbo_praktik_2;

/**
 *
 * @author Lucky
 */
public class Circle {
    double radius;
    
    Circle(){
        
    }
    
    Circle(double newRadius){
        this.radius = newRadius;
    }
    
    double getArea(){
        return radius * radius * Math.PI;
    }
    
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double setRadius){
        this.radius = setRadius;
    }
    
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(25);
        Circle circle3 = new Circle();
        circle1.setRadius(1);
        circle3.setRadius(125);
        
        System.out.println("Luas Circle 1 = " + circle1.getArea());
        System.out.println("Keliling Circle 1 = " + circle1.getPerimeter());
        System.out.println("Luas Circle 2 = " + circle2.getArea());
        System.out.println("Keliling Circle 1 = " + circle1.getPerimeter());
        System.out.println("Luas Circle 3 = " + circle3.getArea());
        System.out.println("Keliling Circle 1 = " + circle1.getPerimeter());

    }
}
