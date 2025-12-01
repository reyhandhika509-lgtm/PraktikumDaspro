import java.util.Scanner;

public class kubus26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Panjang Sisi Kubus yang anda mau hitung : ");
        double sisi = sc.nextInt();
    
        Kubus(sisi);
    }
    static void Kubus(double sisi){
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + volume);
        double luaspermukaan = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus : " + luaspermukaan);
        
    }
    
}
