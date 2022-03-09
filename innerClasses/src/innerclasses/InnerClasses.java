/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package innerclasses;
import java.util.*;
/**
 *
 * @author Lucky
 */
class OuterClass{
    int x = 10;
    
    class InnerClass{
        int y = 5;
    }
}

public class InnerClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("ini adalah Inner Class = " + myOuter.x);
        
    }
    
}
