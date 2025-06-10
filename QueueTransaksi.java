public class QueueTransaksi {
    int front, rear, size, max;
    TransaksiLayanan03[] transaksiQueue;
    
    public QueueTransaksi(int max) {
        this.max = max;
        transaksiQueue = new TransaksiLayanan03[max];
        front = rear = -1;
        size = 0;
    }

    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(TransaksiLayanan03 transaksi) {
        if (isFull()) {
            System.out.println("Riwayat Transaksi Penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear+1) % max;
        }
        transaksiQueue[rear] = transaksi;
        size++;
    }

    public void lihatRiwayatTransaksi() {
        if (isEmpty()) {
            System.out.println("Tidak ada transaksi layanan");
        } else {
            System.out.println("-- Riwayat Transaksi --");
            System.out.println("Daftar Transaksi:");
            for (int i = 0; i < size; i++) {
                String namaPasien = transaksiQueue[i].pasien.nama; //mengambil nama pasien dari class pasien yg terdapat dlm elemen transaksiQueue
                int durasi = transaksiQueue[i].durasiLayanan; //mengambil durasi 
                int biaya = transaksiQueue[i].biaya; //mengambil biaya
                System.out.println(namaPasien + " (" + durasi + " jam): Rp. " + biaya); //mencetak nama pasien beserta jml biaya
            }
        }
    }
}
