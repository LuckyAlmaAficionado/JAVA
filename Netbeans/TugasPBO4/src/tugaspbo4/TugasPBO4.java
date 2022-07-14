/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo4;

/**
 *
 * @author Lucky
 */
public class TugasPBO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i > j) {
                    System.out.print("*");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < 5; j++) {
                if (i > j) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    
      
    }
    
}
