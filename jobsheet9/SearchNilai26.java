package jobsheet9;

import java.util.Scanner;

public class SearchNilai26 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();
        int[] arrnilai = new int[jumlah];

        // input elemen array
        for (int i = 0; i < arrnilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrnilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1;

        // proses pencarian
        for (int i = 0; i < arrnilai.length; i++) {
            if (key == arrnilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();

        // Output hasil
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        System.out.println();
        sc.close();
    }
}
    