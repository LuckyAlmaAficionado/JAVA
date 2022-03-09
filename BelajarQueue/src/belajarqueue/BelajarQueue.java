/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarqueue;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class BelajarQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        
        System.out.println("Queue = " + q);
        
        q.remove();
        q.poll();
        System.out.println("Queue = " + q);
        System.out.println("Queue = " + q.element());
        System.out.println("Queue = " + q.peek());
        System.out.println("Queue = " + q.size());
        System.out.println("Queue = " + q.isEmpty());
    }
    
}
