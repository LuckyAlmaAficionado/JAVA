
import PoliTest.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucky
 */
public class a2 extends a1{

    private int nim;
    
    public a2(String nama){
        super(nama);
    }
    
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    
    public static void main(String[] args) {
        a2 test = new a2("alma");
        test.cetak();
    }
}
