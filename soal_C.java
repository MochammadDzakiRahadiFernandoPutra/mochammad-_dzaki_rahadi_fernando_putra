import java.util.Scanner;
public class soal_C{
    public static void main(String args[]){
        int nilai_barang;
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa nilai barang: ");
        nilai_barang = input.nextInt();

        while (nilai_barang >= 0) {
        if (nilai_barang > 0) {
            System.out.println("Total: "+ nilai_barang);
            System.out.println("Berapa nilai barang: ");
            nilai_barang = input.nextInt();
        }
        // else {
        //     System.out.println("Total: "+nilai_barang);
        // }
        nilai_barang = nilai_barang + nilai_barang;
        }
    }
}