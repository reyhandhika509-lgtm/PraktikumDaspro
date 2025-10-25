package jobsheet7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int JumlahTiket, hargaTiket = 50000, totalTiket = 0, i = 1;
        double totalBiaya = 0;
        while(true){
            System.out.println("Pelanggan ke-" +(i));
            System.out.print("Berapa banyak tiket yang dibeli: ");
            JumlahTiket = sc.nextInt();

            if(JumlahTiket > 4){
                totalBiaya += JumlahTiket * hargaTiket - (JumlahTiket * hargaTiket * 0.1);
                totalTiket += JumlahTiket;
            }else if(JumlahTiket > 10){
                totalBiaya += JumlahTiket * hargaTiket - (JumlahTiket * hargaTiket * 0.15);
                totalTiket += JumlahTiket;
            }else if(JumlahTiket <= 4 && JumlahTiket >0){
                totalBiaya += hargaTiket;
                totalTiket += JumlahTiket;
            }else if(JumlahTiket < 0){
                System.out.println("Input tidak valid, coba ulangi kembali");
                continue;
            }
            i++;
            if(JumlahTiket == 0){
                System.out.println("Program diselesaikan.");
                break;
            }
        }
        System.out.println(totalBiaya);
        System.out.println(totalTiket);
    }
}