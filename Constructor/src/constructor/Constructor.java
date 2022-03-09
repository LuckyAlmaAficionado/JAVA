/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Constructor {
    int x;
    /**
     * @param args the command line arguments
     */
    public Constructor(){
        x = 5;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        Constructor obj = new Constructor();
        System.out.println(obj.x);
        
    }
    
}
