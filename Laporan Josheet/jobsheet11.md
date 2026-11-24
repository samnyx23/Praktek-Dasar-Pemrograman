# JOBSHEET 11 - ARRAY 2 DIMENSI

**Identitas Mahasiswa:**
* **Nama:** Subhan Akbar Mashuri
* **NIM:** 264107020214
* **Kelas / No. Presensi:** TI-1D / 27

___

## 1. TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu mendeklarasikan, menginstansiasi, dan menginisialisasi array 2 dimensi dalam bahasa Java.
2. Mahasiswa mampu mengakses dan mengisi elemen array 2 dimensi menggunakan indeks baris dan kolom.
3. Mahasiswa mampu memproses array 2 dimensi dengan nested loop, baik `for` maupun `foreach`.
4. Mahasiswa mampu membuat array 2 dimensi dengan panjang baris yang berbeda (*jagged array*).
5. Mahasiswa mampu menghitung nilai rata-rata per baris dan per kolom pada studi kasus nyata.
- - -

## 2. HASIL PERCOBAAN & ANALISIS
### 2.1 Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

Pada percobaan ini dibuat array 2 dimensi `penonton` bertipe `String` dengan 4 baris dan 2 kolom untuk menyimpan nama penonton bioskop mini. Elemen diisi satu per satu, lalu ditampilkan dengan `printf`. Modifikasi kode dari pertanyaan ditulis pada bagian jawaban.

#### 2.1.1 Kode Program Java
```java
public class Bioskop27 {
    public static void main(String[] args) {

        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
    }
}
```
#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Percobaan 1]()

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
    * **Jawab:** Tidak harus. Elemen array dapat diisi dalam urutan apa pun selama indeks baris dan kolomnya masih dalam rentang array. Misalnya `penonton[3][1]` boleh diisi lebih dulu daripada `penonton[0][0]`. Elemen yang belum diisi akan tetap berisi nilai default.
* **Pertanyaan 2:** Mengapa terdapat `null` pada daftar nama penonton? Jelaskan dari sisi nilai default array.
    * **Jawab:** Saat array dibuat dengan `new String[4][2]`, setiap elemen otomatis diberi nilai default sesuai tipe datanya. `String` adalah tipe referensi (objek), sehingga nilai defaultnya adalah `null`. Jika ada elemen yang tidak diisi (pada contoh output, `penonton[3][1]`), maka elemen tersebut tetap bernilai `null` dan tercetak sebagai `null`.
* **Pertanyaan 3:** Lengkapi pengisian pada langkah 3 jika ada elemen yang belum terisi, lalu jalankan kembali program.
    * **Jawab:** Elemen yang belum terisi adalah `penonton[3][1]`, dilengkapi dengan:
        ```java
        penonton[3][1] = "Hana";
        ```
        Setelah dijalankan, output menjadi:
        ```
        Amin     Bena
        Candra   Dela
        Eka      Farhan
        Gisel    Hana
        ```
* **Pertanyaan 4:** Tambahkan kode berikut setelah langkah 4. Jelaskan fungsi dari `penonton.length` dan `penonton[0].length`!
    * **Jawab:** `penonton.length` menghasilkan jumlah baris pada array 2 dimensi (karena array 2 dimensi adalah array yang elemennya berupa array baris), sedangkan `penonton[0].length` menghasilkan jumlah kolom (panjang array) pada baris ke-0. Kode yang ditambahkan setelah Langkah 4:
        ```java
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);
        ```
        Output:
        ```
        4
        2
        2
        2
        2
        ```
* **Pertanyaan 5:** Apakah `penonton[0].length`, `penonton[1].length`, `penonton[2].length`, dan `penonton[3].length` memiliki nilai yang sama? Mengapa?
    * **Jawab:** Ya, semuanya bernilai 2. Hal ini karena array dibuat dengan `new String[4][2]`, sehingga setiap baris dibuat dengan jumlah kolom yang sama (array persegi).
* **Pertanyaan 6:** Modifikasi kode pada pertanyaan 4 untuk menampilkan panjang setiap baris menggunakan for loop.
    * **Jawab:**
        ```java
        System.out.println(penonton.length);

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        }
        ```
        Output:
        ```
        4
        Panjang baris ke-1: 2
        Panjang baris ke-2: 2
        Panjang baris ke-3: 2
        Panjang baris ke-4: 2
        ```
