package jobsheet9;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("========================");
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine().trim(); 

        boolean ditemukan = false;

       
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                System.out.println(" Makanan \"" + menu[i] + "\" tersedia di menu kafe (urutan ke-" + (i + 1) + ").");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ada di menu kafe.");
        }
    }
}