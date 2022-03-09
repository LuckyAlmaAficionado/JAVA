/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TryException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
/**
 *
 * @author Lucky
 */
public class ExceptionVol0 {

    public static void main(String[] args) {
        try {
          File myObj = new File("G:/Coding/Java/Exception/src/exception/test.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
}
