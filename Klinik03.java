import java.util.Scanner;
public class Klinik03 {
    Scanner sc = new Scanner(System.in);
    NodePasien front;
    NodePasien rear;
    int size;
    int max;
    TransaksiLayanan03[] transaksiQueue;
    int rearTransaksi = 0;

    public Klinik03() {
        this.front = null;
        this.rear = null;
        this.size = 0; //
    }

    boolean isEmpty() {
        return (front == null);
    }


    public void tambahPasien(Pasien03 pasien) {
        System.out.print("Nama Pasien: ");
        String nama = sc.nextLine();
        
        System.out.print("NIK: ");
        String nik = sc.nextLine();
        
        System.out.print("Keluhan: ");
        String keluhan = sc.nextLine();
        
        Pasien03 pasienBaru = new Pasien03(nama, nik, keluhan);

        NodePasien newNode = new NodePasien(pasienBaru);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
           rear.next = newNode;
           rear = newNode;
        }
        size++;
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    public void lihatAntrian() {
        System.out.println("-- Antrian Pasien --");
        System.out.println("Antrian Pasien: ");
        if (!isEmpty()) {
            NodePasien temp = front; //untuk menyimpan nilai sementara dan menunjuk ke awal antrian
            while (temp != null) { //
                temp.data.tampilkanInformasi(); //memanggil method tampila informasi
                temp = temp.next; // menunjuk ke node selanjutnya
            }
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public Pasien03 layaniPasien() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Pasien03 dilayani = front.data; //isinya dari data terdepan dr pasien
            System.out.println("Pasien " + dilayani.nama + " dipanggil");

            front = front.next; //pasien dilayani front pindah ke node selanjutnya melalui pointer next
            if (front == null) {
                rear = null;
            }
            size--; //menandakan kalo pasien udh diproses

            System.out.print("Masukkan ID Dokter: ");
            String idDokter = sc.next();
            sc.nextLine();

            System.out.print("Masukkan Nama Dokter: ");
            String nama = sc.nextLine();

            Dokter03 dokter = new Dokter03(idDokter, nama); //menyimpan informasi pd objek dokter

            System.out.print("Masukkan Durasi Layanan (jam): ");
            int durasi = sc.nextInt();
            sc.nextLine();
            
            TransaksiLayanan03 transaksi = new TransaksiLayanan03(dilayani, dokter, durasi); //menyimpan data yg dilayani
            
            System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
            
            if (rearTransaksi < max) {
                transaksiQueue[rearTransaksi++] = transaksi; //klo < max transaksi ditambahkan
            } else {
                System.out.println("Antrian transaksi penuh, transaksi tidak dapat dicatat.");
            }
            return dilayani;
        }
    }

    public void cekSisaAntrian() {
        System.out.println(">> Sisa pasien dalam antrian: " + size); //cek sisa antrian berdasarkan size yg ada dalam ...
        
    }

    public void lihatRiwayatTransaksi(int indeks) {
        if (rearTransaksi == 0) {
            System.out.println("Tidak ada transaksi layanan");
        } else {
            System.out.println("-- Riwayat Transaksi --");
            System.out.println("Daftar Transaksi:");
            for (int i = 0; i < rearTransaksi; i++) {
                String namaPasien = transaksiQueue[i].pasien.nama; //mengambil nama pasien dari class pasien yg terdapat dlm elemen transaksiQueue
                int durasi = transaksiQueue[i].durasiLayanan; //mengambil durasi 
                int biaya = transaksiQueue[i].biaya; //mengambil biaya
                System.out.println(namaPasien + " (" + durasi + " jam): Rp. " + biaya); //mencetak nama pasien beserta jml biaya
            }
        }
    }
}
