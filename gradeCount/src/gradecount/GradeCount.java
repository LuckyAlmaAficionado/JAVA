/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecount;

import java.util.Scanner;

/**
 *
 * @author Lucky
 */
class Data{
    private int tempValue = 0, temp, cek = 0, average = 0;
    String tempStr;
    String data[] = {"PBO", "Logika Informatika", "Sistem Operasi", "Basis Data", "Data Mining"};
    Scanner inputUser = new Scanner(System.in);
    public class Menu{
        public void showMenu(){
            System.out.println("1. Tambah Nilai");
            System.out.println("2. Total Nilai");
            System.out.println("3. Rata-rata Nilai");
            System.out.println("4. Cek Kelulusan");
            System.out.println("5. Selesai");
            System.out.print("Masukan opsi anda: ");
        }
        int countGrade(int option){
            switch(option){
                case 1:
                    if (cek == 0) {
                        for (int i = 0; i < 5; i++) {                        
                            System.out.printf("Masukan nilai %s anda: ", data[i]);
                            temp = inputUser.nextInt();
                            tempValue += temp;
                        }
                        cek = 1; 
                    } else {
                        System.out.println("Nilai anda sudah di input");
                    }
                    System.out.printf("Total nilai: %d\n", tempValue);
                    break;
                case 2:
                    if (tempValue == 0) {
                        System.out.println("Anda belum input nilai");
                    } else {
                        System.out.printf("Total nilai: %d\n", tempValue);
                    }
                    break;
                case 3:
                    if (tempValue == 0) {
                        System.out.println("Anda belum input nilai");
                    } else {
                        average = tempValue/data.length;
                        System.out.printf("Rata-rata nilai anda: %d\n", average);
                    }
                    break;
                case 4:
                    if (average == 0) {
                        System.out.println("Anda belum imput nilai");
                    } else {
                        if (average > 85) {
                            tempStr = "A";
                        }else if(average > 75){
                            tempStr = "B";
                        } else if (average > 50){
                            tempStr = "C";
                        }else {
                            tempStr = "D";
                        }

                        if (tempStr.equals("A") || tempStr.equals("B") || tempStr.equals("C")) {
                            System.out.printf("Selamat anda lulus dengan predikat %S\n", tempStr);
                        } else {
                            System.out.println("Anda belum lulus");
                        }
                    }
                    break;
                default:
                    System.out.println("input opsi anda tidak tersedia");
                    break;
            }
            return 0;
        }
    }
}

public class GradeCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        Scanner inputUser = new Scanner(System.in);
        // TODO code application logic here
        Data x = new Data();
        Data.Menu y = x.new Menu();
        do {            
            y.showMenu();
            option = inputUser.nextInt();
            y.countGrade(option);
        } while (option < 5);
        System.out.println("Terimakasih Semoga Hari Anda Menyenangkan");
    }
    
}
