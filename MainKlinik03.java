import java.util.Scanner;
public class MainKlinik03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueTransaksi transaksi = new QueueTransaksi(100);
        Klinik03 klinik = new Klinik03(transaksi);
        
        while (true) {
            System.out.println();
            System.out.println("=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    klinik.tambahPasien(null);
                    break;
                case 2 :
                    klinik.lihatAntrian();
                    break;
                case 3 :
                    klinik.layaniPasien();
                    break;
                case 4 :
                    klinik.cekSisaAntrian();
                    break;
                case 5 :
                    klinik.lihatRiwayatTransaksi();
                    break;
                case 0 :
                    System.out.println("Terima kasih telah mengakses Sistem Antrian Klinik.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        }
    }
}
