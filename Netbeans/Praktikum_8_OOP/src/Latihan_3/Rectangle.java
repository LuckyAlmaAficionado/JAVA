package Latihan_3;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle() {
    }
    
    public Rectangle(double widht, double lenght){
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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
