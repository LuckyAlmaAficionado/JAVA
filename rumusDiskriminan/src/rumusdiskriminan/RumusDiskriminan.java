/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rumusdiskriminan;

import java.util.Scanner;

/**
 *
 * @author Lucky
 */
class Math{
    private int a, b, c , d;
    void diskriminan(){
        Scanner inputUser = new Scanner(System.in);
        a = inputUser.nextInt();
        b = inputUser.nextInt();
        c = inputUser.nextInt();
        d = (b*b) - (4*(a)*(c));
        System.out.println("Hasil dari diskriminan adalah = " + d);
        if (d > 0) {
            System.out.printf("Diketahui nilai diskriminannya adalah %d atau D = %d > 0, maka persamaan kuadrat tersebut memiliki akar-akar real berlainan\n", d, d);
        }
    }
}

public class RumusDiskriminan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputUser = new Scanner(System.in);
        Math a = new Math();
        a.diskriminan();
    }
    
}
