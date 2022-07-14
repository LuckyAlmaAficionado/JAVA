
package Latihan_1;

public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika a = new Matematika();
        System.out.println("Overloading Tambah");
        a.tambah(10.2, 30.5);
        a.tambah(10.2, 30.5, 90.4);
        System.out.println("Overloading Kurang");
        a.kurang(10.2, 30.5);
        a.kurang(10.2, 30.5, 90.4);
        System.out.println("Overloading Kali");
        a.kali(10.2, 30.5);
        a.kali(10.2, 30.5, 90.4);
        System.out.println("Overloading Bagi");
        a.bagi(10.2, 30.5);
        a.bagi(10.2, 30.5, 90.4);
    }
}
