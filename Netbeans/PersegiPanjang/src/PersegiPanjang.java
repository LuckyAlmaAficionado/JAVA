public class PersegiPanjang {
    int panjang;
    int lebar;
    
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    int getLuas(){
        return panjang * lebar;
    }
    
    int getKeliling(){
        return 2 * (panjang * lebar);
    }
    
}
