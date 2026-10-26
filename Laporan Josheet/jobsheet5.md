# JOBSHEET 5 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** Subhan Akbar Mashuri
* **NIM:** 264107020214
* **Kelas / No. Presensi:** TI-1D / 27

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks
pemilihan bersarang
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Jawa
3. Mahasiswa mampu menerapkan operator logika &&, ||, dan ! pada struktur pemilihan

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi


#### 2.1.1 Kode Program Java

Percobaan ini membuat program yang memeriksa syarat mendaftar ujian skripsi secara bertahap. Syarat pertama adalah bebas kompen. Jika terpenuhi, program memeriksa syarat kedua, yaitu log bimbingan minimal 8 kali dengan pembimbing 1 dan 4 kali dengan pembimbing 2. Jika gagal, program menampilkan alasan kegagalannya. Konsep yang dipelajari adalah Nested IF.

```java
import java.util.Scanner;

public class nestedUjianSkripsi27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output

![Output (ya, 6, 5)](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/444c3595833c602259e3ae24fdc2c9cc13b7f458/screenshot/Jobsheet%205/Screenshot%202026-10-03%20174756.png)



#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
  * **Jawab:** Program menampilkan `Gagal! Mahasiswa masih memiliki tanggungan kompen`. Kondisi `bebasKompen.equalsIgnoreCase("Ya")` bernilai `false` karena "No" tidak sama dengan "Ya" (huruf besar/kecil diabaikan, tetapi hurufnya tetap harus sama). Program masuk ke `else` luar, sehingga IF bersarang yang mengecek log bimbingan tidak dijalankan. Jawaban apa pun selain "Ya" dianggap belum bebas kompen.

* **Pertanyaan 2:** Jelaskan maksud dari potongan kode berikut!
   if (bimbimganP1 >= 8 && bimbinganP2 >=4 ) {
  * **Jawab:** Kondisi bernilai `true` hanya jika kedua syarat terpenuhi: bimbingan dengan pembimbing 1 minimal 8 kali **dan** bimbingan dengan pembimbing 2 minimal 4 kali. Jika salah satunya tidak terpenuhi, hasilnya `false`.

* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!
  * **Jawab:**
        1. Cek kompen. Jika bukan "Ya": gagal karena masih ada tanggungan kompen.
        2. Jika "Ya", cek log bimbingan:
            - P1 >= 8 dan P2 >= 4: semua syarat terpenuhi.
            - P1 < 8 dan P2 < 4: kedua log kurang.
            - P1 < 8: hanya P1 kurang.
            - Selain itu: hanya P2 kurang.
        3. Tampilkan pesan hasil.

---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus


#### 2.2.1 Kode Progam Java

Percobaan ini membuat program yang menentukan akses WiFi kampus. Akses diberikan jika pengguna adalah mahasiswa atau dosen, dan akunnya tidak diblokir. Konsep yang dipelajari adalah operator logika `||` (OR), `&&` (AND), dan `!` (NOT), termasuk short-circuit evaluation.

```java
import java.util.Scanner;

