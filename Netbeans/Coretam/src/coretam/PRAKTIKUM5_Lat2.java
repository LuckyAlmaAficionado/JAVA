/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coretam;

import java.util.ArrayList;

/**
 *
 * @author Devan
 */
public class PRAKTIKUM5_Lat2 {

    public static void main(String[] args) {
        double[] nilaiMhsA = new double[40];
        nilaiMhsA[0] = 80;
        nilaiMhsA[1] = 95.90;
        char[] nama = {'B', 'u', 'd', 'i'};
        System.out.println(nama);
        String[] namaMhsA = {"Budi", "Turmidi"};
        System.out.println(namaMhsA[1]);
        System.out.println("");
        
        System.out.println("ArrayList");
        ArrayList<Double> nilaiMhs = new ArrayList<Double>();
        nilaiMhs.add(90.5);
        nilaiMhs.add(80.0);
        System.out.println("Ada "+nilaiMhs.size()+" nilai mahasiswa yaitu "+nilaiMhs);
        nilaiMhs.add(77.7);
        nilaiMhs.add(1, 50.3);
        System.out.println("Ada "+nilaiMhs.size()+" nilai mahasiswa yaitu "+nilaiMhs);
        nilaiMhs.remove(50.3);
        System.out.println("Ada "+nilaiMhs.size()+" nilai mahasiswa yaitu "+nilaiMhs);
        System.out.println("");
        ArrayList<String> namaMhs = new ArrayList<String>();
        namaMhs.add("Budi");
        namaMhs.add("Turmidi");
        System.out.println("Ada "+namaMhs.size()+" nilai mahasiswa yaitu "+namaMhs);
        System.out.println("");
        ArrayList al = new ArrayList();
        al.add("Kaspar");
        al.add("Munted");
        al.add("Kastam");
        al.add("Kunjurus");
        System.out.println("Ada "+al.size()+" nilai mahasiswa yaitu "+al);
    }
    
}