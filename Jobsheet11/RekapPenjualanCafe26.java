import java.util.Scanner;

public class RekapPenjualanCafe26 {
    static Scanner sc = new Scanner(System.in);
    static int jumlahMenu;
    static int jumlahHari;
    static String[] menu;
    static int[][] penjualan;

    public static void main(String[] args) {

        System.out.println("=== Rekap Penjualan Cafe ===\n");

        System.out.print("Masukkan jumlah menu : ");
        jumlahMenu = sc.nextInt();

        System.out.print("Masukkan jumlah hari : ");
        jumlahHari = sc.nextInt();
        sc.nextLine(); 

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        inputMenu(sc);
        inputPenjualan(sc);

        System.out.println("\n=== HASIL REKAP ===");
        tampilTabel();
        menuTerlaris();
        rataRataMenu();
    }

    
    static void inputMenu(Scanner sc) {
        System.out.println("\n=== Input Nama Menu ===");

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + " : ");
            menu[i] = sc.nextLine();
        }
    }

   
    static void inputPenjualan(Scanner sc) {
        System.out.println("\n=== Input Penjualan ===");

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

   
    static void tampilTabel() {
        System.out.println("\n========================== Tabel Penjualan =============================");
        System.out.printf("%-16s", "MENU/HARI");
        for (int j = 0; j < jumlahHari; j++) {
            System.out.printf("%-12s", "Hari-" + (j + 1));
        }
        System.out.printf("%-12s%-12s\n", "TOTAL", "RATA2");

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-20s", menu[i]);
            int total = 0;

            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
                System.out.printf("%-12d", penjualan[i][j]);
            }

            double rata = (double) total / jumlahHari;

            System.out.printf("%-12d%-12.2f\n", total, rata);
        }
        System.out.println("========================================================================");
    }

    
    static void menuTerlaris() {
        int max = -1;
        int indexMax = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            if (total > max) {
                max = total;
                indexMax = i;
            }
        }

        System.out.println("\n=== Menu Terlaris ===");
        System.out.println("Menu  : " + menu[indexMax]);
        System.out.println("Total : " + max);
    }

    
    static void rataRataMenu() {
        System.out.println("\n=== Rata-rata Penjualan ===");

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;

            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            double rata = (double) total / jumlahHari;

            System.out.printf("%-20s Total: %-5d Rata-rata: %.2f\n",
                    menu[i], total, rata);
        }
    }
}
