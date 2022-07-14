/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pewarisan;

/**
 *
 * @author Lucky
 */
public class Manager extends Pegawai{

    private double bonus;
    
    public void getBonus(){
        
    }
    public void setBonus(double bonus){
        
    }
    public Manager(){
        
    }
    public Manager(int id, String name ,String deparment, double gaji, double bonus){
        super(id, name, deparment, gaji);
        this.bonus = bonus;
    }    
    public double computeSal(){
        return getGaji()+bonus;
    }
    public void accept(int id,String name, String deparment, double gaji, double bonus){
        setId(id);
        setName(name);
        setDepartment(deparment);
        setGaji(gaji);
        setBonus(bonus);
    }   
    public void display(){
        super.display();
        System.out.println("Bonus = " + bonus);
    }
}
