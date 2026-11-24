import java.util.Scanner;

public class Kafe327 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    
    }

    public static int hitungTotalHarga23(int pilihMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 12000, 10000, 10000};

        int hargaTotal = hargaItems[pilihMenu - 1] * banyakItem;
        return hargaTotal;
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("subhan", true);

        System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
        int pilihMenu = sc.nextInt();
        System.out.print("Masukan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalBayar =  hitungTotalHarga23(pilihMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalBayar);
        
        sc.close();
    }
}
