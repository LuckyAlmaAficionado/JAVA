/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AbstractInterface;

/**
 *
 * @author Lucky
 */
public class Demo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("The circle's area is " + c.getArea());
        System.out.println("The circle's perimeter is " + c.getPerimeter());
        c.application();
        
        System.out.println("");
        
        Square s = new Square();
        s.application();
        
    }
}
