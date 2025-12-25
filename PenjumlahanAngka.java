import java.util.Scanner;

public class PenjumlahanAngka {
    static int hitungRekursif(int n, Scanner sc) {
        if (n == 0) {
            return 0;
        }
        System.out.print("Masukkan angka ke-" + n + ": ");
        int angka = sc.nextInt();
        return angka + hitungRekursif(n - 1, sc);
    }

    static int hitungIteratif(int n, Scanner sc) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total = total + angka; 
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int jumlahN = sc.nextInt();
        int totalRekursif = hitungRekursif(jumlahN, sc);
        System.out.println("Total dari " + jumlahN + " angka yang dimasukkan adalah: " + totalRekursif);
    }
}