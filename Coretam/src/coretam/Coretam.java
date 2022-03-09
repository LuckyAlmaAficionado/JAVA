/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coretam;

/**
 *
 * @author Lucky
 */
public class Coretam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        for (int i = 1; i < n+2; i++) {
            for (int j = 1; j < n+2; j++) {
                if (j > i) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= n+2; j++) {
                if (i > j) {
                    if (i%2 == 0) {
                        System.out.print(" " + j);
                    }
                }
            }
            if (i%2==1) {
                System.out.println("");
            }
        }
    }
    
}
