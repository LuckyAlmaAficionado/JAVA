/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanIterator;
import java.util.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Lucky
 */
public class LatihanIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        Scanner inUser = new Scanner(System.in);
        Set<String> data = new TreeSet<String>();
        data.add("Dilan 1990");
        data.add("Laskar Pelangi");
        data.add("Mahaguru");
        data.add("Mengejar Matahari");
        data.add("Dilan 1991");
        data.add("Milea");
        data.add("Perahu Kertas");
        data.add("Laskar Pelangi");
        data.add("Perahu Kertas");        
        
        for (Iterator<String> iterator = data.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.print(a += 1);
            System.out.println(". " + string);
        }
        
        
//        data.remove(0);
        System.out.print("Judul buku yang dipinjam = ");
        String input = inUser.nextLine();
        
        data.contains(input);
        data.remove(input);
        a = 1;
        
        for (String x : data){
            System.out.println(a + ". " + x);
            a+=1;
        }
        
    }
    
}
