class Polos{
    String dataString;
    int dataInteger;
}

//class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    
//    constructor dipanggil saat pertama kali dibuat
//    Mahasiswa(){
//        System.out.println("ini adalah constructor");
//    }
    
//    constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
        System.out.println("\n");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Lucky", "A11.2020.12797", "Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Alma", "A11.2020.12798", "Teknik Informatika");

//        Polos objectPolos = new Polos();
//        objectPolos.dataString = "polos";
//        objectPolos.dataInteger = 0;
//        
//        System.out.println(objectPolos.dataString);
//        System.out.println(objectPolos.dataInteger);
    }
}