* **Pertanyaan 7:** Modifikasi kode pada pertanyaan 5 untuk menampilkan panjang setiap baris menggunakan foreach loop.
    * **Jawab:**
        ```java
        System.out.println(penonton.length);

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
        ```
        Output:
        ```
        4
        Panjang baris: 2
        Panjang baris: 2
        Panjang baris: 2
        Panjang baris: 2
        ```
        Variabel `barisPenonton` bertipe `String[]` karena setiap elemen dari `penonton` adalah satu baris (array 1 dimensi).
* **Pertanyaan 8:** Tambahkan kode untuk menampilkan nama penonton pada baris ke-3 (indeks 2) menggunakan for loop.
    * **Jawab:**
        ```java
        System.out.println("Penonton pada baris ke-3: ");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }
        ```
        Output:
        ```
        Penonton pada baris ke-3:
        Eka
        Farhan
        ```
* **Pertanyaan 9:** Modifikasi kode pada pertanyaan 8 menjadi perulangan dengan foreach loop.
    * **Jawab:**
        ```java
        System.out.println("Penonton pada baris ke-3: ");

        for (String i : penonton[2]) {
            System.out.println(i);
        }
        ```
        Output:
        ```
        Penonton pada baris ke-3:
        Eka
        Farhan
        ```
        Hasilnya sama dengan Pertanyaan 8. Perbedaannya, `i` pada foreach langsung berisi nilai elemen (bukan indeks).
* **Pertanyaan 10:** Modifikasi kode pada pertanyaan 9 untuk menampilkan nama penonton setiap baris menggunakan `String.join()`.
    * **Jawab:**
        ```java
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }
        ```
        Output:
        ```
        Penonton pada baris ke-1: Amin, Bena
        Penonton pada baris ke-2: Candra, Dela
        Penonton pada baris ke-3: Eka, Farhan
        Penonton pada baris ke-4: Gisel, Hana
        ```
* **Pertanyaan 11:** Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan for loop?
    * **Jawab:**
        * Kelebihan foreach: penulisan lebih ringkas dan mudah dibaca, tidak perlu mengatur variabel indeks, serta mengurangi risiko kesalahan batas (`ArrayIndexOutOfBoundsException`).
        * Kekurangan foreach: tidak menyediakan indeks (sulit jika nomor baris/kolom dibutuhkan), tidak bisa dipakai untuk mengubah isi elemen array (variabel loop hanya salinan nilai/referensi), tidak bisa menelusuri secara terbalik atau melompati elemen, dan tidak bisa mengakses dua array sekaligus berdasarkan indeks yang sama.
* **Pertanyaan 12:** Berapa indeks baris maksimal untuk array `penonton`? Dari mana nilai itu diperoleh?
    * **Jawab:** Indeks baris maksimal adalah 3. Nilai diperoleh dari `penonton.length - 1`, yaitu 4 - 1 = 3, karena indeks dimulai dari 0.
* **Pertanyaan 13:** Berapa indeks kolom maksimal untuk array `penonton`? Apakah nilainya sama untuk setiap baris?
    * **Jawab:** Indeks kolom maksimal adalah 1, diperoleh dari `penonton[i].length - 1` = 2 - 1 = 1. Nilainya sama untuk setiap baris karena array dibuat dengan jumlah kolom yang sama (2 kolom) pada semua baris.
* **Pertanyaan 14:** Apa fungsi dari `String.join()`? Jelaskan parameter yang diterimanya.
    * **Jawab:** `String.join()` berfungsi menggabungkan beberapa elemen `String` menjadi satu `String` dengan pemisah tertentu. Parameter pertama adalah *delimiter* (pemisah, misalnya `", "`), parameter kedua dan seterusnya adalah elemen yang akan digabung, dapat berupa array `String` (seperti `penonton[i]`), beberapa `String` terpisah, atau `Iterable` seperti `List`.
