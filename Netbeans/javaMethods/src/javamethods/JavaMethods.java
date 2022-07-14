/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamethods;

/**
 *
 * @author Lucky
 */
public class JavaMethods {

    /**
     * @param args the command line arguments
     */
    static void test1(){
        System.out.println("ini adalah method test1");
    }
    
    public void testPublic(){
        System.out.println("ini adalah method test public");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        test1();
        
        JavaMethods mgs = new JavaMethods();
        mgs.testPublic();
        
    }
    
}
