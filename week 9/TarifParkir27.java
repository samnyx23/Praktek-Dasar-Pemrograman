import java.util.Scanner;

public class TarifParkir27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi = 0, total = 0;

        do {
            System.out.print("Jenis 1 atau 2: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Total lama parkir: ");
                durasi = sc.nextInt();
            } if (jenis == 1) {
                total = durasi * 3000;
            } else {
                total = durasi * 2000;
            }
            System.out.println("Total harga parkir: " + total);
        } while (jenis != 0);
        sc.close();
    }
}
