/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TryException;

/**
 *
 * @author Lucky
 */
public class ExceptionVol1 {
    public static void main(String[] args) {
        try {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
        } catch (Exception e) {
          System.out.println("Something went wrong." + e.getMessage());
        } finally {
          System.out.println("The 'try catch' is finished.");
        }
    }
}
