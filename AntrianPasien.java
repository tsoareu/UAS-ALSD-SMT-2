public class AntrianPasien {
    Pasien03[] data;
    NodePasien head;
    NodePasien tail;
    int rear;
    int front;

    boolean isEmpty() {
        return (head == null);
    }

    public void tambahPasien(Pasien03 pasien) {
        NodePasien newNode = new NodePasien(pasien);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode = head;
            head = newNode;
        }
    }

    public void lihatAntrian() {
        if (isEmpty()) {
            NodePasien temp = head;
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
        NodePasien current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return; //blm lengkap
        
    }

    public void lihatRiwayatTransaksi() {
        if (isEmpty()) {
            System.out.println("Tidak ada riwayat transaksi");
        } else {
            for (int i = 0; i < rear; i++) {
                System.out.println("Daftar Transaksi: ");
                System.out.println( );
                System.out.println();
            }
        }
    }

}
