import java.util.Scanner;

public class whileGaji26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double gaji,bonus=0.2,total=0,jam;
        int i=1;

            System.out.println("=== BONUS PEMASUKAN GAJI HARIAN ===");
            while (true) {
                System.out.println("Masukkan jumlah jam kerja karyawan ke-" + i + ": ");
                jam = sc.nextDouble();
                
                if (jam < 0) {
                System.out.println("Jam kerja tidak valid");
                continue;
                }else if (jam > 8) {
                System.out.println("Masukkan jumlah gaji ke-" + i + " dalam Rupiah: ");
                gaji = sc.nextDouble();
                bonus = (0.2 * gaji);       // 20% dari gaji
                total = gaji + bonus;     // total = gaji + bonus
                }else {
                System.out.println("Masukkan jumlah gaji ke-" + i + " dalam Rupiah: ");
                gaji = sc.nextDouble();
                bonus = 0;
                total = gaji;             // tanpa bonus
            } 
            System.out.println("Karyawan ke-" + i + " menerima total gaji Rp " + total);
            i++;
            System.out.println("");
            System.out.println("Apakah anda ingin lanjut? Yes/No");
            if(!sc.next().equalsIgnoreCase("yaa")){
                break;
            }
        }
        sc.close();
    }

}
   
// while (true) {
//     System.out.println("Masukkan jumlah jam kerja karyawan ke-" +i);
//     jam = sc.nextDouble();
//     if(jam<0){
//         System.out.println("Jam kerja tidak valid");
//         break;
//     }
//     System.out.println("Masukkan Jumlah gaji ke-"+i+"dalam Rupiah");
//     gaji = sc.nextDouble();
//     if(gaji<0){
//         System.out.println("Gaji tidak Valid");
//         break;
//     }
//         if(jam>8){
//             total=(gaji*bonus);
//         }
//         else if(jam<=8){
//             total=gaji;
//         }
//         System.out.println("Karyawan ke : "+i+"Gaji"+total);
//         i++;
// }
