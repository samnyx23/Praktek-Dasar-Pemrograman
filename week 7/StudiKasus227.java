import java.util.Scanner;

public class StudiKasus227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String lomba = sc.nextLine();

        String status;

        if (lomba.equalsIgnoreCase("BELMAWA") || lomba.equalsIgnoreCase("BAKORMA") 
            || lomba.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            int juara = sc.nextInt();
            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    status = "Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen kurang. Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan juara 1, 2 atau 3, Dana penghargaan tidak diberikan.";
            }
        } else if (lomba.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1= lolos, 0 = tidak lolos): ");
            int lolos = sc.nextInt();
            if (lolos == 1) {
                if (dokumen == 4) {
                    status = "Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap. dana penghargaan tidak diberikan.";
                }
            } else {
                status = "PKM tidak lolos pendanaan.";
            }
        } else {
            status = "Jenis kegiatan tidak valid.";
        }
        System.out.println("Status: " + status);
        sc.close();
    }
}
