/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedclass;

/**
 *
 * @author Lucky
 */
class Luar{
    void cetakLuar(){
        System.out.println("cetak luar");
    }
    class Tengah{
        void cetakTengah(){
            cetakLuar();
            System.out.println("cetak tengah");
        }
        class Dalam{
            void cetakDalam(){
                cetakLuar();
                cetakTengah();
                System.out.println("cetak dalam");
            }
        }
    }
}

class OuterClass{
    private String msg = "ini pesan rahasia";
//    public static class NestedStaticClass{
//        public void printMessage(){
//            System.out.println(msg);
//        }
//    }
    public class InnerClass{
        public void display(){
            System.out.println("Message from non-static nested class: " + msg);
        }
    }
}

public class NestedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Luar myOuter = new Luar();
        Luar.Tengah myMiddle = myOuter.new Tengah();
        Luar.Tengah.Dalam myInside = myMiddle.new Dalam();
        myInside.cetakDalam();
        
        OuterClass data = new OuterClass();
        OuterClass.InnerClass showData = data.new InnerClass();
        showData.display();
    }
    
}
