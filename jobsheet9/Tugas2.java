package jobsheet9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int jumlah;
        String[] namaPesanan;
        double[] hargaPesanan;
        double total = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlah = sc.nextInt();
        sc.nextLine(); // membersihkan buffer enter

        namaPesanan = new String[jumlah];
        hargaPesanan = new double[jumlah];

        // Input data pesanan
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
            total += hargaPesanan[i];
        }

        // Tampilkan hasil pesanan
        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("\nTotal biaya: Rp " + total);
        
    }
}
    
