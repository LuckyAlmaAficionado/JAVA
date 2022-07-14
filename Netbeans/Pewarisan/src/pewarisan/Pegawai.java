/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pewarisan;

/**
 *
 * @author Lucky
 */
public class Pegawai {
    private int id;
    private String name;
    private String department;
    private double gaji;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public double getGaji(){
        return gaji;
    }
    public void setGaji(double gaji ){
        this.gaji = gaji;
    }
    public Pegawai(){
        
    }
    public Pegawai(int id, String name, String deparment, double gaji){
        this.id = id;
        this.name = name;
        this.department = deparment;
        this.gaji = gaji;
        setId(id);
        setName(name);
        setDepartment(department);
        setGaji(gaji);
    }
    public void display(){
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Department = " + department);
        System.out.println("Gaji = " + gaji);
    }
}
