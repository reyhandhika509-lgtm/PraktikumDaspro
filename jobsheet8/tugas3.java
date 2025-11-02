package jobsheet8;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
      System.out.print("Masukkan jumlah cabang Cafe: ");
        int jumlahCabang = sc.nextInt();

        int totalPelangganSemuaCabang = 0;
        int totalItemSemuaCabang = 0;

        System.out.println();

        System.out.print("=== INPUT PENJUALAN PER CABANG ===");

        System.out.println();

        // Perulangan untuk tiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n=== Cabang " + i + " ===");
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0; // Menyimpan total item untuk cabang ini

            // Perulangan untuk tiap pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Jumlah item yang dipesan pelanggan ke-" + j + ": ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem;
            }

            // Tampilkan ringkasan cabang
            System.out.println(">> Ringkasan Cabang " + i);
            System.out.println("Jumlah pelanggan : " + jumlahPelanggan +" Orang");
            System.out.println("Total item terjual: " + totalItemCabang);

            // Akumulasi ke total semua cabang
            totalPelangganSemuaCabang += jumlahPelanggan;
            totalItemSemuaCabang += totalItemCabang;
        }

        // Tampilkan hasil akhir semua cabang
        System.out.println("\n=== RINGKASAN KESELURUHAN ===");
        System.out.println();
        System.out.println("Total Seluruh Cabang  ");
        System.out.println("Total seluruh pelanggan : " + totalPelangganSemuaCabang + " Orang");
        System.out.println("Total seluruh item terjual: " + totalItemSemuaCabang + " Item");

    }
}
