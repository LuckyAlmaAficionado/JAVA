/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PolymorphismTry;

/**
 *
 * @author Lucky
 */
class Mahasiswa{
    String name;
    int umur;
    
    Mahasiswa(String name, int umur){
        this.name = name;
        this.umur = umur;
    }
    
    void Display(){
        System.out.println("nama anda " + this.name + " dan umur anda " + this.umur);
    }
}

class NewMahasiswa extends Mahasiswa{
    String status = "baru";
    public NewMahasiswa(String name, int umur) {
        super(name, umur);
    }
    
    void Display(){
        super.Display();
        System.out.println("Status mahasiswa = " + this.status);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Lucky", 19);
        NewMahasiswa mhs2 = new NewMahasiswa("Alma", 20);
        Mahasiswa mhs3 = new NewMahasiswa("Aficionado", 21);
        mhs1.Display();
        mhs2.Display();
        mhs3.Display();
    }
}
