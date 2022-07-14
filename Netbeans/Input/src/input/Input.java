/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inUser = new Scanner(System.in);
        String name = "";
        int age = 0;
        System.out.print("masukan nama: ");
        name = inUser.nextLine();
        System.out.print("masukan umur: ");
        age = inUser.nextInt();
        
        System.out.printf("nama anda: %s dan umur anda: %d\n", name, age);
    }
    
}
