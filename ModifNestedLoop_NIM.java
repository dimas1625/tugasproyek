import java.util.Scanner;

public class ModifNestedLoop_NIM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] temps = new int[5][7];
        double[] averages = new double[5]; // Array untuk menyimpan rata-rata masing-masing kota
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            int total = 0; // Menyimpan total nilai untuk perhitungan rata-rata
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextInt();
                total += temps[i][j];
            }
            averages[i] = (double) total / temps[i].length; // Hitung rata-rata untuk setiap kota
            System.out.println();
        }
        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println("Rata-rata: " + averages[i]);
        }
    }
}
