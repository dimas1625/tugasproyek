import java.util.Scanner;

public class FiturListBookingBeta {

    static void listBooking() {

        Scanner sc = new Scanner(System.in);

        String fasilitasRuangan[][] = new String[3][3];

        int ruang = 0;
        boolean isListBooking = false;
        while (!isListBooking) {

            System.out.println("\n==================================================");
            System.out.println("=                 List Booking                   =");
            System.out.println("==================================================\n");

            System.out.println("List Ruangan yang Tersedia Hari Ini\n");
            System.out.println("Ruangan 1 ");
            System.out.println("Ruangan 2");
            System.out.println("Ruangan 3");
            System.out.print("Silahkan Masukkan Pilihan Ruangan (1/2/3): ");
            ruang = sc.nextInt();

            if (ruang > 3 || ruang < 1) {
                System.out.println("\nRuang yang anda pilih tidak valid, silahkan masukan kembali!");
            } else {
                isListBooking = true;
            }
        }

        // Inisialisasi fasilitasRuangan dengan nilai-nilai baru
        fasilitasRuangan = new String[][] {
                { "Fasilitas 1A", "Fasilitas 1B", "Fasilitas 1C" },
                { "Fasilitas 2A", "Fasilitas 2B", "Fasilitas 2C" },
                { "Fasilitas 3A", "Fasilitas 3B", "Fasilitas 3C" }
        };

        System.out.println("\n==================================================");
        System.out.println("=           Detail fasilitas ruangan             =");
        System.out.println("==================================================\n");
        System.out.print("Apakah Anda Ingin Melihat Detail Fasilitas Ruangan " + ruang + " (y/t)?: ");
        String detail = sc.next();

        if (detail.equalsIgnoreCase("y")) {
            if (ruang >= 1 && ruang <= 3) {
                System.out.println("\nIni Adalah Detail dari Ruangan " + ruang + ".");
                System.out.println("\nDetail Fasilitas Ruangan " + ruang + ": ");
                for (int i = 0; i < fasilitasRuangan[ruang - 1].length; i++) {
                    System.out.println(fasilitasRuangan[ruang - 1][i]);
                }
            }
        } else {
            System.out.println("\nAnda Memilih Untuk Tidak Melihat Detail\n");
        }
        System.out.print("\nApakah Anda Ingin Memesan Ruangan " + ruang + " (y/t)?: ");
        String pesan = sc.next();
        if (pesan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan Nama Pemesan: ");
            String namaPemesan = sc.next();
            System.out.print("Masukkan Waktu Pemesanan: ");
            String waktuPemesanan = sc.next();
            System.out.println("Pemesanan Ruangan " + ruang + " oleh " + namaPemesan + " pada pukul " + waktuPemesanan
                    + " berhasil!");
        }
        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

    }

    public static void main(String[] args) {
        listBooking();
    }
}
