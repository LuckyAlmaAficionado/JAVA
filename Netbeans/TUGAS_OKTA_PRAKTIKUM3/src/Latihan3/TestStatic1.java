/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Latihan3;

/**
 *
 * @author Lucky
 */
public class TestStatic1 {
    public static void main(String[] args) {
        TestStatic test = new TestStatic();
        test.satu();
        TestStatic.dua(); // bisa dipanggil langsung dengan nama class
        System.out.println("satu................a : " + test.a);
        System.out.println("satu................b : " + TestStatic.b);
        System.out.println("satu................c : " + test.c);
        System.out.println("satu................d : " + test.d);
//      System.out.println("satu................e : " + test.e); -> error karena deklarasi var private
    
    }
}
