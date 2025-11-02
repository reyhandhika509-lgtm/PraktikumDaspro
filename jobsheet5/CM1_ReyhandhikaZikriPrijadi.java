import java.util.Scanner;

public class CM1_ReyhandhikaZikriPrijadi { 
    public static void main(String[] args) { 
        Scanner sc =new Scanner((System.in));

        //Input tipe data Mahasiswa
         System.out.println(" ===== INPUT DATA MAHASISWA =====");
         System.out.print("NAMA :");
         String nama = sc.nextLine();
         System.out.print("NIM  :");
         String nim = sc.nextLine(); 
         
         System.out.println();

        //Mata Kuliah 1 - algoritma dan pemrograman
         System.out.println(" --- Mata Kuliah 1: Algoritma dan Pemrograman --- ");
         System.out.print("Nilai UTS\t:");
         double uts1 = sc.nextDouble();
         System.out.print("Nilai UAS\t:");
         double uas1 = sc.nextDouble();
         System.out.print("Nilai Tugas\t:");
         double tugas1 = sc.nextDouble();

         System.out.println();

         //Mata Kuliah 2 - Struktur Data
         System.out.println(" --- Mata Kuliah 2: Struktur Data ---");
         System.out.print("Nilai UTS\t:");
         double uts2 = sc.nextDouble();
         System.out.print("Nilai UAS\t:");
         double uas2 = sc.nextDouble();
         System.out.print("Nilai Tugas\t:");
         double tugas2 = sc.nextDouble();
         
         //Mata kuliah 3 
         System.out.println(" --- Mata kuliah 3 : Matematika ---");
         System.out.print("Nilai UTS\t:");
         double uts3 = sc.nextDouble();
         System.out.print("Nilai UAS\t:");
         double uas3 = sc.nextDouble();
         System.out.print("Nilai Tugas\t:");
         double tugas3 = sc.nextDouble();

      

         //Hitung Nilai Akhir dengan operator aritmatika
         double nilaiAkhir1 =(uts1 * 0.3) + (uas1*0.4) +(tugas1*0.3) ;
         double nilaiAkhir2 =(uts2 *0.3) + (uas2*0.4) + (tugas2*0.3) ;
         double nilaiAkhir3 =(uts3 *0.3) + (uas3*0.4) + (tugas3*0.3);
         double rataRata = (nilaiAkhir1 + nilaiAkhir2 +nilaiAkhir3) / 3;
         

         //Cek nilai Akhrir Mata Pelajaran 1
         String nilaihuruf1 ="";
         if( nilaiAkhir1 > 80 &&nilaiAkhir1 <= 100) {
            nilaihuruf1 ="A";
        } else if (nilaiAkhir1 >73 && nilaiAkhir1 <=80) {
            nilaihuruf1 = "B+";
        } else if (nilaiAkhir1 >65 && nilaiAkhir1 <=73) {
            nilaihuruf1 = "B";
        } else if (nilaiAkhir1 >60 && nilaiAkhir1 <=65) {
            nilaihuruf1 = "C+";
        } else if (nilaiAkhir1 >50 && nilaiAkhir1 <=60) {
            nilaihuruf1 = "C";
        } else if (nilaiAkhir1 >39 && nilaiAkhir1 <=50) {
            nilaihuruf1 = "D";
        } else if (nilaiAkhir1 >0  && nilaiAkhir1 <=39) {
            nilaihuruf1 ="E";
        } else{
           
        } 
        //Cek nilai Akhrir Mata Pelajaran 2
        String nilaihuruf2 ="";
        
         if( nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            nilaihuruf2 ="A";
        } else if (nilaiAkhir2 >73 && nilaiAkhir2 <=80) {
            nilaihuruf2 = "B+";
        } else if (nilaiAkhir2 >65 && nilaiAkhir2 <=73) {
            nilaihuruf2 = "B";
        } else if (nilaiAkhir2 >60 && nilaiAkhir2 <=65) {
            nilaihuruf2 = "C+";
        } else if (nilaiAkhir2 >50 && nilaiAkhir2 <=60) {
            nilaihuruf2 = "C";
        } else if (nilaiAkhir2 >39 && nilaiAkhir2 <=50) {
            nilaihuruf2 = "D";
        } else if (nilaiAkhir2 >0  && nilaiAkhir2 <=39) {
            nilaihuruf2 ="E";
        } else{ 
            
 
        } 
         String nilaihuruf3 ="";
        
         if( nilaiAkhir3 > 80 && nilaiAkhir3 <= 100) {
            nilaihuruf3 ="A";
        } else if (nilaiAkhir3 >73 && nilaiAkhir3 <=80) {
            nilaihuruf3 = "B+";
        } else if (nilaiAkhir3 >65 && nilaiAkhir3 <=73) {
            nilaihuruf3 = "B";
        } else if (nilaiAkhir3 >60 && nilaiAkhir3 <=65) {
            nilaihuruf3 = "C+";
        } else if (nilaiAkhir3 >50 && nilaiAkhir3 <=60) {
            nilaihuruf3 = "C";
        } else if (nilaiAkhir3 >39 && nilaiAkhir3 <=50) {
            nilaihuruf3 = "D";
        } else if (nilaiAkhir3 >0  && nilaiAkhir3 <=39) {
            nilaihuruf3 ="E";
        } else{ 
        
        }
            

        // Konversi Nilai Huruf dan Status Kelulusan per Mata Kuliah 1
            String Kelulusan1 ="";
        if (nilaiAkhir1 >= 60) {
            Kelulusan1 = "LULUS";
        } else {
            Kelulusan1 = "TIDAK LULUS";

        } // Konversi Nilai Huruf dan Status Kelulusan per Mata Kuliah 2
            String Kelulusan2="";
              
        if (nilaiAkhir2 >=60) {
             Kelulusan2 = "LULUS";
        } else {
            Kelulusan2 = "TIDAK LULUS";
        }

            String kelulusan3 ="";
        if (nilaiAkhir3 >=60){
            kelulusan3 ="LULUS";
        } else{
            kelulusan3 ="TIDAK LULUS";
        }
        
        // Nested if untuk menentukan status mahasiswa
        String status;
        if(Kelulusan1== "LULUS" && Kelulusan2 == "LULUS" && kelulusan3 =="LULUS"){
            if(rataRata >= 70){
                status = "LULUS (Rata-rata >=70)";
            }else{
                status = "TIDAK LULUS(Rata-rata <70)";
            }
        }else{
             status = "Tidak Lulus"; 
        }
        double ratabesar;
        if(nilaiAkhir1 > nilaiAkhir2){
            if (nilaiAkhir1 > nilaiAkhir3){
                ratabesar= nilaiAkhir1;
                System.out.println("Mata Pelajaran");
                System.out.println("Rata-rata terbesar adalah : " + ratabesar);
            }else if (nilaiAkhir3 > nilaiAkhir1){
                ratabesar = nilaiAkhir3;
                System.out.println("Rata-rata terbesar adalah : " + ratabesar);
            }
            }else if (nilaiAkhir2 > nilaiAkhir1){
            if (nilaiAkhir2 > nilaiAkhir3){
                ratabesar = nilaiAkhir2;
                System.out.println("Rata-rata terbesar adalah : " + ratabesar);
            }else if (nilaiAkhir3 > nilaiAkhir2){
                ratabesar = nilaiAkhir3;
                System.out.println("Rata-rata terbesar adalah : " + ratabesar);
            }   
        }
        // Output hasil
        System.out.println("========= HASIL DATA MAHASISWA =========");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println();

        System.out.println("Mata Kuliah \t \t \t UTS \t UAS \t Tugas \t Nilai Akhir \t Nilai Huruf \t Status");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Algoritma dan Pemrograman \t " + uts1 + " \t " + uas1 + " \t " + tugas1 + " \t " + nilaiAkhir1 + " \t \t " + nilaihuruf1 + " \t \t " + Kelulusan1);
        System.out.println("Struktur Data \t \t \t " + uts2 + " \t " + uas2+ " \t " + tugas2 + " \t " + nilaiAkhir2 + " \t \t " + nilaihuruf2 + " \t \t " + Kelulusan2);
        System.out.println("MATEMATIKA" +  + uts3 + "\t"  + uas3 + "\t " + tugas3+ " \t "+nilaiAkhir3+"\t \t "+nilaihuruf3+" \t \t"+kelulusan3);
        System.out.println("");

        System.out.println("Rata-rata nilai akhir : " + rataRata);
        System.out.println("Status Mahasiswa : " + status);

    }
}
