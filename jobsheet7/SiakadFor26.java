package jobsheet7;

import java.util.Scanner;

public class SiakadFor26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah =100;
        int lulus = 0, tidaklulus=0;
        
        for (int i = 1 ; i <=10; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } 
            if (nilai >= 60) {
                lulus++ ;
                
            } else {
                tidaklulus++;
            }
        }
        System.out.println("Nilai Tertinggi :" + tertinggi);
        System.out.println("Nilai Terendah :"+ terendah); 
        System.out.println("Jumlah Siswa yang lulus: " + lulus);
        System.out.println("Jumlah Siswa yang Tidak lulus:" + tidaklulus);
        
        sc.close();
    }
    
}

