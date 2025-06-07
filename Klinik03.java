public class Klinik03 {
    NodePasien front;
    NodePasien rear;
    int size;
    int max;
    TransaksiLayanan03[] transaksiQueue;
    int rearTransaksi = 0;

    public Klinik03(int max) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.max = max;
        this.transaksiQueue = new TransaksiLayanan03[max];
    }

    boolean isEmpty() {
        return (front == null);
    }

    boolean isFull() {
        return (size == max);
    }

    public void tambahPasien(Pasien03 pasien) {
        NodePasien newNode = new NodePasien(pasien);
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
        if (isEmpty()) {
            NodePasien temp = front;
            System.out.println("-- Antrian Pasien --");
            System.out.println("Antrian Pasien: ");
            while (temp != null) {
                temp.data.tampilkanInformasi();
                temp = temp.next;
            }
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public Pasien03 layaniPasien(String idDokter, String namaDokter, int durasi) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Pasien03 dilayani = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        Dokter03 dokter = new Dokter03(idDokter, namaDokter);
        int tarifPerjam = 50000;
        int biaya = durasi * tarifPerjam;
        TransaksiLayanan03 transaksi = new TransaksiLayanan03(dilayani, dokter, durasi, biaya);
        if (rearTransaksi < max) {
            transaksiQueue[rearTransaksi++] = transaksi;
        }
        return dilayani;
    }

    public void cekSisaAntrian() {
        System.out.println(">> Sisa pasien dalam antrian: " + size);
        
    }

    public void lihatRiwayatTransaksi(int indeks) {
        if (rearTransaksi == 0) {
            System.out.println("Tidak ada transaksi layanan");
        } else {
            System.out.println("-- Riwayat Transaksi --");
            System.out.println("Daftar Transaksi:");
            for (int i = 0; i < rearTransaksi; i++) {
                String namaPasien = transaksiQueue[i].pasien.getNamaPasien();
                int durasi = transaksiQueue[i].durasiLayanan;
                int biaya = transaksiQueue[i].biaya;
                System.out.println(namaPasien + " (" + durasi + " jam): Rp. " + biaya);
            }
        }
    }
}
