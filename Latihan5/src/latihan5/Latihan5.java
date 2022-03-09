/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan5;

/**
 *
 * @author Lucky
 */
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10, y = 20;
        System.out.println(pengurangan(x, y));
        System.out.println(perkalian(x, y));
        System.out.println(pembagian(x, y));
    }
    
    static int pengurangan(int a, int b){
        return a - b;
    }
    
    static int pembagian(int a, int b){
        return a / b;
    }
    
    static int perkalian(int a,int b){
        return a * b;
    }
    
}
