/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coretam;

/**
 *
 * @author Lucky
 */

class a{
    public void info_a(){
        System.out.println("info...a");
    }
}
class b extends a{
    public void info_b(){
        System.out.print("info...b");
    }
}
class c extends b{
    public void info_c(){
        System.out.print("info...c");
    }
}

public class test {

    
    public static void main(String[] args) {
        c Test = new c();
        Test.info_a();
        System.out.println("");
    }
}
