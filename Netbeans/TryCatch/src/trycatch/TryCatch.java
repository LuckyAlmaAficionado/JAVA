/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch;

/**
 *
 * @author Lucky
 */
class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
    void printType(String x){
        System.out.println(x + " is an String");
    }
}

public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Typetester test = new Typetester();
        int myNumber[] = {1,2,3,4,5};
        try{
            int tempInt = myNumber[2];
            String tempString = String.valueOf(tempInt);
            System.out.println("temp = " + tempString);
            test.printType(tempString);
        }catch(Exception e){
            System.out.println("something went wrong " + e.getMessage());
        }
    }
    
}