* **Pertanyaan Diskusi 1:** Jika Anda menulis `penonton[1] = null;` lalu memanggil `penonton[1].length`, apa yang terjadi? Bandingkan dengan `penonton[1][0] = null;`. Jelaskan perbedaan antara baris yang `null` dan elemen yang `null`.
    * **Jawab:** `penonton[1] = null;` membuat baris ke-1 tidak lagi menunjuk ke array apa pun, sehingga `penonton[1].length` menghasilkan `NullPointerException`. Sedangkan `penonton[1][0] = null;` hanya mengosongkan satu elemen di dalam baris, barisnya tetap ada sehingga `penonton[1].length` tetap bernilai 2. Jadi, baris yang `null` berarti array barisnya sendiri tidak ada, sedangkan elemen yang `null` berarti array barisnya ada tetapi isi kolom tersebut kosong.
* **Pertanyaan Diskusi 2:** Apakah `penonton.length` dapat berubah setelah array dibuat? Bagaimana jika Anda ingin menambah baris? Diskusikan batasan array di Java.
    * **Jawab:** Tidak, panjang array bersifat tetap sejak dibuat. Untuk menambah baris harus dibuat array baru yang lebih besar, lalu isi array lama disalin ke array baru (misalnya dengan `Arrays.copyOf()`), atau menggunakan struktur data dinamis seperti `ArrayList`. Batasan array di Java: ukuran tetap, hanya menyimpan satu tipe data, dan penambahan/penghapusan elemen tidak praktis.
---

### 2.2 Percobaan 2: Scanner dan Perulangan untuk Input dan Output Array 2 Dimensi

Percobaan ini melanjutkan Percobaan 1, dengan data penonton dimasukkan lewat keyboard menggunakan `Scanner`. Modifikasi dari pertanyaan (menu, validasi baris/kolom, cek kursi terisi, dan tampilan `***`) ditulis pada bagian jawaban.

#### 2.2.1 Kode Program Java
```java
import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
```
#### 2.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Percobaan 2]()

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apakah pengisian elemen array dari Scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
    * **Jawab:** Tidak harus. Karena baris dan kolom ditentukan oleh pengguna, kursi dapat diisi dalam urutan bebas. Pada contoh sesi input, kursi (1,2) diisi lebih dulu sehingga kursi (1,1) tetap kosong (`null`). Syaratnya hanya nomor baris dan kolom harus berada dalam rentang yang valid.
* **Pertanyaan 2:** Modifikasi program agar menampilkan menu (1. Input data penonton, 2. Tampilkan daftar penonton, 3. Exit).
    * **Jawab:** Menu dibuat dengan perulangan `do-while` yang terus berjalan sampai pengguna memilih 3, dan pilihan diproses dengan `if - else if - else`. Kode lengkapnya:
        ```java
        import java.util.Scanner;

        public class BioskopWithScanner27 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int baris, kolom, menu;
                String nama, pilihan;
                String[][] penonton = new String[4][2];

                do {
                    System.out.println();
                    System.out.println("===== MENU BIOSKOP =====");
                    System.out.println("1. Input data penonton");
                    System.out.println("2. Tampilkan daftar penonton");
                    System.out.println("3. Exit");
                    System.out.print("Pilih menu: ");
                    menu = sc.nextInt();
                    sc.nextLine();

                    if (menu == 1) {
                        while (true) {
                            System.out.print("Masukkan nama: ");
                            nama = sc.nextLine();
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            penonton[baris - 1][kolom - 1] = nama;

                            System.out.print("Input penonton lainnya? (y/n): ");
                            pilihan = sc.nextLine();

                            if (pilihan.equalsIgnoreCase("n")) {
                                break;
                            }
                        }

                    } else if (menu == 2) {
                        System.out.println("--- DAFTAR PENONTON ---");
                        for (int i = 0; i < penonton.length; i++) {
                            for (int j = 0; j < penonton[i].length; j++) {
                                System.out.print(penonton[i][j] + "    ");
                            }
                            System.out.println();
                        }

                    } else if (menu == 3) {
                        System.out.println("Terima kasih!");

                    } else {
                        System.out.println("Menu tidak tersedia!");
                    }
                } while (menu != 3);

                sc.close();
            }
        }
        ```
        Contoh output:
        ```
        ===== MENU BIOSKOP =====
        1. Input data penonton
        2. Tampilkan daftar penonton
        3. Exit
        Pilih menu: 1
        Masukkan nama: Agus
        Masukkan baris: 1
        Masukkan kolom: 2
        Input penonton lainnya? (y/n): n

        ===== MENU BIOSKOP =====
        1. Input data penonton
        2. Tampilkan daftar penonton
        3. Exit
        Pilih menu: 2
        --- DAFTAR PENONTON ---
        null    Agus
        null    null
        null    null
        null    null

        ===== MENU BIOSKOP =====
        1. Input data penonton
        2. Tampilkan daftar penonton
        3. Exit
        Pilih menu: 3
        Terima kasih!
        ```
