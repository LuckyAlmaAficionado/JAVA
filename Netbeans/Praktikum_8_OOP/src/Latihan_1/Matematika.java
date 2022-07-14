
package Latihan_1;

public class Matematika {
    
    private double hasil;
    
    public void tambah(double a, double b){
        hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil);
    }
    
    // overloading
    public void tambah(double a, double b, double c){
        hasil = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + hasil);
    }
    
    public void kurang(double a, double b){
        hasil = a - b;
        System.out.println(a + " - " + b + " = " + hasil);
    }
    
    // overloading
    public void kurang(double a, double b, double c){
        hasil = a - b - c;
        System.out.println(a + " - " + b + " - " + c + " = " + hasil);
    }
    
        
    public void kali(double a, double b){
        hasil = a * b;
        System.out.println(a + " x " + b + " = " + hasil);
    }
    
    // overloading
    public void kali(double a, double b, double c){
        hasil = a * b * c;
        System.out.println(a + " x " + b + " x " + c + " = " + hasil);
    }
        
    public void bagi(double a, double b){
        hasil = a / b;
        System.out.println(a + " / " + b + " = " + hasil);
    }
    
    // overloading
    public void bagi(double a, double b, double c){
        hasil = a / b / c;
        System.out.println(a + " / " + b + " / " + c + " = " + hasil);
    }
    
}
