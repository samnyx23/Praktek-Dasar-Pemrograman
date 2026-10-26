import java.util.Scanner;

public class StudiKasus127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        } 

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.print("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.print("Uang tidak cukup, kurang Rp: " + kurang);
        }

        sc.close();
    }
}
