import java.util.Scanner;

public class kafe26n03 {
    public static void main(String[] args) {
       Menu("Budi", true, "DISKON30");
        
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        char pesanlagi;

        do {
        System.out.println("\nMasukkan nomor menu yang ingin anda pesan : ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan : ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga26(pilihanMenu, banyakItem, "DISKON30");
        totalKeseluruhan += totalHarga;

        System.out.println("Mau tambah pesanan ? (y/n)");
        pesanlagi = sc.next().charAt(0);

        }while (pesanlagi == 'y' || pesanlagi == 'Y');
       

       System.out.println("Total yang harus dibayar: Rp " + totalKeseluruhan);
       System.out.println("Terima kasih atas pesanan Anda!");
    }   
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. KOPI HITAM - Rp 15.000"); 
        System.out.println("2. CAPPUCCINO - Rp 20.000"); 
        System.out.println("4. TEH TARIK - Rp 12.000");
        System.out.println("3. LATTE - Rp 22.000");  
        System.out.println("5. ROTI BAKAR - Rp 10.000");
        System.out.println("6. MIE GORENG - Rp 18.000");
        System.out.println("=========================");   
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga26(int pilihanMenu, int banyakItem, String kodePromo){
    int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
    int hargaTotal = hargaItems[pilihanMenu - 1]* banyakItem;
    int diskon = 0;

    if(kodePromo.equalsIgnoreCase("DISKON50")){
        diskon = hargaTotal*50/100;
        System.out.println("Diskon 50% : Rp " + diskon);
    }
    else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        diskon = hargaTotal * 30 / 100;
        System.out.println("Diskon 30%: Rp " + diskon);
    } else {
        System.out.println("Kode promo invalid.");
    }

    int totalBayar = hargaTotal - diskon;
    System.out.println("Subtotal untuk menu ini: Rp " + totalBayar);
    return totalBayar;
  
    }
    
}
