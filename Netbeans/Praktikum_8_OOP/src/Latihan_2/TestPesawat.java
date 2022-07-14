
package Latihan_2;

public class TestPesawat {
    public static void main(String[] args) {
        Pesawat p1 = new Pesawat();
        PesawatTempur p2 = new PesawatTempur();
        System.out.println("...airbus...");
        p1.terbang();
        p1.mendarat();
        System.out.println("...f16....");
        p2.terbang();
        p2.mendarat();
        p2.manuver();
    }
}
