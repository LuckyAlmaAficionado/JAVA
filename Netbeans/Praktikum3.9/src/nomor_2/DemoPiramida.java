/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package nomor_2;

/**
 *
 * @author Lucky
 */
public class DemoPiramida {
    public static void main(String[] args) {
        Piramida piramida = new Piramida(9,8);
        
        System.out.println("Volume piramida = " + piramida.getVolumeLimas() + " Cm³");
        piramida.gambarLimas2D(5);
    }
}
