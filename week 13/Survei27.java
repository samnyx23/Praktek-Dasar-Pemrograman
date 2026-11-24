import java.util.Scanner;

public class Survei27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];
        double totalKeseluruhan = 0;

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();

                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban harus 1 sampai 5!");
                    }
                } while (jawaban < 1 || jawaban > 5);

                survei[i][j] = jawaban;
                totalKeseluruhan += jawaban;
            }
        }

        System.out.println("\n===== RATA-RATA SETIAP RESPONDEN =====");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalResponden = 0;

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalResponden += survei[i][j];
            }

            System.out.printf("Responden ke-%d : %.2f%n", (i + 1), totalResponden / JUMLAH_PERTANYAAN);
        }

        System.out.println("\n===== RATA-RATA SETIAP PERTANYAAN =====");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPertanyaan = 0;

            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPertanyaan += survei[i][j];
            }

            System.out.printf("Pertanyaan ke-%d : %.2f%n", (j + 1), totalPertanyaan / JUMLAH_RESPONDEN);
        }

        System.out.println("\n===== RATA-RATA KESELURUHAN =====");
        System.out.printf("Rata-rata keseluruhan : %.2f%n", totalKeseluruhan / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN));

        sc.close();
    }
}