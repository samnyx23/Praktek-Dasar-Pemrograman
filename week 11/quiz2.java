// Nama:Subhan Akbar Mashuri
// NIM: 264107020214
// Kelas: TI-1D

import java.util.Scanner;

public class quiz2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        String nama = sc.nextLine();
        System.out.print("Kode personal K = ");
        int K = sc.nextInt();
        System.out.print("Jumlah kamar: ");
        int jumlahKamar = sc.nextInt();
        double rata =0;
        int meteranRusak =0, kamarPalingBoros = 0;
        double totalKwhTerringgi = 0;

        for (int m = 1; m <= jumlahKamar; m++ ) {
            System.out.println("Kamar " + m);
            int hari = 5; 
            double nilaiKwh =0, totalKwh = 0;
            for (int i = 1; i <= hari; i++ ) {
                System.out.print("  Hari " + i + " (kWh): ");
                nilaiKwh = sc.nextInt();
                if (nilaiKwh == -1) {
                    meteranRusak++;
                    break;
                    
                }
                totalKwh += nilaiKwh;

            }

            rata = totalKwh / 5;

            if (rata < (5 + K) ) {
                System.out.println("Total: " + totalKwh + " | Hemat");
            } else {
                System.out.println("Total: " + totalKwh + " | Boros");
            }

            if (totalKwh > totalKwhTerringgi) {
                totalKwhTerringgi = totalKwh;
            }

            if (totalKwh > totalKwhTerringgi) {
                totalKwhTerringgi = totalKwh;
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
