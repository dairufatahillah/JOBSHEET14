public class percobaan1 {
    static int faktorialRekursIf(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursIf(n -1));
        }
    }

    static int faktorialIteratIf(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekursIf(5));
        System.out.println(faktorialIteratIf(5));
    }
}