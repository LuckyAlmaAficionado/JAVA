package Latihan_3;

public class Circle extends Shape{
    private double radius = 1.0;
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        setRadius(radius);
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return 0;
    }
    
    public double getPerimeter(){
        return 0;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
}
