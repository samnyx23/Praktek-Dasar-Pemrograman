import java.util.Scanner;

public class Triangle27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga bertingkat
        int i = 1;                      // diperbaiki: mulai dari 1
        while (i <= n) {
            int j = 0;                  // reset j tiap baris
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();       // diperbaiki: pindah baris
            i++;
        }

        // Segitiga terbalik
        i = n;                          // tanpa 'int' karena i sudah dideklarasikan
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}