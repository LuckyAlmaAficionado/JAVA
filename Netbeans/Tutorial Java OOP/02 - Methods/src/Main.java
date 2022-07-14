class Mahasiswa{
//    Data Member
    String nama;
    String NIM;
    
//    constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }
    
//    method tanpa return dan tanpa paramenter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }
    
//    method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }
    
//    method tanpa return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    
//    method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

class Dosen{
    String nama;
    
    Dosen(String nama){
        this.nama = nama;
    }
}

public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Lucky", "A11.2020.12797");
//        method
        mahasiswa1.show();
        mahasiswa1.setNama("Alma");
        mahasiswa1.show();
        
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        
        String data = mahasiswa1.sayHi("Ganteng");
        System.out.println(data);
        
        Dosen dosen1 = new Dosen("Aficionado");
        System.out.println(dosen1.nama);
    }
}
