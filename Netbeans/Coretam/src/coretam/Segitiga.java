/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coretam;

/**
 *
 * @author Lucky
 */
public class Segitiga {
    public static void main(String[] args) {
        int a = 5;
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == 0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
                if (j+1 == i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int j = 0; j <= a; j++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
