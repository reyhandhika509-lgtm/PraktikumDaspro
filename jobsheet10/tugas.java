package jobsheet10;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarPertanyaan = {
            "Kepuasan terhadap pelayanan pegawai kami",
            "Kepuasan terhadap kebersihan fasilitas",
            "Kepuasan terhadap kecepatan pelayanan",
            "Kepuasan terhadap kualitas produk",
            "Kepuasan terhadap harga yang ditawarkan",
            "Kepuasan terhadap kenyamanan tempat"
        };

        int jumlahResponden = 10;
        int jumlahPertanyaan = daftarPertanyaan.length;

        int[][] data = new int[jumlahResponden][jumlahPertanyaan];
        double total;

        System.out.println("=== FORM SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Penilaian 1-5 (1 = Sangat Tidak Puas, 5 = Sangat Puas)");

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("\nResponden #" + (i + 1));
            total = 0;

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.println((j + 1) + ". " + daftarPertanyaan[j]);
                System.out.print("Masukkan nilai (1-5): ");
                data[i][j] = sc.nextInt();
                total += data[i][j];
            }

            double rataResponden = total / jumlahPertanyaan;
            System.out.println("Rata-rata Responden #" + (i + 1) + " = " + rataResponden);
        }

        // Rata-rata per pertanyaan
        System.out.println("\n===========================================================");
        System.out.println("RATA-RATA SETIAP PERTANYAAN");
        System.out.println("===========================================================\n");

        for (int j = 0; j < jumlahPertanyaan; j++) {
            total = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                total += data[i][j];
            }

            double rataPertanyaan = total / jumlahResponden;

            System.out.println("Pertanyaan " + (j + 1) + ": " + daftarPertanyaan[j]);
            System.out.println("Rata-rata: " + rataPertanyaan + "\n");
        }

        // Rata-rata keseluruhan
        double totalKeseluruhan = 0;

        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += data[i][j];
            }
        }

        double rataTotal = totalKeseluruhan / (jumlahPertanyaan * jumlahResponden);
        System.out.println("===========================================================");
        System.out.println("RATA-RATA KESELURUHAN = " + rataTotal);
    }
}
