import java.util.Scanner;

public class looping {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Gajiharian, jamKerja;

        System.out.println("=== BONUS PEMASUKKAN GAJI HARIAN ===");
        while(true){
            System.out.print("Masukkan jam kerja yang telah dilakukan: ");
            jamKerja = sc.nextInt();
            System.out.print("Masukkan gaji harian anda: ");
            Gajiharian = sc.nextInt();

            if(jamKerja > 8){
                double total = Gajiharian + (Gajiharian * 0.2);
                System.out.println("Gaji anda adalah: " + total);
            }else if(jamKerja < 0){
                System.out.println("Error, Gaji karyawan tidak dapat diproses\n");
                continue;
            }else{
                System.out.println("Gaji anda adalah: " + Gajiharian);
            }

            System.out.println("");
            System.out.println("Apakah anda ingin lanjut? Y/N");
            if(!sc.next().equalsIgnoreCase("y")){
                break;
            }
            System.out.println("");
        }
        sc.close();
    }
}
    

