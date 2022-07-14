/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodarraylist;
import java.util.ArrayList;

/**
 *
 * @author Lucky
 */
public class MethodArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> data = new ArrayList<Integer>();
        
        data.add(30);
        data.add(31);
        data.add(32);
//        data.clear();
        System.out.println("data clone = " + data.clone());
        System.out.println("data contains = " + data.contains(30));
        System.out.println("data get = " + data.get(0));
        System.out.println("data isEmpty = " + data.isEmpty());
        System.out.println("data remove = " + data.remove(0));
        System.out.println("data size = " + data.size());
        System.out.println("data set = " + data.set(0, 50));
        
        for (int x : data){
            System.out.println(x);
        }
    }
    
}
