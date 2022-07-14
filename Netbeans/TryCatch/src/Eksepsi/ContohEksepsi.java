/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Eksepsi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucky
 */
public class ContohEksepsi {
    
    public static void main(String[] args) {
        // checked
        File file = new File("G:\\Coding\\Java\\TryCatch\\src\\Eksepsi\\kertas.txt");
        FileReader fr = new FileReader(file);
        
        //unchecked
        int num[] = {1,2,3,4};
//        System.out.println(num[5]);

        try{
            
        }catch(){
            
        }catch(){
            
        }
    }
}
