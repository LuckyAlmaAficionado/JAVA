/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_2;

/**
 *
 * @author Lucky
 */
public class RumusABC {
    int a, b, c;
    int D, x1, x2;

    void rumus(int a, int b, int c){
        D = (int) Math.pow(b, 2) - (4*a*c);
        System.out.println(D);
        int akar = (int) Math.sqrt(D);
        if (D > 0) {
            x1 = (-b + akar)/(2*a);
            x2 = (-b - akar)/(a*a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }else if(D == 0){
            x1 = x2 = -b / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }else{
            x1 = (-b / (2*a)) + ((int) Math.sqrt(-D) / (2 * a));
            x2 = (-b / (2*a)) - ((int) Math.sqrt(-D) / (2 * a));
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }

    public static void main(String[] args) {
        RumusABC x = new RumusABC();
        x.rumus(-3, 11, 67);
    }
    
}
