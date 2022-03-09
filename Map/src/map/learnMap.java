/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Lucky
 */
public class learnMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, String> data = new HashMap<Integer, String>();
        Scanner inUser = new Scanner(System.in);
        String option, input;
        int a = 1, banyak_data = 0;
        
        System.out.print("masukan banyak data = ");
        banyak_data = inUser.nextInt();
        
        for (int i = 0; i < banyak_data; i++) {
            System.out.println("masukan data: ");
            input = inUser.nextLine();
            data.put(a, input);
            a++;
        }
        
        for (int x:data.keySet()){
            System.out.print(x + ", ");
            System.out.println(data.get(x));
        }
    }
    
}
