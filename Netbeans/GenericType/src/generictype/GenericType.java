/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generictype;

/**
 *
 * @author Lucky
 */
class Box<Temp1, Temp2>{
    private Temp1 t;
    private Temp2 x;
    
    public void set(Temp1 t, Temp2 x){
        this.t = t;
        this.x = x;
    }
    public Temp1 getValue(){
        return t;
    }
    public Temp2 getValue1(){
        return x;
    }
}

public class GenericType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box temp = new Box();
        temp.set("u can write anything in here", 123456);
        System.out.println(temp.getValue1());
    }
    
}
