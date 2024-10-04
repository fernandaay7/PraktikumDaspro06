
import java.util.Scanner;

/**
 * Pemilihan1Percobaan108
 */
public class Pemilihan1Percobaan108 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        String member;
        int pilihan_menu;
        double total_bayar, diskon, harga;

        System.out.println("------------------------");
        System.out.println("===== Menu KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + ice tea )");
        System.out.println("--------------------------------------");
        System.out.println(" Masukkan angka dari menu yang dipilih = ");

        pilihan_menu = input08.nextInt();
        input08.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input08.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " +harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah 

            }
            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) {// Menggunakan equalsignoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl =" + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika piluhan salah

            }
            // Menghitung total bayar 
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("----------------------------------");
    }
}
