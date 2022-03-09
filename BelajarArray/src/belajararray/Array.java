/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package belajararray;
import java.util.*;
/**
 *
 * @author Lucky
 */
class Mahasiswa{
    protected String nama;
    
    Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public String getName(){
        return this.nama;
    }
}

public class Array {
    public static void main(String[] args) {
        int max = 5;
        String input;
        Mahasiswa[] mahasiswa = new Mahasiswa[max];
        Scanner inUser = new Scanner(System.in);

        for (int i = 0; i < max; i++) {
            input = inUser.nextLine();
            mahasiswa[i] = new Mahasiswa(input);
        }

//        mahasiswa[0] = new Mahasiswa("Lucky");
//        mahasiswa[1] = new Mahasiswa("Alma");
//        mahasiswa[2] = new Mahasiswa("Aficionado");
        
        
        
        for (Mahasiswa x : mahasiswa){
            try {
                System.out.println("nama mhs = " + x.getName());
            } catch (Exception e){
                break;
            }
        }
    }
}
