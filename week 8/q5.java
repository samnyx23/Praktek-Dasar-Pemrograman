//Nama: Subhan Akbar Mashuri
//Kelas: TI-1D
//NIM: 264107020214 

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senjata;
        System.out.print("Masukkan senjata (AR/SMG/Sniper): ");
        senjata = sc.nextLine();

        String tubuh;
        System.out.print("Masukkan bagian tubuh (Kepala/Badan): ");
        tubuh = sc.nextLine();

        int damageDasar;
        int damageAkhir;
        double penguranganRompi;
        
        if (senjata.equalsIgnoreCase("AR")) {
            if (tubuh.equalsIgnoreCase("Kepala")) {
                damageDasar = 60;
                System.out.println("Damage dasar: " + damageDasar);
                damageAkhir = damageDasar;
                System.out.println("Damage akhir: " + damageAkhir);
            } else if (tubuh.equalsIgnoreCase("Badan")) {
                damageDasar = 35;
                System.out.println("Damage dasar: " + damageDasar);
                penguranganRompi = 0.2 * damageDasar;
                System.out.println("Pengurangan rompi: 20% " + (int) penguranganRompi);
                damageAkhir = (int) (damageDasar - penguranganRompi);
                System.out.println("Damage akhir: " + damageAkhir);
            } else {
                System.out.println("Bagian tubuh tidak valid.");
            }
        } else if (senjata.equalsIgnoreCase("SMG")) {
             if (tubuh.equalsIgnoreCase("Kepala")) {
                damageDasar = 45;
                System.out.println("Damage dasar: " + damageDasar);
                penguranganRompi = 0.3 * damageDasar;
                System.out.println("Pengurangan rompi: 30%" + (int) penguranganRompi);
                damageAkhir = (int) (damageDasar - penguranganRompi);
                System.out.println("Damage akhir: " + damageAkhir);
            } else if (tubuh.equalsIgnoreCase("Badan")) {
                damageDasar = 25;
                System.out.println("Damage dasar: " + damageDasar);
                penguranganRompi = 0.3 * damageDasar;
                System.out.println("Pengurangan rompi: 30% " + (int) penguranganRompi);
                damageAkhir = (int) (damageDasar - penguranganRompi);
                System.out.println("Damage akhir: " + damageAkhir);
            } else {
                System.out.println("Bagian tubuh tidak valid.");
            }
        } else if (senjata.equalsIgnoreCase("Sniper")) {
             if (tubuh.equalsIgnoreCase("Kepala")) {
                System.out.println("knokck langsung");
            } else if (tubuh.equalsIgnoreCase("Badan")) {
                damageDasar = 90;
                System.out.println("Damage dasar: " + damageDasar);
                damageAkhir = damageDasar;
                System.out.println("Damage akhir: " + damageAkhir);
            } else {
                System.out.println("Bagian tubuh tidak valid.");
            }
        } else {
            System.out.println("senjata tidak valid");
        }

        sc.close();
        }
    }
