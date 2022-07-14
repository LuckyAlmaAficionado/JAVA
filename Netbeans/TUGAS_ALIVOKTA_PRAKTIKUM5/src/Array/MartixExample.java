/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Array;

/**
 *
 * @author Lucky
 */
public class MartixExample {
    public static void main(String[] args) {
        int array[][] = {{1,3,5}, {2,4,6}};
        System.out.println("Row size = " + array.length);
        System.out.println("Column size = " + array[1].length);
        outputArray(array);
    }
    
    public static void outputArray(int[][] array){
        int rowSize = array.length;
        int columnSize = array[0].length;
        for (int i = 0; i <= 1; i++) {
            System.out.print("[");
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println(" ]");
        }
        System.out.println("");
    }
}
