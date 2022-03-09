/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;

/**
 *
 * @author Lucky
 */
public class MathOperation {
    public static void main(String[] args) {
        // max value
        System.out.println(Math.max(5,10));
        // min value
        System.out.println(Math.min(5, 10));
        // sqrt
        System.out.println(Math.sqrt(4));
        // abs
        System.out.println(Math.abs(-4.7));
        // random value between 0.0 and 1.0
        System.out.println(Math.random());
        // random value between 0 - 100
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
    }
}
