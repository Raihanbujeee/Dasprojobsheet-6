import java.util.Scanner;
public class DiskonBuku24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku (Kamus/Novel/Buku Lain): ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();

        if (jenisBuku.equalsIgnoreCase("Kamus") && jumlahBuku >= 2) {
            diskon = 12;
            System.out.println("Diskon 12%");
        } else if (jenisBuku.equalsIgnoreCase("Kamus") && jumlahBuku < 2) {
            diskon = 10;
            System.out.println("Diskon 10%");
        } else if (jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku > 3) {
            diskon = 9;
            System.out.println("Diskon 9%");
        } else if (jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku <= 3) {
            diskon = 8;
            System.out.println("Diskon 8%");
        } else if (jenisBuku.equalsIgnoreCase("Buku lain") && jumlahBuku >= 3) {
            diskon = 5;
            System.out.println("Diskon 5%");
        } else if (jenisBuku.equalsIgnoreCase("Buku lain") && jumlahBuku < 3) {
            diskon = 0;
            System.out.println("Diskon 0%");
        } else {
            System.out.println("Jenis buku tidak valid!");
        }

        System.out.println("Diskon yang diperoleh: " + diskon + "%");
    }
}
