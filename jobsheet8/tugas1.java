package jobsheet8;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

          // Perulangan luar untuk setiap nilai dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            int jumlah = 0;

            System.out.print("n = " + i + "  → jumlah kuadrat = ");

            // Perulangan dalam untuk menghitung jumlah kuadrat hingga i
            for (int j = 1; j <= i; j++) {
                jumlah += j * j; // menambahkan kuadrat j ke jumlah

                // Menampilkan setiap suku kuadrat
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }

            // Menampilkan hasil akhir jumlah kuadrat
            System.out.println(" = " + jumlah);
        }
    }
    
}
