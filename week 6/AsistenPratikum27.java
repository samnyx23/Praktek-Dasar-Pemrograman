import java.util.Scanner;

public class AsistenPratikum27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        double nilaiDaspro;
        double nilaiWawancara;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Masukan nilai daspro: ");
        nilaiDaspro = sc.nextDouble();
        System.out.print("Masukan nilai wawancara: ");
        nilaiWawancara = sc.nextDouble();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (nilaiDaspro >= 80) {
                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat anda diterima");
                } else {
                    System.out.println("Gagal: nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Gagal: Nilai daspro kurang daari 80!!");
            }
        } else {
            System.out.println("Gagal: Mahasiswa tidak aktif atau sedang disanksi!!");
        }
        sc.close();
    }
}
