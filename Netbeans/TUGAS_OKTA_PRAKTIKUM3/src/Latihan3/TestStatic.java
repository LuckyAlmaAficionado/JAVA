/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan3;

/**
 *
 * @author Lucky
 */
public class TestStatic {
    int a = 10;
    static int b = 20;
    protected int c = 30;
    public int d = 40;
    private int e = 50;
    void satu(){
        dua();
        System.out.println("satu................");
        System.out.println("satu................a : " + a);
        System.out.println("satu................b : " + b);
        System.out.println("satu................c : " + c);
        System.out.println("satu................d : " + d);
        System.out.println("satu................e : " + e);
    }
    
    static void dua(){
        // satu();
        System.out.println("dua..............." + b);
    }
    public static void main(String[] args) {
        TestStatic test = new TestStatic();
        test.satu();
        dua();
    }
}
