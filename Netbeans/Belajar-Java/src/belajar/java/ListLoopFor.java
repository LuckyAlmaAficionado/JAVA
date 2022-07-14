/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;

/**
 *
 * @author Lucky
 */
public class ListLoopFor {
    public static void main(String[] args) {
        String[] name = {"A","B", "C", "D", "E"};
        int[] number = {12, 13, 14, 15, 16, 17};
        
        for(String i : name){
            System.out.println(i);
        }
        
        for(int x : number){
            System.out.println(x);
        }
    }
}
