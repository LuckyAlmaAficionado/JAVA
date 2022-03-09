/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulationatribut;

/**
 *
 * @author Lucky
 */
class Manipulasi1{
    private String nama;
    
    Manipulasi1(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
}

class Manipulasi2{
    Manipulasi1 namaOrang;
    
    Manipulasi2(String newName){
        namaOrang = new Manipulasi1(newName);
        displayNama();
    }
    
    public void displayNama(){
        System.out.println("Nama anda adalah = " + namaOrang.getNama());
    }
}

public class ManipulationAtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manipulasi2 orng = new Manipulasi2("Lucky");
        
        
    }
    
}
