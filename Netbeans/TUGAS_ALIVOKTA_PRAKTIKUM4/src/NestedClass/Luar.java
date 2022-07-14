/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package NestedClass;

/**
 *
 * @author Lucky
 */
public class Luar {
    void cetakLuar(){
        System.out.println("cetak luar...");
    }
    class Tengah{
        void cetakTengah(){
            cetakLuar();
            System.out.println("cetak tengah...");
        }
        class Dalam{
            void cetakDalam(){
                cetakLuar();
                cetakTengah();
                System.out.println("cetak dalam...");
            }
        }
    }
}

