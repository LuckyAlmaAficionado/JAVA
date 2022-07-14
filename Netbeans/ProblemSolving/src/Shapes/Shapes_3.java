/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Shapes;

/**
 *
 * @author Lucky
 */
public class Shapes_3 {
    public static void main(String[] args) {
        int a = 99;
        
        
        for (int i = 0; i < a; i++) {
            for (int j = 1; j < a; j++) {
                if (j == 1) {
                    System.out.print("@");
                }else{
                    System.out.print("  ");
                }
                if (j == i) {
                    System.out.print("@");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < a; i++) {
            System.out.print("@ ");
        }
        System.out.println("");
    }
}
