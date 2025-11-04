package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;
        int jumlahlulus = 0;
        int jumlahtidaklulus = 0;
        double totallulus = 0;
        double totaltidaklulus =0;
        
        System.out.print(" Masukkan Jumlah Mahasiswa : ");
        jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMahasiswa];
        for( int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] =sc.nextInt();
        }
 
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                jumlahlulus++;
                totallulus += nilaiMhs[i];
            }else{
                jumlahtidaklulus++;
                totaltidaklulus += nilaiMhs[i];
            }
        }
        double ratalulus = ( jumlahlulus > 0) ? totallulus/ jumlahlulus : 0;
        double ratatidaklulus = ( jumlahtidaklulus >0) ? totaltidaklulus/jumlahtidaklulus : 0 ;
         
        System.out.println("Rata-rata nilai lulus = " + ratalulus);
        System.out.println("Rata-rata nilai tidak lulus = " + ratatidaklulus);
    }
}
