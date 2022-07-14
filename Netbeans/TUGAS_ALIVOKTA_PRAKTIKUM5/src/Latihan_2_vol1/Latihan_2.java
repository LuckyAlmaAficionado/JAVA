/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan_2_vol1;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Latihan_2 {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.print("Bilangan : ");
        int bil = inUser.nextInt();
        for (int i = 1; i <= bil; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println("");
            }
        }
        System.out.println("-----------");
        System.out.print("Dipecah : ");
        int dipecah = inUser.nextInt();
        for (int i = 1; i <= bil; i++) {
            System.out.print(i + " ");
            if (i % dipecah == 0) {
                System.out.println("");
            }
        }
    }
}
