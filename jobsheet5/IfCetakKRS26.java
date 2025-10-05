package jobsheet5;
import java.util.Scanner;

public class IfCetakKRS26 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("---Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah Lunas? (True/false): ");
        boolean uktlunas = sc.nextBoolean();
        if (uktlunas) {
            System.out.println(" pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KSR dan minta tanda tangan DPA");
           } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");

        sc.close(); 

        }
    }
}
