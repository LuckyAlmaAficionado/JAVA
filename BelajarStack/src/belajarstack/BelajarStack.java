/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarstack;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class BelajarStack {

    static void pushStack(Stack st, int a){
        st.push(a);
        System.out.println("Stack = " + st);
    }
    
    static void popStack(Stack st){
        st.pop();
        System.out.println("Stack = " + st);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Stack st = new Stack();
        System.out.println("Stack = " + st);
        pushStack(st, 35);
        pushStack(st, 13);
        pushStack(st, 25);
        popStack(st);
    }
    
}
