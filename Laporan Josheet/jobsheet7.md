# JOBSHEET 7 - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** Subhan Akbar Mashuri
* **NIM:** 264107020214
* **Kelas / No. Presensi:** TI-1D / 27

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while,
dan do-while)
2. Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan
bahasa pemrograman Java 

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR
Program meminta 10 nilai kuis mahasiswa, lalu menampilkan nilai tertinggi dan terendah. Dipakai `for` karena jumlah perulangan sudah pasti.

#### 2.1.1 Kode Program Java

```java
import java.util.Scanner;

public class SiakadFor27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        
            for (int i = 1; i <= 10; i++) {
                System.out.println("Masukan nilai mahasiswa ke-" + i + ": ");
                nilai = sc.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;                    
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
            }

            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);

            sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output

![Output (ya, 6, 5)]



#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
  * **Jawab:** 
  - Inisialisasi: `int i = 1`
  - Kondisi: `i <= 10`
  - Update: `i++`

* **Pertanyaan 2:** Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
  * **Jawab:** 
Agar nilai pertama yang dimasukkan (rentang 0–100) pasti bisa menggantikan nilai awal. Jika dibalik, `nilai > 100` dan `nilai < 0` tidak pernah terpenuhi, sehingga hasil selalu salah (tertinggi tetap 100, terendah tetap 0).

* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode berikut!
 ```java
if (nilai > tertinggi) {
    tertinggi = nilai;                    
}
if (nilai < terendah) {
    terendah = nilai;
}
 ```
  * **Jawab:**
    Mencari nilai maksimum dan minimum: jika nilai lebih besar dari tertinggi, tertinggi diganti; jika nilai lebih kecil dari terendah, terendah diganti. Dicek pada setiap putaran.

* **Pertanyaan 4:** Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!
  * **Jawab:**
        

---

### 2.2 Percobaan 2:  Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan WHILE
Program menerima jumlah mahasiswa, lalu meminta nilai tiap mahasiswa. Nilai di luar 0–100 ditolak dan diminta ulang, nilai valid dikelompokkan ke huruf A sampai E. Dipakai `while` karena jumlah perulangan ditentukan input pengguna.

#### 2.2.1 Kode Progam Java

```java
import java.util.Scanner;

public class SiakadWhile27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nilai, jumlah, i = 0;

        System.out.print("Masukan jumlah mahasiswa: ");
        jumlah = sc.nextInt();

        while (i < jumlah) {
            
            i++;
        }
        while (i < jumlah) {
            System.out.println("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E ");
            }
            i++;
            sc.close();    
            }
        }
    }
```

#### 2.2.2 Hasil Running / Screenshot Output


![Uji 1]


#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
  
 ```java
  if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid!");
    continue;
  }
 ```

 a. nilai < 0 || nilai > 100
 b. continue
  * **Jawab:** 
    * a. Operator OR: bernilai `true` jika nilai negatif atau lebih dari 100, dipakai untuk memvalidasi input.
    * b. Melewati sisa perintah di putaran itu dan kembali ke pengecekan kondisi `while`, sehingga input diulang tanpa menaikkan `i`.

* **Pertanyaan 2:** Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?
  * **Jawab:** Agar `i` hanya bertambah setelah nilai valid diproses. Jika di awal, nomor mahasiswa yang tampil bergeser dan input tidak valid tetap dihitung sehingga ada mahasiswa yang terlewat.

* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
  * **Jawab:** 19 kali jika semua input valid. Setiap input tidak valid menambah satu putaran.

* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
  *  **Jawab:** 
  


---

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe – Perulangan DO-WHILE
Kasir kafe memasukkan nama pelanggan dan jumlah kopi (Rp 12.000), teh (Rp 7.000), dan roti (Rp 20.000), lalu program menghitung total bayar. Mengetik "batal" menghentikan program dengan `break`. Dipakai `do-while` karena input dijalankan minimal sekali.

#### 2.3.1 Kode Progam Java

```java
import java.util.Scanner;

public class KafeDoWhile27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketika 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
```    


#### 2.3.2 Hasil Running / Screenshot Output

![Contoh Gambar Output Percobaan 1]

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
  * **Jawab:** 1 kali, karena `do-while` mengeksekusi isi perulangan dulu sebelum mengecek kondisi.
* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
  * **Jawab:** `namaPelanggan.equalsIgnoreCase("batal")`, yang memicu `break`.
* **Pertanyaan 3:** Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
  * **Jawab:** Membuat perulangan berjalan terus (tak terbatas) sampai dihentikan oleh `break`.
* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?
  * **Jawab:** Karena kondisinya konstanta `true`, bukan bergantung pada variabel penghitung. Penghentiannya ditentukan oleh input dan `break`.
          

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Seorang pengelola bioskop ingin membuat program untuk menghitung total penjualan
tiket dalam satu hari. Tiket dijual dengan harga Rp 50.000 per tiket. Program harus
menghitung total tiket yang terjual dan total harga penjualan tiket selama satu hari
dengan ketentuan sebagai berikut:
• Jika pelanggan membeli lebih dari 4 tiket, pelanggan mendapatkan diskon 10%.
• Jika pelanggan membeli lebih dari 10 tiket, pelanggan mendapatkan diskon 15%.
• Jika input jumlah tiket tidak valid (negatif), program akan mengabaikan input
tersebut dan meminta input ulang.
- [x] **Tugas 2:** Sebuah tempat parkir ingin membuat program untuk menghitung total
pembayaran parkir dari beberapa kendaraan. Tarif parkir adalah Rp 3.000 per jam
untuk mobil dan Rp 2.000 per jam untuk motor. Program akan terus meminta
masukan selama input bukan 0. Implementasikan flowchart tersebut ke dalam
bentuk kode program Java!


### 3.1 Implementasi Kode Tugas

```java
//Tugas 1
import java.util.Scanner;

public class Bioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0; 
        double totalHarga = 0, diskon = 0;

        while (true) {
            System.out.print("Jumlah tiket yang di beli: ");
            int jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }
            if (jumlah == 0) {
                break;    
            }
            if (jumlah > 4) {
                diskon = 0.1;
            }
            if (jumlah > 10) {
                diskon = 0.15;
            } else {
                diskon = 0;
            }

            double totalBayar = jumlah * hargaTiket * (1-diskon);

            totalTiket += jumlah;
            totalHarga += totalBayar;

            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total harga: Rp." + totalHarga);

            
        }

    }
}       
```


```java
//Tugas 2
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
```
#### 3.1.1 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:
Tugas 1
![Tugas 1]
Tugas 2
![Tugas 2]

---

## 4: KESIMPULAN
- `for` cocok untuk jumlah perulangan yang sudah pasti.
- `while` cocok untuk jumlah perulangan yang bergantung input, dan kondisinya dicek di awal.
- `do-while` cocok jika isi perulangan harus berjalan minimal sekali.
- `break` menghentikan perulangan, `continue` melewati sisa putaran saat ini.
- Nilai awal variabel dan posisi `i++` sangat memengaruhi hasil program.

