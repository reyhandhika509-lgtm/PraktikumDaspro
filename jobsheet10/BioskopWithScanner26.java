package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris;
        int kolom;
        String nama;
        String next;
        int menu;
        String[][] penonton = new String[4][2];
        
        // while (true) {
        //     System.out.print("Masukkan Nama: ");
        //     nama = sc.nextLine();
        //     System.out.print("Masukkan Baris: ");
        //     baris = sc.nextInt();
        //     System.out.print("Masukkan Kolom: ");
        //     kolom = sc.nextInt();
        //     sc.nextLine();

        //     penonton[baris-1][kolom-1] = nama;

        //     System.out.print("Input penonton lainnya? (y/n): ");
        //     next = sc.nextLine();

        //     if (next.equalsIgnoreCase("n")){
        //         break;
        //     }
        // }

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // Flush enter

            if (menu == 1) {

                while (true) {
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia. Silakan input ulang!");
                        continue; 
                    }

                
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh penonton lain. Silakan pilih kursi lain.");
                        continue; 
                    }

                    
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil ditambahkan.");
                    break; 
                }

            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {

                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak tersedia. Silakan pilih 1-3.");
            }
        }
    }
}