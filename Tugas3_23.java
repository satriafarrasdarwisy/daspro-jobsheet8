import java.util.Scanner;

public class Tugas3_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSemua = 0;                 
        int barangTerbanyak = -1;           // -1 agar toko pertama pasti tercatat
        int tokoTerbanyak = 0;

        int toko = 1;
        while (toko <= jumlahToko) {        // loop luar: toko
            System.out.println("Toko " + toko);

            int jumlahPelanggan;
            do {
                System.out.print("  Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("  Tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;        // direset untuk setiap toko

            for (int p = 1; p <= jumlahPelanggan; p++) {   // loop tengah: pelanggan
                int barang;
                do {                                       // loop dalam: validasi input
                    System.out.print("    Jumlah barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("    Tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }

            totalSemua += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {       // > agar toko nomor kecil menang jika sama
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }

            toko++;
            // ringkasan per toko
            System.out.println("Toko " + (toko - 1) + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);
        }

        System.out.println("==============================");
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}