* **Pertanyaan 3:** Modifikasi program untuk menangani nomor baris atau kolom yang tidak tersedia (misalnya baris 7 atau kolom 0).
    * **Jawab:** Nomor baris dicek terhadap `penonton.length` dan nomor kolom dicek terhadap `penonton[baris - 1].length`. Jika di luar rentang, tampilkan pesan dan minta input baris dan kolom kembali, sehingga tidak terjadi `ArrayIndexOutOfBoundsException`. Pengecekan kolom ditaruh pada `else if` agar `penonton[baris - 1]` baru diakses setelah baris dipastikan valid. Bagian kode menu 1 yang diubah:
        ```java
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();

            while (true) {
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > penonton.length) {
                    System.out.println("Baris tidak tersedia! Pilih baris 1 - " + penonton.length);
                } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                    System.out.println("Kolom tidak tersedia! Pilih kolom 1 - " + penonton[baris - 1].length);
                } else {
                    break;
                }
            }

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = sc.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
        ```
        Contoh output:
        ```
        Masukkan nama: Agus
        Masukkan baris: 7
        Masukkan kolom: 1
        Baris tidak tersedia! Pilih baris 1 - 4
        Masukkan baris: 1
        Masukkan kolom: 0
        Kolom tidak tersedia! Pilih kolom 1 - 2
        Masukkan baris: 1
        Masukkan kolom: 2
        Input penonton lainnya? (y/n):
        ```
* **Pertanyaan 4:** Pada menu 1, tampilkan peringatan jika kursi yang dipilih sudah terisi penonton lain, lalu minta baris dan kolom kembali.
    * **Jawab:** Kursi terisi dicek dengan `penonton[baris - 1][kolom - 1] != null`. Pengecekan ini ditambahkan sebagai kondisi `else if` pada perulangan validasi, sehingga baris dan kolom diminta ulang sampai kursi yang dipilih kosong:
        ```java
        if (baris < 1 || baris > penonton.length) {
            System.out.println("Baris tidak tersedia! Pilih baris 1 - " + penonton.length);
        } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
            System.out.println("Kolom tidak tersedia! Pilih kolom 1 - " + penonton[baris - 1].length);
        } else if (penonton[baris - 1][kolom - 1] != null) {
            System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ", pilih kursi lain!");
        } else {
            break;
        }
        ```
        Contoh output (kursi baris 1 kolom 2 sudah diisi Agus):
        ```
        Masukkan nama: Indah
        Masukkan baris: 1
        Masukkan kolom: 2
        Kursi sudah terisi oleh Agus, pilih kursi lain!
        Masukkan baris: 2
        Masukkan kolom: 1
        Input penonton lainnya? (y/n):
        ```
* **Pertanyaan 5:** Pada menu 2, jika sebuah kursi kosong (`null`), tampilkan `***` sebagai pengganti `null`.
    * **Jawab:** Setiap elemen dicek terlebih dahulu. Jika `null`, tampilkan `***`, jika tidak tampilkan namanya. Bagian kode menu 2 yang diubah:
        ```java
        } else if (menu == 2) {
            System.out.println("--- DAFTAR PENONTON ---");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.printf("%-10s", "***");
                    } else {
                        System.out.printf("%-10s", penonton[i][j]);
                    }
                }
                System.out.println();
            }
        }
        ```
        Contoh output (setelah input sesi pada Kode 14):
        ```
        --- DAFTAR PENONTON ---
        ***       Agus
        Indah     ***
        Sonya     Fuady
        ***       ***
        ```
