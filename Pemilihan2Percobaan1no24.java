// import java.util.Scanner;
// public class Pemilihan2Percobaan1no24 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int tahun;

//         System.out.println("masukkan tahun:");
//         tahun = input.nextInt();
//         if ((tahun % 4 ) == 0) {
//             if ((tahun % 100) !=0)
//             System.out.println("tahun kabisat"); 
                
//         } else
//         System.out.println("bukan tahun kabisat");
//          {
            
//         } 
            
//         }
//     }

// import java.util.Scanner;
// public class Pemilihan2Percobaan1no24 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int tahun;

//         System.out.print("masukkan tahun:");
//         tahun = input.nextInt();

//         if (tahun % 4 == 0) {
//             if (tahun % 100 == 0) {
//                 if (tahun % 400 == 0) {
//                     System.out.println("tahun kabisat");
//                 } else {
//                     System.out.println("bukan tahun kabisat");
//                 }
//             } else {
//                 System.out.println("tahun kabisat");
//             }
//         } else {
//             System.out.println("bukan tahun kabisat");
//         }
//     }
// }

import java.util.Scanner;

public class Pemilihan2Percobaan1no24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan tahun:");
        tahun = input.nextInt();

        if (tahun % 4 == 0) {            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) { 
                    System.out.println("Tahun kabisat");
                } else { 
                    System.out.println("Bukan tahun kabisat");
                }
            } else { 
                System.out.println("Tahun kabisat");
            }
        } else { 
            System.out.println("Bukan tahun kabisat");
        }
    }
}

