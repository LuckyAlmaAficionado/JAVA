package sarjana;
import sarjana.*;

public class Murid extends Orang{
    private int noInduk = 0;
    
    public Murid(String nama, String alamat, int noInduk){
        super(nama, alamat);
        setNoInduk(noInduk);
    }
    
    public Murid(){
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("No Induk: " + getNoInduk());
    }
    
    public int getNoInduk() {
        return this.noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }
    
}