* **Pertanyaan Diskusi 1:** Jika pengguna mengetik huruf pada prompt baris, `nextInt()` akan melempar `InputMismatchException`. Coba, lalu diskusikan bagaimana program seharusnya menangani kesalahan input ini.
    * **Jawab:** Program berhenti (crash) dengan `InputMismatchException` karena `nextInt()` hanya menerima angka. Program seharusnya menangani kesalahan ini dengan `try-catch`, lalu membuang input yang salah dan meminta input ulang. Alternatif lain adalah mengecek dengan `sc.hasNextInt()` sebelum membaca angka:
        ```java
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                valid = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                sc.nextLine();   // membuang input yang salah dari buffer
            }
        }
        ```
* **Pertanyaan Diskusi 2:** Jika jumlah baris dan kolom kursi ditentukan oleh pengguna saat program berjalan, bagian mana dari kode yang harus diubah? Mengapa array 2 dimensi tidak bisa diubah ukurannya setelah dibuat?
    * **Jawab:** Bagian pembuatan array harus diubah: jumlah baris dan kolom dibaca lebih dulu dengan `Scanner`, baru array dibuat dengan `new String[jumlahBaris][jumlahKolom]`. Semua pengecekan rentang juga harus memakai `length` (bukan angka tetap 4 dan 2). Array tidak dapat diubah ukurannya karena saat `new` dijalankan, Java mengalokasikan memori dengan ukuran yang sudah pasti; ukuran itu melekat pada objek array dan tidak dapat diperbesar atau diperkecil. Untuk ukuran baru harus dibuat array baru dan datanya disalin.
---

### 2.3 Percobaan 3: Array 2 Dimensi dengan Panjang Baris Berbeda

Pada percobaan ini dibuat *jagged array* `myNumbers` bertipe `int` dengan 3 baris, yaitu baris pertama 5 kolom, baris kedua 3 kolom, dan baris ketiga 1 kolom. Isi tiap baris ditampilkan dengan `Arrays.toString()`. Modifikasi kode dari pertanyaan ditulis pada bagian jawaban.

#### 2.3.1 Kode Program Java
```java
import java.util.Arrays;

public class Numbers27 {
    public static void main(String[] args) {

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
    }
}
```
#### 2.3.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Percobaan 3]()

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa fungsi dari `Arrays.toString()`?
    * **Jawab:** `Arrays.toString()` mengubah isi array 1 dimensi menjadi satu `String` dengan format `[elemen1, elemen2, ...]`, sehingga seluruh isi array dapat dicetak sekaligus tanpa perulangan.
* **Pertanyaan 2:** Pada Kode 16, `Arrays.toString()` dipanggil pada `myNumbers[i]`. Ganti pemanggilannya menjadi `Arrays.toString(myNumbers)`, lalu compile dan jalankan. Apa yang tampil? Jelaskan.
    * **Jawab:** Kode yang diubah:
        ```java
        System.out.println(Arrays.toString(myNumbers));
        ```
        Yang tampil bukan angka, melainkan kode alamat objek, misalnya:
        ```
        [[I@15db9742, [I@6d06d69c, [I@7852e922]
        ```
        Nilai tepatnya dapat berbeda di tiap komputer. Hal ini terjadi karena `myNumbers` adalah array 2 dimensi, sehingga setiap elemennya adalah array `int[]` (objek). `Arrays.toString()` hanya mengubah elemen paling luar menjadi teks, sehingga tiap baris tercetak sebagai representasi objek (`[I` berarti array `int`, diikuti kode hash), bukan isinya.
* **Pertanyaan 3:** Jalankan juga `System.out.println(Arrays.deepToString(myNumbers));`. Bandingkan hasilnya dengan Kode 16. Mengapa `deepToString()` diperlukan untuk array 2 dimensi?
    * **Jawab:** Kode yang ditambahkan:
        ```java
        System.out.println(Arrays.deepToString(myNumbers));
        ```
        Output:
        ```
        [[0, 0, 0, 0, 0], [0, 0, 0], [0]]
        ```
        Isinya sama dengan Kode 16, tetapi tercetak dalam satu baris dan tanpa perulangan. `deepToString()` diperlukan karena method ini menelusuri array bersarang secara rekursif sampai elemen paling dalam, sedangkan `toString()` hanya menelusuri satu tingkat.
