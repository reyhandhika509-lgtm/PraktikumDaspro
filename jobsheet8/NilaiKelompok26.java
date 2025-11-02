package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  i= 1;
        float totalnilai;
        float ratanilai;
        float nilai;
        float nilairatatertinggi =  0;
        int kelompokterbaik = 0;

        while (i <= 6) {
            System.out.println("Kelompok" + i);
            totalnilai = 0;
            for(int j = 1 ; j <= 5; j++){
                System.out.print("Nilai dari kelompok penilai " + j +":");
                 nilai = sc.nextInt();
                totalnilai += nilai;
            }
            ratanilai = totalnilai/5;
            System.out.println("Kelompok" + i +": Nilai rata-rata = " +ratanilai);
            
             
            if (ratanilai > nilairatatertinggi ){
                nilairatatertinggi = ratanilai ;
                kelompokterbaik = i;
            }
            
            i++;
        }
        System.out.println("\n=== HASIL TERBAIK ===");
        System.out.println("Kelompok dengan nilai rata-rata tertinggi: kelompok" + kelompokterbaik);
        System.out.println("Dengan  nilai : " + nilairatatertinggi);

    }
}
