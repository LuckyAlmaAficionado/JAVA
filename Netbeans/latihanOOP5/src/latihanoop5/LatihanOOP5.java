/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanoop5;

/**
 *
 * @author Lucky
 */
class Siswa{
    private String nama;
    private String nim;
    private int nilaiTeori;
    private int nilaiPraktek;
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTeori(int nilaiTeori) {
        this.nilaiTeori = nilaiTeori;
    }
    public void setPraktek(int nilaiPraktek) {
        this.nilaiPraktek = nilaiPraktek;
    }
    
    public String getNim() {
        return this.nim;
    }
    public String getNama() {
        return this.nama;
    }
    public int getTeori() {
        return this.nilaiTeori;
    }
    public int getPraktek() {
        return this.nilaiPraktek;
    }
    
    
}

public class LatihanOOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Siswa mhs1 = new Siswa();
        mhs1.setNama("Lucky Alma Aficionado Rigel");
        mhs1.setNim("A11.2020.12797");
        mhs1.setPraktek(90);
        mhs1.setTeori(100);
        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getNim());
        System.out.println(mhs1.getTeori());
        System.out.println(mhs1.getPraktek());
        
    }

}
