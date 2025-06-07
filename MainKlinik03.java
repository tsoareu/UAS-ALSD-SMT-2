import java.util.Scanner;
public class MainKlinik03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Klinik03 klinik = new Klinik03();
        
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
                    
                    break;
                case 2 :

                    break;
                case 3 :
                    if (klinik.AntrianPasien.isEmpty()) {
                        System.out.println("Antrian kosong.");
                        break;
                    }
                    Pasien03 dilayani = front.data;
                    System.out.println("Pasien " + dilayani.getNamaPasien() + " dipanggil");
                    System.out.print("Masukkan ID Dokter: ");
                    String idDokter = sc.nextLine();
                    System.out.println("Masukkan Nama Dokter: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan Durasi Layanan (jam): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Dokter03 dokterMelayani = new Dokter03(idDokter, nama);

                    int biaya = durasi * 50000;
                    klinik.layaniPasien(dokterMelayani, durasi, biaya);
                    System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");

                    break;
                case 4 :

                    break;
                case 5 :

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
