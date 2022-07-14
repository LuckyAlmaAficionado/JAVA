/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometricobjectandcircle;

/**
 *
 * @author Lucky
 */

abstract class Test{
    abstract void temp();
    abstract int temp1();
}

class Temp extends Test{
    void temp(){
        
    }
    int temp1(){
        return 0;
    }
}

abstract class GeometricObject{
    private String color;
    
    public void setColor(String newColor){
        this.color = newColor;
    }
    
    public String getColor(){
        return color;
    }
    
//    Abstract Method
    public abstract double getArea();
    public abstract double getPerimeter();
    
}

class Circle extends GeometricObject{
    private double radius;
    
    public void setRadius(double newValue){
        this.radius = newValue;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
}

public class GeometricObjectandCircle {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("The circle's area is " + c.getArea());
        System.out.println("The circle's perimeter is " + c.getPerimeter());
    }
    
}
