import java.util.Scanner;
public class Pemilihan2Percobaan2no24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
         byte pilihan_menu;
        String member;
        double diskon,harga,totalBayar;

        System.out.println("-----------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextByte();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.next();
        System.out.println("-----------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon= 10% ");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
                
            }else if (pilihan_menu == 3 ) {
                harga = 15000;
                System.out.println("Harga bundling= " + harga);
                
            } else {
                System.out.println("Masukkan menu yang benar");
                return;
            }

            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = Rp" + totalBayar);


            
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
                
            }else if (pilihan_menu == 3 ) {
                harga = 15000;
                System.out.println("Harga bundling= " + harga);
                
            } else {
                System.out.println("Masukkan menu yang benar");
                return;
            }

        
            System.out.println("Total bayar  = Rp" + harga);

            
        } else {
            System.out.println(" Member tidak valid ");
        }
        System.out.println("-------------------------------------");
    }
}
