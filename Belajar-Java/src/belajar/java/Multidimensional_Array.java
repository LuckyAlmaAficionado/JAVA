/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;

/**
 *
 * @author Lucky
 */
public class Multidimensional_Array {
    public static void main(String[] args) {
        int[][] multi = {{1,2,3,4}, {5,6,7,8}};
        
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.print("[" + multi[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
