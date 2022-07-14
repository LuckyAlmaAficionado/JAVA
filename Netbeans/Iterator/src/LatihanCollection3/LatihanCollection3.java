/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LatihanCollection3;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Lucky
 */
public class LatihanCollection3 {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("Microsoft", "Bill Gates");
        data.put("Apple", "Steve Paul Jobs");
        data.put("Linux", "Linux Benedict Torvalds");
        data.put("Facebook", "Mark Zuckerberg");
        data.put("Twitter", "Jack Dorsey");
        data.put("Instagram", "Kevin Systrom");
        
        for (String x: data.keySet()){
            System.out.print(x.toUpperCase() + " dikembangkan oleh ");
            System.out.println(data.get(x)); 
        }
        
        
        
    }
}
