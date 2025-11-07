package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlah;          
        int[] nilai;         
        int total = 0;       
        double rataRata;     
        int tertinggi;       
        int terendah;        

        // Input jumlah nilai
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        jumlah = sc.nextInt();

        nilai = new int[jumlah];

        // Input nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // Hitung total
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
        }

        // Hitung rata-rata
        rataRata = (double) total / jumlah;

        // Inisialisasi nilai tertinggi dan terendah
        tertinggi = nilai[0];
        terendah = nilai[0];

        // Cari nilai tertinggi dan terendah
        for (int i = 0; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // Tampilkan hasil
        System.out.println("\n=== Hasil Pengolahan Nilai Mahasiswa ===");
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

       
    }
}