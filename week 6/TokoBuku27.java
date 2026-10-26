import java.util.Scanner;

public class TokoBuku27 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); 
 
        double diskon = 0; 
        System.out.print("Masukkan buku yang dibeli (kamus/novel):  ");    
        String buku = sc.nextLine(); 
        System.out.print("Masukkan jumlah buku: "); 
        int jumlahBuku = sc.nextInt(); 
 
        if (buku.equalsIgnoreCase("kamus") || buku.equalsIgnoreCase("novel")) { 
            if (buku.equalsIgnoreCase("kamus")) { 
                diskon = 0.1; 
                if (jumlahBuku > 2) { 
                    diskon += 0.02; 
                } 
            } else { 
                diskon = 0.07; 
                if (jumlahBuku > 3) { 
                    diskon += 0.02; 
                } else { 
                    diskon += 0.01; 
                } 
            } 
        } else { 
            if (jumlahBuku > 3) { 
                diskon = 0.05; 
            } 
        } 
        diskon = 100 * diskon; 
        System.out.println("Jumlah diskon yang diberikan adalah " + (int) diskon + "%"); 
        sc.close(); 
    } 
} 
        

