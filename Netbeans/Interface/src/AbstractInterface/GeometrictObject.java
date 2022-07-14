/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AbstractInterface;

/**
 *
 * @author Lucky
 */
public abstract class GeometrictObject {

    private String color;
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
}
