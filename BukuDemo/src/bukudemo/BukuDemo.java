/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bukudemo;

/**
 *
 * @author Lucky
 */
class Buku{
    String judul, pengarang, penerbit;
    int tahun;
    
    public Buku(String judul, String pengarang, String penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public void cetakBuku(){
        System.out.printf("Judul Buku : %s\nPengarang  : %s\nPenerbit   : %s\nTahun      : %d\n",this.judul,this.pengarang,this.penerbit,this.tahun);
        System.out.println("");
    }
}

public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku book1 = new Buku("Kukira Kau Rumah", "Ahmad Susanto", "Gramedia", 2021);
        Buku book2 = new Buku("Java", "Ajib", "Andi", 2007);
        book1.cetakBuku();
        book2.cetakBuku();
    }
    
}
