package sarjana;
import sarjana.*;

public class Sarjana extends Murid{
    private double ipk;

    public Sarjana(String nama, String alamat, int nim, double ipk){
        super(nama, alamat, nim);
        setIpk(ipk);
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public Sarjana(){
        
    }
    
    public void reset(String nama, String alamat, int nim, double ipk){
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(nim);
        setIpk(ipk);
    }
    
    public String predikat(double ipk){
        String ket;
        
        if (ipk < 2.75){
            ket = "Memuaskan";
        }else if(ipk < 3.5){
            ket = "Sangat memuaskan";
        }else if(ipk < 4.0){
            ket = "Dengan pujian";
        }else{
            ket = "";
        }
        return ket;
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("IPK     : " + getIpk());
        System.out.println("Predikat: " + predikat(this.ipk));
    }
}