public class operatorLogikaWifi27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
        sc.close();
    }
}
```

#### 2.2.2 Hasil Running / Screenshot Output

| Uji | mahasiswa | dosen | akunDiblokir | Hasil |
|---|---|---|---|---|
| 1 | true | false | false | Akses WiFi diberikan |
| 2 | false | true | false | Akses WiFi diberikan |
| 3 | true | false | true | Akses WiFi ditolak |
| 4 | false | false | false | Akses WiFi ditolak |

![Uji 1](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/aa07f3fe46cc870886c5fae63a211530803f96d4/screenshot/Jobsheet%205/Screenshot%202026-10-03%20205020.png)

![Uji 2](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/3224e78e95b275885ea4cd7694faf83d6e03a0a5/screenshot/Jobsheet%205/Screenshot%202026-10-03%20205117.png)

![Uji 3](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/d10e28b3264a73386911373210d128d9b4d3d648/screenshot/Jobsheet%205/Screenshot%202026-10-03%20205150.png)

![Uji 4](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/5a30ff6d7248e51dc5ca02e7d409fc940d0f1be9/screenshot/Jobsheet%205/Screenshot%202026-10-03%20205224.png)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Jelaskan fungsi operator ||, &&, dan ! pada kondisi program tersebut.
  * **Jawab:** 
            - `||` (OR): `true` jika minimal salah satu benar. Pengguna cukup berstatus mahasiswa **atau** dosen.
            - `&&` (AND): `true` jika semua benar. Syarat "mahasiswa atau dosen" **dan** "tidak diblokir" harus sama-sama terpenuhi.
            - `!` (NOT): membalik nilai boolean. `!akunDiblokir` bernilai `true` ketika akun **tidak** diblokir.

* **Pertanyaan 2:** Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai mahasiswa = false?
  * **Jawab:** Karena `(mahasiswa || dosen)` dengan `false || true` menghasilkan `true`. Operator `||` hanya butuh salah satu operand bernilai `true`. Selama akun tidak diblokir (`!false` = `true`), kondisi akhir `true && true` = `true`, sehingga akses diberikan.

* **Pertanyaan 3:** Ubah operator || menjadi &&. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?
  * **Jawab:** Keduanya **ditolak**. Dengan `&&`, pengguna harus menjadi mahasiswa **dan** dosen sekaligus, yang tidak terpenuhi pada uji 1 maupun uji 2.

* **Pertanyaan 4:** Pada ekspresi mahasiswa || dosen, kapan kondisi dosen tidak perlu dievaluasi? Jelaskan berdasarkan short-circuit evaluation.
  *  **Jawab:** Saat `mahasiswa = true`. Pada OR, jika operand kiri sudah `true`, hasil keseluruhan pasti `true` apa pun nilai `dosen`, sehingga Java melewati evaluasi operand kanan (short-circuit evaluation).
  
* **Pertanyaan 5:** Pada ekspresi (mahasiswa || dosen) && !akunDiblokir, kapan kondisi !akunDiblokir tidak perlu dievaluasi? Jelaskan.
  * **Jawab:** Saat `(mahasiswa || dosen)` bernilai `false`, yaitu `mahasiswa = false` dan `dosen = false` (uji 4). Operator `&&` juga menerapkan short-circuit: jika operand kiri `false`, hasil pasti `false`, sehingga `!akunDiblokir` dilewati. Jika operand kiri `true`, barulah `!akunDiblokir` dievaluasi.

---

### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratoriuim

#### 2.3.1 Kode Progam Java

Percobaan ini menggabungkan Nested IF dengan operator logika untuk menentukan akses laboratorium di luar jadwal kuliah. Tahap pertama memeriksa mahasiswa aktif dan tidak sedang disanksi. Tahap kedua memeriksa apakah mahasiswa punya izin dosen atau merupakan asisten lab. Tiap tahap punya pesan penolakan sendiri.

```java
import java.util.Scanner;

