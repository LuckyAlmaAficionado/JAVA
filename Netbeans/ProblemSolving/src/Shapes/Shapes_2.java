/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Shapes;

/**
 *
 * @author Lucky
 */
public class Shapes_2 {
    public static void main(String[] args) {
        int a = 7;

        for (int i = a; i > 1; i--) {
            for (int j = 1; j < a; j++) {
                if (i > j) {
                    System.out.print(j);
                }
            }
            for (int j = 1; j <= a; j++) {
                if (i < j) {
                    System.out.print("&");
                }
            }
            System.out.println("");
        }
        
//        for (int i = 0; i < a; i++) {
//            for (int j = a; j > 1; j--) {
//                if (j > i) {
//                    System.out.print(j);
//                }
//            }
//            for (int j = 0; j < a; j++) {
//                if (j < i) {
//                    System.out.print("&");
//                }
//            }
//            System.out.println("");
//        }
    }
}
