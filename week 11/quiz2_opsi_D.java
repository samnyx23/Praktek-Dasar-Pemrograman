// Nama:Subhan Akbar Mashuri
// NIM: 264107020214
// Kelas: TI-1D

import java.util.Scanner;

public class quiz2_opsi_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String nama = "Subhan Akbar Mashuri";
        int noAbsen = 27;        // GANTI dengan nomor absen Anda
        int k = noAbsen % 5;    // kode personal
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);
        System.out.print("Jumlah kamar: ");
        int jumlahKamar = sc.nextInt();
        double rata =0;
        int meteranRusak =0, kamarPalingBoros = 0;
        double totalKwhTerringgi = 0;

        for (int m = 1; m <= jumlahKamar; m++ ) {
            System.out.println("Kamar " + m);
            int hari = 5, hariRusak =0;
            double nilaiKwh =0, totalKwh = 0;
            for (int i = 1; i <= hari; i++ ) {
                System.out.print("  Hari " + i + " (kWh): ");
                nilaiKwh = sc.nextDouble();
                if (nilaiKwh == -1) {
                    meteranRusak++;
                    hariRusak = i;
                    break;
                    
                }
                totalKwh += nilaiKwh;
            
            }
            if (hariRusak > 0) {
                System.out.println("Total: " + totalKwh
                        + " | Rusak (hari ke-" + hariRusak + ")");
            }

            rata = totalKwh / 5;
            if (rata <= (5 + k) ) {
                System.out.println("Total: " + totalKwh + " | Hemat");
            } else {
                System.out.println("Total: " + totalKwh + " | Boros");
            }

            if (totalKwh > totalKwhTerringgi) {
                totalKwhTerringgi = totalKwh;
                
            }
            if (totalKwhTerringgi > kamarPalingBoros) {
                kamarPalingBoros += totalKwhTerringgi;
                kamarPalingBoros = m;
            }
            
        }

        System.out.println("=======================");
        System.out.println("Kamar Paling boros  : " + kamarPalingBoros);
        System.out.println("Total kWh tertinggi : " + totalKwhTerringgi);
        System.out.println("Jumlah meteran rusak: " + meteranRusak);

        sc.close();
    }
}
