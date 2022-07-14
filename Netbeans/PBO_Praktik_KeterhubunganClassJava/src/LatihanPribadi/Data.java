/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LatihanPribadi;

/**
 *
 * @author Lucky
 */
public class Data {
    String id_data;
    private Mahasiswa[] data = new Mahasiswa[3];
    int countData;
    
    Data(String id_data){
        this.id_data = id_data;
    }
    
    public void setMahasiswa(Mahasiswa f){
        data[countData] = f;
        countData++;
    }
    
    public void getMahasiswa(){
        for (int i = 0; i < countData; i++) {
            System.out.println(data[i].getNameMahasiswa());
        }
    }
    
    public static void main(String[] args) {
        Data mhs1 = new Data("Lucky");
        mhs1.setMahasiswa(new Mahasiswa("Alma1"));
        mhs1.setMahasiswa(new Mahasiswa("Alma2"));
        mhs1.setMahasiswa(new Mahasiswa("Alma2"));
        
        mhs1.getMahasiswa();
    }
}
