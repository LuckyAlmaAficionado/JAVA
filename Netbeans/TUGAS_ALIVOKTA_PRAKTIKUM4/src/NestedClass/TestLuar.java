/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package NestedClass;

/**
 *
 * @author Lucky
 */
public class TestLuar {
    public static void main(String[] args) {
        Luar l = new Luar();
        Luar.Tengah t=l.new Tengah();
        Luar.Tengah.Dalam  d= t.new Dalam();
        l.cetakLuar();
        t.cetakTengah();
        d.cetakDalam();
    }
}
