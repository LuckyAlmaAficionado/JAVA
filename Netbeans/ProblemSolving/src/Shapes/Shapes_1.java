/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Shapes;

/**
 *
 * @author Lucky
 */
public class Shapes_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 7;

        for (int i = 2; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i > j) {
                    System.out.print(j);
                }
                if (j > i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
