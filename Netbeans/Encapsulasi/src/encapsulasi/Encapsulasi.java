/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulasi;

/**
 *
 * @author Lucky
 */
class Data{
    public int intPublic;
    private int intPrivate;
    
    public Data(){
        this.intPublic = 10;
        this.intPrivate = 20;
    }
    
    public int getIntPrivate(){
        return this.intPrivate;
    }
    
    public void setIntPrivate(int newValue){
        this.intPrivate = newValue;
    }
}

class New extends Data{
    
}

public class Encapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data data = new Data();
        data.intPublic = 20;
        System.out.println("data = " + data.intPublic);
        
        System.out.println("data private = " + data.getIntPrivate());
        
        data.setIntPrivate(90);
        System.out.println("data set private = " + data.getIntPrivate());
    }
    
}
