package sarjana;
public class Orang {
    private String nama;
    private String alamat;
    
    Orang(){}
    
    Orang(String nama, String alamat){
        setNama(nama);
        setAlamat(alamat);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void cetak(){
        System.out.println("Nama    : " + getNama());
        System.out.println("Alamat  : " + getAlamat());
    }
}

