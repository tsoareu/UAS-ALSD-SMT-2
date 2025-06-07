public class AntrianPasien {
    Pasien03[] data;
    NodePasien front;
    NodePasien rear;
    int size;
    int max;

    public AntrianPasien(int max) {
        this.front = front;
        this.rear = rear;
        this.size = 0;
        this.max = max;
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
            front = newNode;
            rear = newNode;
        } else {
            newNode = front;
            front = newNode;
        }
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

    public void layaniPasien() {

    }

    public void cekSisaAntrian() {
        int count = 0;
        NodePasien current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return; //blm lengkap
        
    }

    public void lihatRiwayatTransaksi(int indeks) {
        if (isEmpty()) {
            System.out.println("Tidak ada riwayat transaksi");
        } else {
            for (int i = 0; i <= indeks; i++) {
                System.out.println("Daftar Transaksi: ");
                System.out.println( );
                System.out.println();
            }
        }
    }

}
