# JOBSHEET 9 - ARRAY 1 DIMENSI

**Identitas Mahasiswa:**
* **Nama:** Subhan Akbar Mashuri
* **NIM:** 264107020214
* **Kelas / No. Presensi:** TI-1D / 27

___

## 1. TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu memahami konsep array 1 dimensi serta cara mendeklarasikan, menginisialisasi, dan mengakses elemennya dalam bahasa pemrograman Java. 
2. Mahasiswa mampu membuat program yang memanfaatkan array 1 dimensi untuk menyimpan dan mengolah data, termasuk menggunakan perulangan for dan foreach. 
3. Mahasiswa mampu menerapkan operasi aritmatika pada elemen array, seperti menghitung total, rata-rata, nilai tertinggi, dan nilai terendah. 
4. Mahasiswa mampu menerapkan algoritma pencarian (searching) dan pengurutan (sorting) sederhana pada array 1 dimensi. 
5. Mahasiswa mampu menerapkan array 1 dimensi untuk menyelesaikan studi kasus yang relevan dengan kehidupan kampus dan sehari-hari.
- - -

## 2. HASIL PERCOBAAN & ANALISIS
### 2.1 Percobaan 1:  Deklarasi, Inisialisasi, Mengisi, dan Menampilkan Elemen Array

Pada percobaan ini dibuat array `bil` bertipe `int` berkapasitas 4 elemen, diisi satu per satu, lalu ditampilkan dengan tiga cara: perulangan `for`, `foreach`, dan `Arrays.toString()`. Kode juga memuat modifikasi pada Pertanyaan 2 (inisialisasi saat deklarasi) dan Pertanyaan 3 (menampilkan nilai dikali 2).

#### 2.1.1 Kode Program Java
```java
import java.util.Arrays;

public class ArrayBilangan27 {
    public static void main(String[] args) {

        int bil [] = new int [4];
        bil [0] = 5;
        bil [1] = 13;
        bil [2] = -7;
        bil [3] = 17;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil [" + i + "] = " + bil [i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
        
        System.out.println(Arrays.toString(bil));
    }
}
```
#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Percobaan 1]()

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.6, 2000000, apa yang terjadi? Mengapa bisa demikian?
    * **Jawab:** Program tidak dapat dijalankan karena variabel `bil` menggunakan tipe data `int` bukan `double`. Angka 12867 dan 2000000 akan tetap valid jika menggunakan tipe data `int`.
* **Pertanyaan 2:** Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array (tanpa new int[4] dan pengisian satu per satu).
    * **Jawab:** 
        ```java
        int[] bil = {5, 13, -7, 17};
        ```
* **Pertanyaan 3:** Ubah statement penampilan pada langkah ke-4 menjadi seperti berikut: `System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));` Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
    * **Jawab:** Digunakan untuk menampilkan indeks array, isi nilai dari array, dan hasil perkalian nilai elemen dengan angka 2.

        ![Percobaan 1: Pertanyaan 3]()

* **Pertanyaan 4:** Jika kodisi pada statement for-loop di atas diubah menjadi i <= 4, apa keluaran dari program? Mengapa demikian?
    * **Jawab:** Program akan menampilkan elemen array dari indeks 0 hingga 3, kemudian akan mengalami error `ArrayIndexOutOfBoundsException`ketika ingin mengakses indeks 4. Hal ini terjadi karena array hanya memiliki 4 elemen dari indeks 0 hingga 3.
* **Pertanyaan 5:** Apa perbedaaan antara menampilkan array menggunakan for loop, foreach loop, dan Arrays.toString() pada langkah ke-5? Kapan sebaiknya masing-masing digunakan?
    * **Jawab:** 
        * For loop: digunakan untuk mengakses elemen array berdasarkan indeks.
        * Foreach loop: digunakan untuk membaca setiap elemen array secara berurutan tanpa perlu mengakses indeks secara langsung.
        * Arrays.toString(): digunakan untuk menampilkan seluruh isi array dalam satu baris dengan format yang mudah dibaca.
---

### 2.2 Percobaan 2: Studi Kasus SIAKAD — Input Nilai Mahasiswa dan Status Kelulusan

Pada percobaan ini dosen menginput nilai akhir 10 mahasiswa ke dalam array `nilaiAkhir`, lalu program menampilkan nilai beserta status kelulusan (LULUS jika nilai lebih dari 70, selain itu TIDAK LULUS). Kode juga memuat modifikasi pada Pertanyaan 2, 3, dan 4.

