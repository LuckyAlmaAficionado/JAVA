/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LatihanPribadi;

/**
 *
 * @author Lucky
 */
public class Mahasiswa {
    private String nama;
    private Data[] mhs = new Data[2];
    
    Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public String getNameMahasiswa(){
        return nama;
    }
}
