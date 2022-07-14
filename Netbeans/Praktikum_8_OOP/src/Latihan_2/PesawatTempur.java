
package Latihan_2;

public class PesawatTempur  extends  Pesawat{
    public PesawatTempur(){
        System.out.println("object pesawat tempur dibuat......");
    }
    
    public void manuver(){
        System.out.println("manuver......");
    }
    
    public void terbang(){
        super.terbang();
        System.out.println("terbang ala tempur.......");
    }
}