* **Pertanyaan 4:** Apa nilai default untuk elemen array dengan tipe data `int`?
    * **Jawab:** Nilai defaultnya adalah `0`.
* **Pertanyaan 5:** Tambahkan kode berikut untuk menampilkan panjang setiap baris. Compile dan run, lalu amati hasilnya.
    * **Jawab:** Kode yang ditambahkan:
        ```java
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }
        ```
        Output:
        ```
        Panjang baris ke-1: 5
        Panjang baris ke-2: 3
        Panjang baris ke-3: 1
        ```
        Hasil ini membuktikan bahwa setiap baris pada *jagged array* dapat memiliki panjang yang berbeda.
* **Pertanyaan 6:** Array `myNumbers` memiliki panjang yang berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi? Jelaskan.
    * **Jawab:** Tidak. Setelah sebuah array dibuat dengan `new`, panjangnya tetap dan tidak bisa diubah. Yang dapat dilakukan adalah mengganti sebuah baris dengan array baru yang berukuran lain (mengubah referensi), tetapi array lama tidak dimodifikasi.
* **Pertanyaan 7:** Jalankan `myNumbers[0] = new int[7];` setelah instansiasi, lalu cetak `myNumbers.length` dan `myNumbers[0].length`. Bagian mana yang berubah? Mengapa?
    * **Jawab:**
        ```java
        myNumbers[0] = new int[7];
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);
        ```
        Output:
        ```
        3
        7
        ```
        `myNumbers.length` tetap 3, sedangkan `myNumbers[0].length` berubah dari 5 menjadi 7. Perintah tersebut tidak mengubah ukuran array lama, tetapi membuat array `int` baru berukuran 7 dan menjadikan baris ke-0 menunjuk ke array baru itu (isinya semua 0). Array luar tetap berisi 3 baris.
* **Pertanyaan Diskusi 1:** Jalankan kode `int[][] salinan = myNumbers; salinan[0][0] = 99; System.out.println(myNumbers[0][0]);`. Mengapa nilai `myNumbers` ikut berubah? Apa perbedaannya dengan menyalin nilai satu per satu menggunakan perulangan?
    * **Jawab:** Kode:
        ```java
        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println(myNumbers[0][0]);
        ```
        Output-nya adalah `99`. Pada `int[][] salinan = myNumbers;` yang disalin hanya referensi (alamat), bukan isi array, sehingga `salinan` dan `myNumbers` menunjuk ke objek array yang sama. Perubahan lewat salah satunya terlihat pada yang lain. Jika disalin satu per satu dengan perulangan ke array baru, maka terbentuk array terpisah di memori sehingga perubahan pada salinan tidak memengaruhi array asli.
* **Pertanyaan Diskusi 2:** Jika Anda ingin menyalin array 2 dimensi secara benar, bagaimana kode penyalinannya? Apakah `clone()` sudah cukup? Coba uji dengan array yang berisi array.
    * **Jawab:** Penyalinan yang benar (*deep copy*) harus menyalin setiap baris:
        ```java
        int[][] salinan = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            salinan[i] = Arrays.copyOf(myNumbers[i], myNumbers[i].length);
        }
        ```
        `clone()` saja belum cukup karena hanya melakukan *shallow copy*: array luar disalin, tetapi baris-barisnya tetap dipakai bersama. Pengujian:
        ```java
        int[][] salinan = myNumbers.clone();
        salinan[0][0] = 99;
        System.out.println(myNumbers[0][0]);   // 99 (ikut berubah)
        ```
        Agar aman, `clone()` harus dipanggil pada tiap barisnya (`salinan[i] = myNumbers[i].clone();`) atau memakai `Arrays.copyOf()` seperti di atas.
---

### 2.4 Percobaan 4: Studi Kasus SIAKAD

Pada percobaan ini dosen menginput nilai tiga mata kuliah (Dasar Pemrograman, Matematika, dan CTPS) untuk 4 mahasiswa ke dalam array 2 dimensi `nilai` (4 baris mahasiswa x 3 kolom mata kuliah). Program menghitung rata-rata per mahasiswa (per baris) dan rata-rata per mata kuliah (per kolom).

