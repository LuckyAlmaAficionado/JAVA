
package Contoh;


class PersegiPanjang {

    /**
     * @param args the command line arguments
     */
    double p, l, luas;
    
    void hitungLuas(){
        luas = p*l;
    }
    
    void cetak(){
        System.out.println("Panjang\t: "+p);
        System.out.println("Lebar\t: "+l);
        System.out.println("Luas\t: "+luas);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