public class nestedAksesLab27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan ");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
        sc.close(); 
    }
}
```    


#### 2.3.2 Hasil Running / Screenshot Output

![Contoh Gambar Output Percobaan 1](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/9ae056cfafecd8df38a1802f50c04bd59b92c2d0/screenshot/Jobsheet%205/Screenshot%202026-10-04%20122510.png)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Mengapa pemeriksaan punyaIzinDosen || asistenLab ditempatkan di dalam IF pertama?
  * **Jawab:** Karena itu adalah pemeriksaan tahap kedua yang bergantung pada tahap pertama. Izin dosen atau status asisten hanya perlu dicek jika mahasiswa sudah aktif dan tidak disanksi. Di dalam IF pertama, pemeriksaan ini hanya dijalankan bila kondisi pertama `true`; bila `false`, program langsung menolak tanpa memeriksanya.
* **Pertanyaan 2:** Jelaskan fungsi operator &&, ||, dan ! pada program tersebut.
  * **Jawab:** 
          - `&&` pada `mahasiswaAktif && !sedangDisanksi`: kedua syarat dasar wajib terpenuhi.
          - `!` pada `!sedangDisanksi`: membalik nilai sehingga `true` bila mahasiswa **tidak** sedang disanksi.
          - `||` pada `punyaIzinDosen || asistenLab`: cukup salah satu terpenuhi agar akses diberikan.
* **Pertanyaan 3:** Apakah syarat akses dapat ditulis menjadi satu kondisi: mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)? Jelaskan apakah keputusan akses akhirnya sama.
  * **Jawab:** Bisa, dan keputusan akhir akses **sama**: akses diberikan hanya jika mahasiswa aktif, tidak disanksi, dan punya izin dosen atau berstatus asisten. Bedanya, dengan satu kondisi program hanya memiliki satu `else`, sehingga tidak dapat membedakan alasan penolakan.
* **Pertanyaan 4:** Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika sistem perlu menampilkan alasan penolakan yang berbeda?
  * **Jawab:** 
          - Dapat menampilkan alasan penolakan yang spesifik di tiap tahap.
          - Alur mengikuti urutan logika sehingga lebih mudah dibaca dan dilacak.
          - Pemeriksaan tahap berikutnya dilewati jika tahap awal gagal.
          - Lebih mudah dikembangkan, misalnya menambah syarat atau pesan baru.
* **Pertanyaan 5:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua.
  * **Jawab:** -
- **Level 1:** aktif = `false`, disanksi = `false`, izin = `true`, asisten = `true`.
- **Level 2:** aktif = `true`, disanksi = `false`, izin = `false`, asisten = `false`.

![Penolakan level 1](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/e39e808e9aa44508fb4be1965dc2a5055abab428/screenshot/Jobsheet%205/Screenshot%202026-10-04%20122831.png)

![Penolakan level 2](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/e0d9f6304d0a46be1e13538c654059149dc814a0/screenshot/Jobsheet%205/Screenshot%202026-10-04%20123049.png)


---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Implementasikan flowchart yang telah Anda buat pada Latihan 2 Pertemuan 6 terkait sistem diskon toko buku ke dalam program Java. Program wajib menerapkan struktur pemilihan bersarang (Nested IF). Gunakan operator logika apabila diperlukan.
- [x] **Tugas 2:** Buatlah program Java untuk sistem seleksi calon asisten praktikum berdasarkan
ketentuan berikut:
* Mahasiswa dapat mengikuti seleksi apabila berstatus aktif dan tidak sedang mendapatkan sanksi akademik.
* Jika syarat tersebut terpenuhi, mahasiswa harus memenuhi syarat berikutnya yaitu nilai Dasar Pemrograman minimal 80 atau memiliki sertifikat kompetensi
pemrograman.
* Jika lolos 2 syarat tersebut, mahasiswa akan dipanggil untuk mengikuti wawancara. Mahasiswa diterima sebagai asisten apabila nilai wawancara minimal 75.
* Program harus menampilkan alasan apabila mahasiswa gagal pada setiap tahap seleksi.
* Gunakan pemilihan bersarang dan operator logika. Simpan file dengan nama tugas2SeleksiAsistenNoPresensi.java


### 3.1 Implementasi Kode Tugas

```java
//Tugas 1
import java.util.Scanner;

public class TokoBuku23 {
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
```


```java
//Tugas 2
import java.util.Scanner;

public class AsistenPratikum23 {
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
```
#### 3.1.1 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:
Tugas 1
![Tugas 1](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/58b80f94533475084370a420d6a16bea40566ece/screenshot/Jobsheet%205/Screenshot%202026-10-06%20201742.png)
Tugas 2
![Tugas 2](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/066e5d522e5d83bc580cec630c0e53cb354e6cc5/screenshot/Jobsheet%205/Screenshot%202026-10-06%20201826.png)
![Tugas 2](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/0306e65a7ec85ccd8c176c63eeeb3c089de33107/screenshot/Jobsheet%205/Screenshot%202026-10-06%20201859.png)
![Tugas 2](https://github.com/subhanakbarmashuri23-glitch/Praktek-Dasar-Pemograman/blob/15f21c0cb270b1ba7a15db70579cdf2662f4e7b9/screenshot/Jobsheet%205/Screenshot%202026-10-06%20201921.png)


---

## 4: KESIMPULAN

Nested IF dipakai untuk syarat bertingkat, di mana syarat berikutnya hanya diperiksa jika syarat sebelumnya terpenuhi, sehingga program bisa menampilkan alasan kegagalan yang spesifik di tiap tahap. Operator logika &&, ||, dan ! menggabungkan beberapa kondisi menjadi satu keputusan, dan pemilihan operator yang salah mengubah hasil program secara total. Short-circuit evaluation membuat Java melewati pengecekan kondisi yang tidak lagi memengaruhi hasil, sehingga program lebih efisien. Dengan demikian, mahasiswa mampu menyelesaikan studi kasus dengan pemilihan bersarang dan operator logika dalam program Java.