#### 2.4.1 Kode Program Java
```java
import java.util.Scanner;

public class SIAKAD27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
        }

        sc.close();
    }
}
```
#### 2.4.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Percobaan 4]()

#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Bagaimana jika jumlah mahasiswa dan jumlah mata kuliah berubah? Modifikasi program SIAKAD agar jumlah mahasiswa dan mata kuliah dapat ditentukan saat program berjalan.
    * **Jawab:** Jumlah mahasiswa dan mata kuliah dibaca dengan `Scanner` terlebih dahulu, lalu array dibuat dengan ukuran tersebut. Semua perulangan memakai `length` sehingga otomatis menyesuaikan:
        ```java
        import java.util.Scanner;

        public class SIAKAD27 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan jumlah mahasiswa: ");
                int jumlahMahasiswa = sc.nextInt();
                System.out.print("Masukkan jumlah mata kuliah: ");
                int jumlahMataKuliah = sc.nextInt();

                int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

                for (int i = 0; i < nilai.length; i++) {
                    System.out.println("Input nilai mahasiswa ke-" + (i + 1));
                    double totalPerSiswa = 0;

                    for (int j = 0; j < nilai[i].length; j++) {
                        System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                        nilai[i][j] = sc.nextInt();
                        totalPerSiswa += nilai[i][j];
                    }

                    System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
                }

                System.out.println("\n========================================");
                System.out.println("Rata-rata nilai setiap mata kuliah:");

                for (int j = 0; j < nilai[0].length; j++) {
                    double totalPerMatkul = 0;

                    for (int i = 0; i < nilai.length; i++) {
                        totalPerMatkul += nilai[i][j];
                    }

                    System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
                }

                sc.close();
            }
        }
        ```
        Contoh output (3 mahasiswa, 2 mata kuliah):
        ```
        Masukkan jumlah mahasiswa: 3
        Masukkan jumlah mata kuliah: 2
        Input nilai mahasiswa ke-1
        Nilai mata kuliah 1: 80
        Nilai mata kuliah 2: 90
        Nilai rata-rata: 85.0
        Input nilai mahasiswa ke-2
        Nilai mata kuliah 1: 70
        Nilai mata kuliah 2: 60
        Nilai rata-rata: 65.0
        Input nilai mahasiswa ke-3
        Nilai mata kuliah 1: 100
        Nilai mata kuliah 2: 80
        Nilai rata-rata: 90.0

        ========================================
        Rata-rata nilai setiap mata kuliah:
        Mata kuliah 1: 83.33333333333333
        Mata kuliah 2: 76.66666666666667
        ```
* **Pertanyaan Diskusi 1:** Pada Kode 20, variabel `totalPerSiswa` dideklarasikan di dalam loop luar. Apa yang terjadi jika deklarasinya dipindah ke luar loop? Jelaskan dengan contoh nilai.
    * **Jawab:** Total tidak di-reset ke 0 untuk setiap mahasiswa, sehingga nilai mahasiswa sebelumnya ikut terakumulasi dan rata-rata menjadi salah. Contoh: mahasiswa 1 bernilai 80, 90, 70 (total 240, rata-rata 80, benar). Mahasiswa 2 bernilai 60, 60, 60: jika `totalPerSiswa` berada di luar loop, totalnya menjadi 240 + 180 = 420 dan rata-ratanya 420 / 3 = 140 (salah, seharusnya 60). Karena itu variabel total harus dideklarasikan (di-reset) di dalam loop luar.
* **Pertanyaan Diskusi 2:** Jika ada nilai yang belum diisi (bernilai 0 secara default), bagaimana pengaruhnya terhadap rata-rata? Diskusikan apakah program perlu membedakan "belum diisi" dari "nilainya 0".
    * **Jawab:** Nilai 0 ikut dihitung sebagai data sehingga rata-rata menjadi lebih rendah dari seharusnya. Contoh: nilai 80, 90, dan satu mata kuliah belum diisi (0) menghasilkan rata-rata 170 / 3 = 56,67, padahal jika hanya dua nilai yang terisi rata-ratanya 85. Program perlu membedakan "belum diisi" dengan "nilainya benar-benar 0" karena maknanya berbeda (mahasiswa mungkin memang mendapat 0, atau nilai belum diinput). Caranya, misalnya dengan memakai tipe `Integer[][]` (belum diisi = `null`) atau nilai penanda seperti -1, lalu hanya menghitung elemen yang sudah terisi dan membagi dengan jumlah elemen terisi tersebut.