#### 2.2.1 Kode Program Java
```java
import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nilaiAkhir [] = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir [i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir [i] + " (" + status + ")");
        }

        sc.close();
    }
}
```
#### 2.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Percobaan 2]()

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa yang dimaksud dengan kondisi `i < nilaiAkhir.length` pada perulangan di atas?
    * **Jawab:** Digunakan untuk mengakses elemen array dari indeks ke-`i` hingga `< nilaiAkhir.length`. Karena array memiliki 10 elemen, maka loop digunakan untuk mengakses array dari indeks 0 hingga 9.
* **Pertanyaan 2:** Modifikasi program agar hanya menampilkan nilai mahasiswa yang lulus saja (nilai > 70), tanpa menampilkan yang tidak lulus. Jelaskan alur programnya!
    * **Jawab:** Program akan mengakses elemen array terlebih dahulu berdasarkan indeks. Kemudian mengecek kondisi nilai dari array apakah nilainya > 70. Jika kondisi memenuhi maka data mahasiswa akan menampilkan LULUS. Jika kondisi tidak memenuhi, data mahasiswa dilewati sehingga tidak ditampilkan.
        ```java
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir [i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir [i] + "(LULUS)");
            }
        }
* **Pertanyaan 3:** Ubah perulangan pada langkah ke-4 dan ke-5 dari for loop menjadi foreach loop. Apakah seluruh bagian program dapat diubah menjadi foreach? Jelaskan bagian mana yang bisa dan tidak bisa, beserta alasannya.
    * **Jawab:** Tidak semua perulangan dapat diubah menjadi foreach. `for` lebih cocok untuk mengisi array karena membutuhkan indeks posisi, sedangkan foreach lebih tepat untuk membaca dan menampilkan seluruh elemen array secara langsung.
* **Pertanyaan 4:** Modifikasi program agar turut menghitung dan menampilkan jumlah mahasiswa yang lulus dan jumlah mahasiswa yang tidak lulus di akhir program.
    * **Jawab:**
        ```java
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir [i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir [i] + "(LULUS)");
                lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir [i] + "(TIDAK LULUS)");
                tidakLulus++;
            }
        }

        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        ```
---

### 2.3 Percobaan 3: Operasi Aritmatika pada Array — Total, Rata-rata, Nilai Tertinggi dan Terendah

Percobaan ini melanjutkan studi kasus SIAKAD untuk menghasilkan ringkasan nilai mahasiswa, sebagaimana biasa ditampilkan pada rekap nilai akhir semester. Kode juga memuat modifikasi Pertanyaan 1 (jumlah mahasiswa lulus).

#### 2.3.1 Kode Program Java
```java
import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiMhs [] = new int [10];
        int total = 0;
        double rata;
        String predikat = " ";

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        rata = total / (double) nilaiMhs.length;
        System.out.println("Total nilai : " + total);
        System.out.println("Rata-rata   : " + rata);
        if (rata >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        
        int tertinggi = nilaiMhs [0];
        int terendah = nilaiMhs [0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs [i] > tertinggi) {
                tertinggi = nilaiMhs [i];
            }
            if (nilaiMhs [i] < terendah) {
                terendah = nilaiMhs [i];
            }
        }

        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Predikat kelas  : " + predikat);
        sc.close();
    }
}
```
#### 2.3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Percobaan 3](ArrayRataNilai.png)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Modifikasi kode program di atas agar dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki nilai lebih besar dari 70 (>70).
    * **Jawab:**
        ```java
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        ```
* **Pertanyaan 2:** Modifikasi program di atas sehingga program menerima jumlah elemen array berdasarkan input dari pengguna (tidak selalu 10), lalu tetap dapat menghitng total, rata-rata, nilai tertinggi, dan nilai terendah dengan benar.
    * **Jawab:**
        ```java
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int nilaiMhs[] = new int[jumlahMhs];
        int total = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        double rata = (double) total / nilaiMhs.length;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        ```
* **Pertanyaan 3:** Mengapa pada perhitungan rata-rata digunakan `(double) total / nilaiMhs.length`, bukan langsung `total / nilaiMhs.length?` Jelaskan!
    * **Jawab:** Karena variabel `total` dan `nilaiMhs.length` menggunakan tipe data int. Jika keduanya bertipe data int maka akan melakukan pembulatan bilangan bulat yang akan menghilangkan angka di belakang koma. Dengan menggunakan `(double) total / nilaiMhs.length` nilai variabel `total` menjadi tipe data desimal sebelum melakukan pembagian.
---

### 2.4 Percobaan 4: Pencarian (Searching) dan Pengurutan (Sorting) Sederhana

Percobaan ini menerapkan algoritma pencarian dan pengurutan sederhana pada data nilai mahasiswa, dua kemampuan dasar yang banyak dipakai dalam pengolahan data nyata.


#### 2.4.1 Kode Program Java
##### 2.4.1.1 Bagian A
```java
public class SearchNilai27 {
    public static void main(String[] args) {
        
        int nilai [] = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai [i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
```
##### 2.4.1.2 Bagian B
```java
import java.util.Arrays;

public class SortNilai27 {
    public static void main(String[] args) {
        
        int[] nilai = { 78, 65, 90, 55, 88, 72 };
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
```
#### 2.4.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:
* Bagian A:

![Percobaan 4 Bagian A]()

* Bagian B:

![Percobaan 4 Bagian B]()

#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jelaskan maksud dari statement break; pada kode program bagian A di atas!
    * **Jawab:** Digunakan untuk menghentikan perulangan `for` ketika nilai key sudah ditemukan. 
* **Pertanyaan 2:** Modifikasi kode program Bagian A sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (`key`) yang ingin dicari dari pengguna, lalu mencetak indeks posisi elemen dari nilai (``key``) tersebut.
    * **Jawab:** 
        ```java
        System.out.print("Masukkan banyak nilai: ");
        int banyakNilai = sc.nextInt();

        int nilai [] = new int[banyakNilai];

        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }   

        System.out.print("Masukkan key nilai: ");
        int keyNilai = sc.nextInt();

        for (int i = 0; i < banyakNilai; i++) {
            if (nilai [i] == keyNilai ) {
                System.out.println("Nilai " + keyNilai + " ditemukan pada indeks ke-" + i);
                break;
            }
        }
        ```
* **Pertanyaan 3:** Modifikasi program Bagian A agar menampilkan pesan "Nilai yang dicari tidak ditemukan" dengan format pesan yang lebih informatif apabila nilai yang dicari (```key```) tidak ada di dalan array.
    * **Jawab:**
        ```java
        if (!ditemukan) {
            System.out.println("Nilai " + keyNilai
                + " tidak ditemukan dalam array. "
                + "Silakan periksa kembali nilai yang Anda masukkan!");
        }
        ```
* **Pertanyaan 4:** Jelaskan langkah demi langkah cara kerja algoritma `bubble sort` pada Bagian B menggunakan data ujicoba yang tersedia!
    * **Jawab:** Bubble sort bekerja dengan membandingkan dua elemen yang bersebelahan. Jika elemen pertama lebih besar daripada elemen kedua, maka keduanya akan bertukar posisi. Proses ini dilakukan hingga urutan data dari yang terkecil ke terbesar.

        Data awal: `[78, 65, 90, 55, 88, 72]`
        - Putaran 1: Membandingkan elemen bersebelahan dan menukar jika elemen kiri lebih besar. Hasilnya `[65, 78, 55, 88, 72, 90]`.
        - Putaran 2: Melanjutkan perbandingan hingga elemen terbesar berikutnya berada di posisi yang tepat. Hasilnya `[65, 55, 78, 72, 88, 90]`.
        - Putaran 3: Hasilnya `[55, 65, 72, 78, 88, 90]`.
        - Putaran 4 dan 5: Tidak ada perubahan karena data sudah terurut.

        Hasil akhir: `[55, 65, 72, 78, 88, 90]`
    
* **Pertanyaan 5:** Modifikasi program Bagian B agar mengurutkan array dari nilai terbesar ke terkecil (`descending`), bukan dari terkecil ke terbesar.
    * **Jawab:**
        ```java
        int[] nilai = { 78, 65, 90, 55, 88, 72 };
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
        ```
---

## 3. TUGAS
### 3.1 Tugas 1: Pengelolaan Nilai Mahasiswa 
#### 3.1.1 Kode Program Java
```java
import java.util.Scanner;

public class Tugas1NilaiMahasiswa27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println();
        System.out.println("===== DAFTAR NILAI MAHASISWA =====");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println("==================================");
        System.out.printf("Rata-rata nilai : %.2f%n", rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        input.close();
    }
}
```
#### 3.1.2 Hasil Runnning / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Tugas 1](Tugas1Array.png)

---

### 3.2 Tugas 2: Aplikasi Pemesanan Kafe Kampus 
#### 3.2.1 Kode Program Java
```java
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
```
#### 3.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Tugas 2](Tugas2Array.png)

---

## 4. KESIMPULAN
* Array digunakan untuk menyimpan banyak data dengan tipe yang sama dalam satu variabel.
* Elemen array dapat diakses menggunakan indeks yang dimulai dari 0.
* Perulangan for dan foreach mempermudah proses pengolahan data dalam array.
* Array dapat digunakan untuk menghitung total, rata-rata, nilai tertinggi, dan nilai terendah.
* Linear search digunakan untuk mencari data, sedangkan bubble sort digunakan untuk mengurutkan data.