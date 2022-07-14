/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LibraryDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Lucky
 */
public class MathDate {
    public static void main(String[] args) {
        System.out.println("Absolut -25 = " + Math.abs(-25));
        System.out.println("Sin 0 = " + Math.sin(0) + ", cos 0 = " + Math.cos(0) + ", tan 0 = " + Math.tan(0));
        System.out.println("9 pangkat 3 = " + Math.pow(9, 2));
        System.out.println("Floor 3.14 = " + Math.floor(3.14)); // pembulatan kebawah
        
        System.out.println("\nClass Library");
        Date tanggal = new Date();
        System.out.println("Original = " + tanggal);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MM YYYY");
        System.out.println("Format 1 = " + sdf1.format(tanggal));
        System.out.println("Format 1 = " + sdf2.format(tanggal));
        
        System.out.println("\nLibrary Calender ");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 3);
        Date tigaharilagi = cal.getTime();
        System.out.println("3 hari lagi = " + tigaharilagi);
    }
}
