import java.util.Scanner;

public class Parcel {
    int barcodeProduk, hargaBeliProduk;
    double HargaJualProduk;
    String parcel;
    
    Scanner inUser = new Scanner(System.in);
    Scanner inUserLine = new Scanner(System.in);
    
    public void inputParcel(){
        Grosir grosir = new Grosir("SALATIGA");
        System.out.print("No Nota : ");
        grosir.setNota(2);
        System.out.print("BarcodeProduk : ");
        barcodeProduk = inUser.nextInt();
        System.out.print("Nama Produk : ");
        parcel = inUserLine.next();
        System.out.print("Harga Beli : ");
        hargaBeliProduk = inUser.nextInt();
        System.out.println("Harga jual : " +
        grosir.getHargaJual(hargaBeliProduk));
        grosir.inputJumlah();
        grosir.hitungJual();
        grosir.inputJenis();
        grosir.cetak();
    }
}
