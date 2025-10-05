package jobsheet5 ;
import java.util.Scanner;

public class nestedUjianSkripsi26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah Mahasiswa Sudah Bebas Kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine();

        System.out.print("Masukkan Jumlah Log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan Jumlah Log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        String pesan = ""; 

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = " Semua syarat terpenuhi, mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = " Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali.";
            } else if (bimbinganP1 < 8) {
                pesan = " Gagal! Log bimbingan P1 belum mencapai 8 kali.";
            } else {
                pesan = " Gagal! Log bimbingan P2 belum mencapai 4 kali.";
            }
        } else {
            pesan = " Gagal! Mahasiswa belum bebas kompen, tidak dapat mendaftar ujian skripsi.";
        }

        System.out.println(pesan);

        sc.close(); 
    }
}
