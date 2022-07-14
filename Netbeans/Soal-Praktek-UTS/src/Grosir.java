import java.util.Scanner;

public class Grosir {
    
    int NomorNota, JumlahPenjualan, JenisPembayaran,KeteranganPembayaran, WaktuJatuhTempo;
    double TotalBayar, SukuBunga, TotalPenjualan, PajakPertambahanNilai, HargaJualProduk;
    String souvenir;
    
    Scanner inUser = new Scanner(System.in);
    
    Grosir(String cabang) {
        System.out.println("Grosir Parcel -" + cabang);
    }
    
    public void setNota(int NomorNota) {
        this.NomorNota = NomorNota;
        System.out.println(this.NomorNota);
    }
    
    public void inputJumlah() {
        System.out.print("Jumlah Jual : ");
        JumlahPenjualan = inUser.nextInt();
    }
    
    public double getHargaJual(int HargaBeliProduk) {

        if(HargaBeliProduk>200000) {
            HargaJualProduk = HargaBeliProduk + (0.5*HargaBeliProduk);
        } else if (HargaBeliProduk > 100000) {
            HargaJualProduk = HargaBeliProduk + (0.75*HargaBeliProduk);
        } else if (HargaBeliProduk>50000) {
            HargaJualProduk = HargaBeliProduk + (1*HargaBeliProduk);
        } else if (HargaBeliProduk>25000) {
            HargaJualProduk = HargaBeliProduk + (1.5*HargaBeliProduk);
        } else if (HargaBeliProduk<25000) {
            HargaJualProduk = HargaBeliProduk + (2*HargaBeliProduk);
        }
        return HargaJualProduk;
    }
    
    public void inputJenis() {
        System.out.print("Jenis Bayar :");
        JenisPembayaran = inUser.nextInt();
        if (JenisPembayaran == 1) {
            System.out.println("Ket Bayar : Cash");
        } else if(JenisPembayaran == 2) {
            System.out.println("Ket Bayar : Tempo");
        }
    }
    public void hitungJual() {
        TotalPenjualan = HargaJualProduk * JumlahPenjualan;
        System.out.println("Total : " + TotalPenjualan);
    }
    public void cetak() {
        System.out.print("Waktu Tempo : ");
        WaktuJatuhTempo = inUser.nextInt();
        PajakPertambahanNilai = 0.1*TotalPenjualan;
        System.out.println("PajakPertambahanNilai :" + PajakPertambahanNilai);
        if(WaktuJatuhTempo > 1) {
            SukuBunga = 0.05*TotalPenjualan;
        }
        System.out.println("SukuBunga : " + SukuBunga);
        TotalBayar = TotalPenjualan + PajakPertambahanNilai + SukuBunga;
        System.out.println("Total Bayar :" + TotalBayar);
        if (JenisPembayaran == 1) {
            if(TotalBayar>=100000 && TotalBayar<=500000) {
                souvenir = "Mug";
                System.out.println("Souvenir : " + souvenir);
            } else if(TotalBayar>500000 && TotalBayar<=750000) {
                souvenir = "Payung";
                System.out.println("Souvenir : " + souvenir);
            } else if(TotalBayar>750000 && TotalBayar<=1000000) {
                souvenir = "Tas";
                System.out.println("Souvenir : " + souvenir);
            } else if(TotalBayar>=1000000) {
                souvenir = "Voucer 100rb";
                System.out.println("Souvenir : " + souvenir);
            }
        }else {
            System.out.println("Tidak Ada Souvernir");
        }
    }
}
