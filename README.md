# JOBSHEET14
## Percobaan 1
### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

### Jawaban
1. Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri di dalam fungsi tersebut
2. Ya sama, Baik fungsi faktorialRekursIf(5) maupun faktorialIteratIf(5) akan menghasilkan nilai 120
- Alur Fungsi Rekursif
    1. Panggil f(5): Masuk blok else. Menunggu hasil `5 x f(4)`
    2. Panggil f(4): Masuk blok else. Menunggu hasil `4 x f(3)`
    3. Panggil f(3): Masuk blok else. Menunggu hasil `3 x f(2)`
    4. Panggil f(2): Masuk blok else. Menunggu hasil `2 x f(1)`
    5. Panggil f(1): Masuk blok else. Menunggu hasil `1 x f(0)`
    6. Panggil f(0): Masuk blok `if (n==0)`. Base Case tercapai! Mengembalikan nilai `1`
    7. Backtracking (Mundur ke atas):
        - f(1) selesai: 1 x 1 = 1
        - f(2) selesai: 2 x 1 = 2
        - f(3) selesai: 3 x 2 = 6
        - f(4) selesai: 4 x 6 = 24
        - f(5) selesai: 5 x 24 = 120

- Alur Fungsi Iteratif
    1. Inisialisasi variabel faktor = 1
    2. Loop dimulai (i = 5): faktor diupdate menjadi 1 x 5 = 5
    3. Loop lanjut (i = 4): faktor diupdate menjadi 5 x 4 = 20
    4. Loop lanjut (i = 3): faktor diupdate menjadi 20 x 3 = 60
    5. Loop lanjut (i = 2): faktor diupdate menjadi 60 x 2 = 120
    6. Loop lanjut (i = 1): faktor diupdate menjadi 120 x 1 = 120
    7. Loop selesai (karena $i$ sudah kurang dari 1)
    8. Mengembalikan nilai faktor (120) sebagai hasil akhir.

## Percobaan 2
### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

### Jawaban
1. Proses pemanggilan fungsi rekursif `hitungPangkat()` akan terus dijalankan sampai parameter `y` (pangkat) bernilai `0`.
2. 
``` java
import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat (int x, int y) {
        if (y ==0) {
            System.out.print("1");
            return (1);
        } else {
            System.out.print(x + "x");
            return (x* hitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.println("=" + hitungPangkat(bilangan, pangkat));
    }
}
```

## Percobaan 3
### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)

### Jawaban
1. - Base case
    ``` java
    if (tahun == 0) {
    return saldo;
    }
    ```
   - Recursion call
   ``` java
   return 1.11 * hitungLaba(saldo, tahun - 1);
   ```
2. - Fase Ekspansi
    ``` java
    1. Panggilan 1 hitunglaba (100000,3)
       = 1.11 * hitungLaba(100000, 2)
    2. Panggilan 2 hitunglaba (100000,2)
       = 1.11 * hitungLaba(100000, 1)
    3. Panggilan 3 hitunglaba (100000,1)
       = 1.11 * hitungLaba(100000, 0)
    4. Panggilan 4 hitunglaba (100000,0)
       = Mengembalikan nilai saldo yaitu 100000
       ```
   - Fase Substitusi
    ``` java
    1. Kembali ke Panggilan 3 (tahun=1):
       = 1.11 x 100000 = 111000
    1. Kembali ke Panggilan 2 (tahun=2):
       = 1.11 x 111000 = 123210 
    1. Kembali ke Panggilan 1 (tahun=3):
       = 1.11 x 123210 = 136763.1
       ```
   - Hasil akhir
        ``` java
        Nilai akhir dari hitungLaba(100000, 3) adalah 136763.1
        ```