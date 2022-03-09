/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bahan_materi_ajar;

/**
 *
 * @author Lucky
 */
public class Looping {
    public static void main(String[] args) {

        // for
        System.out.println("for");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        
        
        // while
        int x = 0;
        System.out.println("while");
        while (x < 5) {            
            System.out.println(x);
            x++;
        }
        
        // dowhile
        int j = 0;
        System.out.println("doWhile");
        do{
            System.out.println(j);
            j++;
        }while(j < 5);
        
    }
}
