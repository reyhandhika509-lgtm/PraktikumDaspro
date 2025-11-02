package jobsheet8;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        // Validasi agar n minimal 3
        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        // Cetak persegi angka
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Jika berada di tepi (atas, bawah, kiri, kanan)
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); // dua spasi biar sejajar
                }
            }
            System.out.println();
        }
        
    }
    
}
