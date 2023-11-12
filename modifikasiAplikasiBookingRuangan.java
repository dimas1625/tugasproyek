import java.util.Scanner;

public class modifikasiAplikasiBookingRuangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input login
        System.out.println("======= Login di Aplikasi Booking Ruangan =======\n");

        String username = "admin1";
        String password = "admin";
        Boolean loginApk = false;

        do {
            System.out.print("Masukan Username Anda : ");
            String usernameIn = sc.next();
            System.out.print("Masukan Password Anda : ");
            String passwordIn = sc.next();

            if (usernameIn.equals(username) && passwordIn.equals(password)) {
                loginApk = true;
            } else {
                System.out.println("\n======= Username atau Password yang anda masukan salah =======");
                System.out.println("======= Silahkan Masukan Username dan Password anda kembali =======\n");
            }
        } while (!loginApk);

        System.out.println("\nLogin Berhasil");
        System.out.println("Selamat Datang " + username + " di Aplikasi Booking Ruangan");

    }
} 