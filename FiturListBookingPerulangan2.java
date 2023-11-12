import java.util.Scanner;

public class FiturListBookingPerulangan2 {

    static void listBooking() {

        Scanner sc = new Scanner(System.in);

        int ruang = 0;

        // Inisialisasi array
        String fasilitasRuangan[][] = new String[3][3];
        fasilitasRuangan[0][0] = "1. Kamar tidur kapasitas 2 orang";
        fasilitasRuangan[0][1] = "2. Kamar mandi dalam dengan air panas";
        fasilitasRuangan[0][2] = "3. Handuk dan peralatan mandi";
        fasilitasRuangan[1][0] = "1. Tempat tidur dengan kapasitas 1 orang";
        fasilitasRuangan[1][1] = "2. Kamar mandi dalam dengan air panas";
        fasilitasRuangan[1][2] = "3. Snack yang telah disediakan didalam kamar";
        fasilitasRuangan[2][0] = "1. Kamar tidur kapasitas 1 orang";
        fasilitasRuangan[2][1] = "2. Kamar mandi dalam dengan air panas";
        fasilitasRuangan[2][2] = "3. Ruangan ber-AC";

        int hargaRuangan[]={500000, 400000, 450000};

        boolean isListBooking = false;
        while (!isListBooking) {

            System.out.println("\n==================================================");
            System.out.println("=                 List Booking                   =");
            System.out.println("==================================================\n");

            System.out.println("List ruangan yang tersedia pada hari ini\n");
            System.out.println("1. Ruangan 1 ");
            System.out.println("2. Ruangan 2");
            System.out.println("3. Ruangan 3");
            System.out.print("Silahkan masukan ruangan yang ingin anda pesan (1/2/3): ");
            ruang = sc.nextInt();

            if (ruang > 3 || ruang < 1) {
                System.out.println("\nRuang yang anda pilih tidak tersedia, silahkan untuk mencoba kembali!");
            } else {
                isListBooking = true;
            }
        }

        Boolean isDetailRuangan = false;
        while (!isDetailRuangan) {

            System.out.print("\nApakah Anda Ingin Melihat Detail Fasilitas Ruangan " + ruang + " (y/t)?: ");
            String detail = sc.next();

            if (detail.equalsIgnoreCase("y")) {

                if (ruang >= 1 && ruang <= 3) {
                    System.out.println("\n==================================================");
                    System.out.println("=          Detail fasilitas ruangan " + ruang + "            =");
                    System.out.println("==================================================\n");

                    for (int i = 0; i < fasilitasRuangan[ruang - 1].length; i++) {
                        System.out.println(fasilitasRuangan[ruang - 1][i]);
                    }
                }
                isDetailRuangan = true;

            } else if (detail.equalsIgnoreCase("t")) {
                System.out.println("\nAnda tidak melihat detail ruangan.");
                isDetailRuangan = true;

            } else {
                System.out.println("\nInput yang anda masukan salah, silahkan coba lagi!");
            }

        }

        String konfirmasiRuangan;
        Boolean isKonfirmasiRuangan = false;
        while (!isKonfirmasiRuangan) {

            System.out.println("\n==================================================");
            System.out.println("=                   Konfirmasi                   =");
            System.out.println("==================================================");

            System.out.print("\nJika anda telah yakin dengan ruangan " + ruang + " ketik (konfirmasi/batal): ");
            konfirmasiRuangan = sc.next();

            if (konfirmasiRuangan.equalsIgnoreCase("konfirmasi")) {
                System.out.println("\nAnda telah berhasil memesan ruangan " + ruang);
                isKonfirmasiRuangan = true;

            } else if (konfirmasiRuangan.equalsIgnoreCase("batal")) {
                System.out.println("\nAnda membatalkan pemesanan ruangan " + ruang);
                isKonfirmasiRuangan = true;

            } else {
                System.out.println("\nInput yang anda masukan salah silahkan coba lagi!");
            }

        }

        System.out.println("\n==================================================");
        System.out.println("=                  System out                    =");
        System.out.println("==================================================\n");

    }

    public static void main(String[] args) {
        listBooking();
    }
}
