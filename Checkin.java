import java.util.Scanner;

public class Checkin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n======= Mulai Checkin =======");

        System.out.println("Mulai Checkin (YYYY-MM-DD HH:mm)");
        System.out.print("Apakah Anda Ingin Memulai Checkin? (y/t): ");
        String checkIn = sc.next();
        if (checkIn.equalsIgnoreCase("y")) {
            System.out.println("Anda Akan Memulai Checkin");
        } else {
            System.out.println("Anda Tidak Jadi Checkin");
            return;
        }

        System.out.print("Masukan Tahun checkin (YYYY): ");
        int tahunCheckin = sc.nextInt();

        System.out.print("Masukan Bulan Checkin: ");
        int bulanCheckin = sc.nextInt();

        String[] months = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        if (bulanCheckin < 1 || bulanCheckin > 12) {
            System.out.println("Bulan yang Anda Masukan Salah!");
            return;
        }
        
        System.out.println(months[bulanCheckin - 1]);

        System.out.print("Masukan Tanggal Checkin: ");
        int tanggalCheckin = sc.nextInt();
        if (tanggalCheckin > 31) {
            System.out.println("Tanggal yang Anda Masukan Salah! ");
            return;
        }

        System.out.print("Masukan Jam Checkin: ");
        int jamCheckin = sc.nextInt();
        if (jamCheckin <= 12) {
            System.out.println(" Am");
        } else if (jamCheckin <= 24) {
            System.out.println(" Pm");
        } else {
            System.out.println("Waktu yang Anda Masukan Salah! ");
            return;
        }

        System.out.println("Anda Akan Checkin Pada Tanggal " + tanggalCheckin + " Bulan " + bulanCheckin + " Tahun " + tahunCheckin + " dan Pada Jam " + jamCheckin);
    }
}
