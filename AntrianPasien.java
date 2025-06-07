public class AntrianPasien {

    NodePasien head;
    NodePasien tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void tambahPasien(Pasien03 pasien) {
        NodePasien newNode = new NodePasien(pasien, pasien);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode = head;
            head = newNode;
        }
    }

    public void tampilAntrian() {
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

    public void layaniAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return null;
        } else {
            Pasien03 pasien = data[front]
        }
    }

    public void cekSisaAntrian() {
        int count = 0;
        NodePasien current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void lihatRiwayatTransaksi() {
        if (isEmpty()) {
            
        }
    }

}
