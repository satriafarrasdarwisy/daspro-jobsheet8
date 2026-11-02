import java.util.Scanner;

public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n minimal 1. Ulangi input!");
            }
        } while (n < 1);

        int total = 0;

        for (int i = 1; i <= n; i++) {          // outer loop: baris
            for (int j = 1; j <= i; j++) {      // inner loop: angka 1 sampai i
                System.out.print(j + " ");
                total++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);
        sc.close();
    }
}