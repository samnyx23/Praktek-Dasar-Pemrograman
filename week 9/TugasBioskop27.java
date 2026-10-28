import java.util.Scanner;

public class TugasBioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int jumlah;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("Penjualan Tiket Bioskop");
        System.out.println("========================");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang valid!");
                continue;
            }

            if (jumlah == 0) {
                break;
            }

            double harga = jumlah * hargaTiket;
            double diskon = 0;

            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }

            double bayar = harga - (harga * diskon);

            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Harga tiket: Rp " + harga);
            System.out.println("Total bayar pelanggan: Rp " + (long) bayar);
 
            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("Penjualan tiket hari ini.");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + (long) totalPenjualan);

        sc.close();
    }
}