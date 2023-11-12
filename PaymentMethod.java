import java.util.Scanner;

public class PaymentMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String payMethod = "";
        String[] methods = {"M-Banking", "Kartu Kredit/Debit", "E-Wallet", "Offline Payment"};

        System.out.println("\n======= Payment Methode =======");
        int i = 0;
        while (i < methods.length) {
            System.out.println((char) ('a' + i) + ". " + methods[i]);
            i++;
        }

        System.out.println("Pilih Methode Pembayaran (a/b/c/d)");
        payMethod = sc.next();

        boolean validInput = false;
        i = 0;
        while (i < methods.length) {
            if (payMethod.equals(String.valueOf((char) ('a' + i))) ) {
                validInput = true;
                System.out.println("Silahkan Membayar " + methods[i]);
                break;
            }
            i++;
        }

        if (!validInput) {
            System.out.println("Pembayaran Tidak Valid");
        }
    }
}
