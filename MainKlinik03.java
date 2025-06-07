import java.util.Scanner;
public class MainKlinik03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Klinik03 klinik = new Klinik03(0);
        
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
                    sc.nextLine();
                    System.out.print("Nama Pasien   : ");
                    String namaPasien = sc.nextLine();
                    System.out.print("NIK           : ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan       : ");
                    String keluhan = sc.nextLine();

                    Pasien03 p = new Pasien03(namaPasien, nik, keluhan);
                    klinik.tambahPasien(p);
                    break;
                case 2 :
                    klinik.lihatAntrian();
                    break;
                case 3 :
                    

                    break;
                case 4 :
                    klinik.cekSisaAntrian();
                    break;
                case 5 :
                    klinik.lihatRiwayatTransaksi(0);
                    break;
                case 0 :
                    System.out.println("Terima kasih telah mengakses Sistem Antrian Klinik");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        }
    }
}
