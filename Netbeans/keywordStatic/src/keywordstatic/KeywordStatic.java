/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keywordstatic;

/**
 *
 * @author Lucky
 */
class Test{
    public int counter = 1;
    
    public int getCounter(){
        return counter;
    }
    
    public void addCounter(){
        counter += 1;
    }
    
    public static void fungsiStatic(){
        System.out.println("ini fungsi static");
    }
    
    public void fungsiBiasa(){
        System.out.println("ini fungsi biasa");
    }
}

public class KeywordStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();
        
        obj1.addCounter();
        System.out.println("Counter milik obj1 = " + obj1.getCounter());
        System.out.println("Counter milik obj2 = " + obj2.getCounter());
        System.out.println("Counter milik obj3 = " + obj3.getCounter());
        Test.fungsiStatic();
        Test objk = new Test();
        objk.fungsiBiasa();
    }
    
}
