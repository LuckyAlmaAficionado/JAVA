/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PoliTest;

/**
 *
 * @author Lucky
 */
public class a1 {
    private String nama;
    
    public a1(String nama){
        System.out.println("masuk sini");
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(){
        System.out.println("nama " + this.nama);
    }
}
