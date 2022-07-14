/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.java;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucky
 */
public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        String nim = JOptionPane.showInputDialog("Enter your age");
        String temp = (name.equals("Lucky"))?(nim.equals("11202012797")?("Admin NIM"):("Admin Biasa")):("User Nama"); 
        JOptionPane.showMessageDialog(null, "Hello " + temp);
    }
}
