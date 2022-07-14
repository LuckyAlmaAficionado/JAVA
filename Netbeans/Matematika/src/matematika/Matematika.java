/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author Lucky
 */

class matematika{
    int a = 0, b = 0, hasil;
    
    void pertambahan(int x, int y){
        a = x;
        b = y;
        hasil = a + b;
    }
    void pengurangan(int x, int y){
        a = x;
        b = y;
        hasil = a - b;
    }
    void perkalian(int x, int y){
        a = x;
        b = y;
        hasil = a * b;
    }
    void pembagian(int x, int y){
        a = x;
        b = y;
        hasil = a / b;
    }
}

class matematikaDemo{
    int a = 0, b = 0, hasil;
    
    void pertambahan(int x, int y){
        a = x;
        b = y;
        hasil = a + b;
        System.out.printf("Pertambahan %d + %d = %d\n", a, b, hasil);
    }
    void pengurangan(int x, int y){
        a = x;
        b = y;
        hasil = a - b;
        System.out.printf("Pengurangan %d - %d = %d\n", a, b, hasil);
    }
    void perkalian(int x, int y){
        a = x;
        b = y;
        hasil = a * b;
        System.out.printf("Pengurangan %d x %d = %d\n", a, b, hasil);
    }
    void pembagian(int x, int y){
        a = x;
        b = y;
        hasil = a / b;
        System.out.printf("Pengurangan %d : %d = %d\n", a, b, hasil);
    }
}

public class Matematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matematikaDemo math = new matematikaDemo();
        
        math.pertambahan(10, 20);
        math.pengurangan(20, 10);
        math.perkalian(20, 10);
        math.pembagian(20, 10);
    }
    
}