---

## 3. TUGAS
### 3.1 Tugas Mandiri: Survei 10 Responden dan 6 Pertanyaan
Program menyimpan hasil survei (10 responden x 6 pertanyaan, jawaban 1 sampai 5) pada array 2 dimensi, lalu menampilkan rata-rata setiap responden, rata-rata setiap pertanyaan, dan rata-rata keseluruhan. Jumlah responden dan pertanyaan disimpan dalam konstanta.

#### 3.1.1 Kode Program Java
```java
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
```
#### 3.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Tugas Mandiri]()

---

## 4. REFLEKSI
* **Pertanyaan 1:** Sebutkan dua situasi nyata yang cocok dimodelkan dengan array 2 dimensi, dan jelaskan apa yang menjadi baris serta kolomnya.
    * **Jawab:**
        * Denah kursi bioskop: baris adalah baris kursi, kolom adalah nomor kursi pada baris tersebut.
        * Tabel nilai mahasiswa (SIAKAD): baris adalah mahasiswa, kolom adalah mata kuliah.
* **Pertanyaan 2:** Apa perbedaan utama antara array 2 dimensi yang persegi dan *jagged array*? Berikan satu contoh penggunaan untuk masing-masing.
    * **Jawab:** Pada array persegi, setiap baris memiliki jumlah kolom yang sama (dibuat dengan `new int[3][4]`). Pada *jagged array*, setiap baris boleh memiliki jumlah kolom berbeda (dibuat dengan `new int[3][]`, lalu tiap baris diinstansiasi sendiri). Contoh array persegi: tabel nilai mahasiswa dengan jumlah mata kuliah yang sama untuk semua mahasiswa. Contoh *jagged array*: data mahasiswa tiap kelas yang jumlah anggotanya berbeda-beda, atau segitiga Pascal.
* **Pertanyaan 3:** Di bagian mana pada jobsheet ini Anda paling sering melakukan kesalahan indeks? Bagaimana cara mencegahnya?
    * **Jawab:** Kesalahan indeks paling sering terjadi pada Percobaan 2, saat mengubah nomor baris/kolom yang dimasukkan pengguna (mulai dari 1) menjadi indeks array (mulai dari 0), yaitu lupa menulis `baris - 1` dan `kolom - 1`, serta salah memakai batas perulangan (`<=` bukan `<`). Cara mencegahnya: selalu memakai `length` sebagai batas perulangan, melakukan validasi rentang sebelum mengakses elemen, dan membedakan dengan jelas antara nomor tampilan untuk pengguna dan indeks di dalam array.
---

## 5. KESIMPULAN
* Array 2 dimensi adalah array yang setiap elemennya berupa array, diakses dengan indeks baris dan kolom (`array[i][j]`) yang dimulai dari 0.
* `array.length` menyatakan jumlah baris, sedangkan `array[i].length` menyatakan jumlah kolom pada baris ke-i.
* Elemen array yang belum diisi bernilai default sesuai tipenya, yaitu `null` untuk `String` dan `0` untuk `int`.
* Nested loop (`for` maupun `foreach`) digunakan untuk memproses seluruh elemen array 2 dimensi, dan penggunaan `length` membuat program tidak bergantung pada ukuran tetap.
* *Jagged array* memungkinkan setiap baris memiliki panjang berbeda, tetapi ukuran array tidak dapat diubah setelah dibuat.
* Menyalin array 2 dimensi dengan `=` atau `clone()` hanya menyalin referensi/baris secara dangkal, sehingga diperlukan penyalinan per baris (*deep copy*).
* Rata-rata per baris dan per kolom dapat dihitung dengan nested loop, dengan memperhatikan posisi reset variabel total.