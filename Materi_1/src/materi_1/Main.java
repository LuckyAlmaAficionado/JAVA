/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package materi_1;

/**
 *
 * @author Lucky
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte a = 100;
        short b = 1000;
        int c = 10000;
        int c2 = 12345;
        int c3 = c + c2;
        float f = 234.5f;
        double d  = 123.4;
        char letterA = 'A';
        String pbo = "pbo";
                
        System.out.print("int c = " + c + "\ndouble d = "+ d);
//        System.out.print(letterA + " ");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
