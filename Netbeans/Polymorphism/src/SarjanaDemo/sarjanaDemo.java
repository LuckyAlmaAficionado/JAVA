package SarjanaDemo;

import sarjana.*;

public class sarjanaDemo {
    public static boolean isAlamat(Sarjana a1, Sarjana a2) {
        String temp1 = a1.getAlamat().toLowerCase();
        String temp2 = a2.getAlamat().toLowerCase();
        if (temp1.equals(temp2)) {
            return true;
        } else {
            return false;
        }
    }

    public static double min2(double a, double b) {
        if (a < b) {
            return a;
        } else if (b < a) {
            return b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Sarjana s[] = new Sarjana[3];
        s[0] = new Sarjana("Dilan", "Bandung", 1, 3.51);
        s[1] = new Sarjana("Milea", "Jakarta", 2, 3.0);
        s[2] = new Sarjana();
        s[2].reset("Cinta", "Bandung", 3, 1.75);

        for (int i = 0; i < s.length; i++) {
            s[i].cetak();
            System.out.println("");
        }

        System.out.println("Alamat Dilan dan Cinta");
        if (isAlamat(s[0], s[2])) {
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
         
        
        if (s[0].getIpk() < min2(s[1].getIpk(), s[2].getIpk())) {
            System.out.println("IPK terkecil adalah " + s[0].getIpk() + " milik " + s[0].getNama());
        }else if(s[1].getIpk() < min2(s[0].getIpk(), s[2].getIpk())){
            System.out.println("IPK terkecil adalah " + s[1].getIpk() + " milik " + s[1].getNama());
        }else{
            System.out.println("IPK terkecil adalah " + s[2].getIpk() + " milik " + s[2].getNama());
        }
    }
}
