
public class Kafe26 {
    public static void main(String[] args) {
        menu("Reyhan", true);
    }
    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk pembelian!");
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
}
