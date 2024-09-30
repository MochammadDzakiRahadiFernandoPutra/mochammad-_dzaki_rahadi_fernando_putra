import java.util.Scanner;

public class soal_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalbuah = 0;
        int hari = 5;

        // Loop to input the number of fruits sold each day
        for (int i = 1; i <= hari; i++) {
            System.out.print("Masukkan Angka berapa buah yang terjual pada hari " + i + ": ");
            int buahterjual = scanner.nextInt();
            totalbuah += buahterjual;
        }

        // Calculate average fruits sold per day
        double rataratabuah = (double) totalbuah / hari;

        // Print the total and average
        System.out.println("Total buah yang terjual pada 5 hari: " + totalbuah);
        System.out.println("Rata rata buah terjual setiap hari: " + rataratabuah);

        scanner.close();
    }
}