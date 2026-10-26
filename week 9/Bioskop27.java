import java.util.Scanner;

public class Bioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0; 
        double totalHarga = 0, diskon = 0;

        while (true) {
            System.out.print("Jumlah tiket yang di beli: ");
            int jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }
            if (jumlah == 0) {
                break;    
            }
            if (jumlah > 4) {
                diskon = 0.1;
            }
            if (jumlah > 10) {
                diskon = 0.15;
            } else {
                diskon = 0;
            }

            double totalBayar = jumlah * hargaTiket * (1-diskon);

            totalTiket += jumlah;
            totalHarga += totalBayar;

            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total harga: Rp." + totalHarga);

            
        }

    }
}
