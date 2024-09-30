import java.util.Scanner;

public class soal_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah artikel
        System.out.print("Masukkan jumlah artikel: ");
        int jumlahArtikel = scanner.nextInt();

        int totalKata = 0;

        // Meminta input jumlah kata untuk setiap artikel
        for (int i = 1; i < jumlahArtikel + 1; i++) {
            System.out.print("Masukkan jumlah kata untuk artikel ke-" + i + ": ");
            int jumlahKata = scanner.nextInt();
            totalKata += jumlahKata;
        }

        // Menghitung rata-rata kata per artikel
        double rataRataKata = (double) totalKata / jumlahArtikel;

        // Menampilkan hasil
        System.out.println("Total kata yang ditulis: " + totalKata);
        System.out.println("Rata-rata kata per artikel: " + rataRataKata);

        scanner.close();
    }
}