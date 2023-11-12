import java.util.Scanner;

public class Checkout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkoutConfirmed = false;

        while (true) {
            System.out.println("\n======= Checkout dari ruangan =======");
            System.out.print("Apakah Anda Yakin Ingin Checkout (y/t)?: ");
            String checkOut = sc.next();

            if (checkOut.equalsIgnoreCase("y")) {
                System.out.println("Anda Telah Mengkonfirmasi Checkout");
                checkoutConfirmed = true;
                break;
            } else if (checkOut.equalsIgnoreCase("t")) {
                System.out.println("Anda Tidak Jadi Checkout");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan masukkan 'y' atau 't'.");
            }
        }

        if (checkoutConfirmed) {
            System.out.println("Silahkan untuk Mengisi Waktu Checkout: ");
            int checkoutTime = sc.nextInt();

            if (checkoutTime <= 12) {
                System.out.println("AM");
            } else if (checkoutTime <= 24) {
                System.out.println("PM");
            } else {
                System.out.println("Waktu yang Anda Masukkan Salah!");
            }
        }
    }
}
