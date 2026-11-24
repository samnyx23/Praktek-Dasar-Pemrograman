import java.util.Scanner;

public class Tugas2KafeKampus27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        String[] pesanan = new String[0];
        int[] hargaPesanan = new int[0];
        int totalBiaya = 0;

        int pilihan;
        do {
            System.out.println();
            System.out.println("===== KAFE KAMPUS =====");
            System.out.println("1. Lihat daftar menu");
            System.out.println("2. Cari menu");
            System.out.println("3. Buat pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(sc.nextLine().trim());

            if (pilihan == 1) {
                System.out.println();
                System.out.println("--- DAFTAR MENU ---");
                for (int i = 0; i < menu.length; i++) {
                    System.out.printf("%d. %-16s Rp %d%n", (i + 1), menu[i], harga[i]);
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan nama menu yang dicari: ");
                String cari = sc.nextLine().trim();

                int indeks = -1;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(cari)) {
                        indeks = i;
                        break;
                    }
                }

                if (indeks != -1) {
                    System.out.println("Menu ditemukan: " + menu[indeks] + " - Rp " + harga[indeks]);
                } else {
                    System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
                }

            } else if (pilihan == 3) {
                System.out.print("Masukkan jumlah item yang ingin dipesan: ");
                int jumlahItem = Integer.parseInt(sc.nextLine().trim());

                pesanan = new String[jumlahItem];
                hargaPesanan = new int[jumlahItem];
                totalBiaya = 0;

                for (int n = 0; n < jumlahItem; n++) {
                    int indeks = -1;

                    while (indeks == -1) {
                        System.out.print("Pesanan ke-" + (n + 1) + " (nama menu): ");
                        String namaMenu = sc.nextLine().trim();

                        for (int i = 0; i < menu.length; i++) {
                            if (menu[i].equalsIgnoreCase(namaMenu)) {
                                indeks = i;
                                break;
                            }
                        }

                        if (indeks == -1) {
                            System.out.println("Menu \"" + namaMenu + "\" tidak tersedia. Silakan pilih menu lain.");
                        }
                    }

                    pesanan[n] = menu[indeks];
                    hargaPesanan[n] = harga[indeks];
                    totalBiaya += harga[indeks];
                }

                System.out.println();
                System.out.println("======== DAFTAR PESANAN ========");
                System.out.printf("%-4s %-16s %10s%n", "No", "Menu", "Harga");
                System.out.println("--------------------------------");
                for (int n = 0; n < pesanan.length; n++) {
                    System.out.printf("%-4d %-16s %10s%n", (n + 1), pesanan[n], "Rp " + hargaPesanan[n]);
                }
                System.out.println("--------------------------------");
                System.out.printf("%-21s %10s%n", "TOTAL BIAYA", "Rp " + totalBiaya);
                System.out.println("================================");
            }
        } while (pilihan != 0);

        System.out.println("Terima kasih, selamat menikmati!");

        sc.close();
    }
}