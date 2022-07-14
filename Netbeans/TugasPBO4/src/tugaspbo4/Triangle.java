/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tugaspbo4;

/**
 *
 * @author Lucky
 */
public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i % 2 == 0) {
                    if (i < j) {
                        System.out.print(" ");
                    }
                }
            }
            for (int j = 1; j <= 10; j++) {
                if (i % 2 == 0) {
                    if (i > j) {
                        System.out.print(" " + j);
                    }
                }
            }
            System.out.println("");
        }
    }
}
