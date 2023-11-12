import java.util.ArrayList;
import java.util.Scanner;

public class ModifikasiFiturListBooking {

    static ArrayList<String> fasilitasRuangan = new ArrayList<>();

    static void listBooking() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n==================================================");
        System.out.println("=                 List Booking                   =");
        System.out.println("==================================================\n");

        // Inisialisasi fasilitasRuangan dengan nilai-nilai baru
        fasilitasRuangan.add("Fasilitas 1A");
        fasilitasRuangan.add("Fasilitas 1B");
        fasilitasRuangan.add("Fasilitas 1C");
        fasilitasRuangan.add("Fasilitas 2A");
        fasilitasRuangan.add("Fasilitas 2B");
        fasilitasRuangan.add("Fasilitas 2C");
        fasilitasRuangan.add("Fasilitas 3A");
        fasilitasRuangan.add("Fasilitas 3B");
        fasilitasRuangan.add("Fasilitas 3C");

        System.out.println("List Ruangan yang Tersedia Hari Ini\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ruangan " + (i + 1));
        }

        int ruang;
        while (true) {
            System.out.print("Silahkan Masukkan Pilihan Ruangan (1/2/3): ");
            ruang = sc.nextInt();
            if (ruang >= 1 && ruang <= 3) {
                break;
            } else {
                System.out.println("\nRuang yang anda pilih tidak valid, silahkan masukan kembali!");
            }
        }

        System.out.println("\n==================================================");
        System.out.println("=           Detail fasilitas ruangan             =");
        System.out.println("==================================================\n");
        System.out.print("Apakah Anda Ingin Melihat Detail Fasilitas Ruangan " + ruang + " (y/t)?: ");
        String detail = sc.next();

        if (detail.equalsIgnoreCase("y")) {
            System.out.println("\nIni Adalah Detail dari Ruangan " + ruang + ".");
            System.out.println("\nDetail Fasilitas Ruangan " + ruang + ": ");
            for (String fasilitas : fasilitasRuangan.subList((ruang - 1) * 3, ruang * 3)) {
                System.out.println(fasilitas);
            }
        } else {
            System.out.println("\nAnda Memilih Untuk Tidak Melihat Detail\n");
        }

        // Tambahkan fitur pemesanan ruangan
        System.out.print("\nApakah Anda Ingin Memesan Ruangan " + ruang + " (y/t)?: ");
        String pesan = sc.next();
        if (pesan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan Nama Pemesan: ");
            String namaPemesan = sc.next();
            System.out.print("Masukkan Waktu Pemesanan: ");
            String waktuPemesanan = sc.next();
            System.out.println("Pemesanan Ruangan " + ruang + " oleh " + namaPemesan + " pada pukul " + waktuPemesanan + " berhasil!");

            System.out.println("\n==================================================");
            System.out.println("=                  System out                    =");
            System.out.println("==================================================\n");
        }
    }
    public static void main(String[] args) {
        listBooking();
    }
}
