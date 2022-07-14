/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;

/**
 *
 * @author Lucky
 */
public class StringOperation {
    public static void main(String[] args) {
        String name = "Lucky Alma Aficionado Rigel ";
        String name1 = "Deniz Ghallen Putra Rachmat";
//        length of a string 
        System.out.println(name.length());
//        Uppercase and Lowercase a string
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
//        find location a string
        System.out.println(name.indexOf("Rigel"));
//        for concatenate a string
        System.out.println(name.concat(name1));
    }
}
