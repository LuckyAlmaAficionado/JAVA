/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;

/**
 *
 * @author Lucky
 */
public class JavaMethod {
    static void myMethod(String name, int age){
        System.out.printf("Hello %s your age %d\n", name, age);
    }
   
    static int myMath(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        myMethod("Lucky", 19);
        System.out.println(myMath(5, 10));
        
    }
}
