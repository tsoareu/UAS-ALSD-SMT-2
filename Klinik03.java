import java.util.Scanner;
public class Klinik03 {
    Scanner sc = new Scanner(System.in);
    NodePasien head, tail;
    QueueTransaksi transaksiQueue;
    int size = 0;

    public Klinik03(QueueTransaksi transaksiQueue) {
        this.transaksiQueue = transaksiQueue;
    }

    boolean isEmpty() {
        return (head == null);
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
            head = tail = newNode;
        } else {
           tail.next = newNode;
           tail = newNode;
        }
        size++;
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    public void lihatAntrian() {
        System.out.println("-- Antrian Pasien --");
        System.out.println("Antrian Pasien: ");
        if (!isEmpty()) {
            NodePasien temp = head; //untuk menyimpan nilai sementara dan menunjuk ke awal antrian
            while (temp != null) { //
                temp.data.tampilkanInformasi(); //memanggil method tampila informasi
                temp = temp.next; // menunjuk ke node selanjutnya
            }
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public void layaniPasien() {
        if (isEmpty()) {
            System.out.println("antrian kosong");
            return;
        }

        Pasien03 dilayani = head.data;
        System.out.println("Pasien " + dilayani.nama + " dipanggil");
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.print("Masukkan ID Dokter: ");
        String idDokter = sc.next();
        sc.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = sc.nextInt();
        sc.nextLine();

        Dokter03 dokter = new Dokter03(idDokter, nama); //menyimpan informasi pd objek dokter
        TransaksiLayanan03 transaksi = new TransaksiLayanan03(dilayani, dokter, durasi); //menyimpan data yg dilayani
            
        transaksiQueue.enqueue(transaksi);
        System.out.println(">> Pasien telah dilayani, Transaksi berhasil dicatat");

    }

    public void cekSisaAntrian() {
        System.out.println(">> Sisa pasien dalam antrian: " + size); //cek sisa antrian berdasarkan size yg ada dalam ...
        
    }

    public void lihatRiwayatTransaksi() {
        transaksiQueue.lihatRiwayatTransaksi();
    }
    
}