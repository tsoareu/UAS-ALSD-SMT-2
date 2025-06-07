public class AntrianPasien03 {
    NodePasien front;
    NodePasien rear;
    int size;
    int max;

    public AntrianPasien03(int max) {
        this.front = front;
        this.rear = rear;
        this.size = size;
        this.max = max;
    }

    public boolean isEmpty() {
        return (front == null);
    } 

    public boolean isFull() {
        return (size == max);
    }

    public void tambahAntrianPasien(String nama, String NIK,String keluhan ) {
        Pasien03 pasien = new Pasien03(nama, NIK, keluhan);
        NodePasien newNode = new NodePasien(pasien);
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan antrian");
            return;
        }

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(">> Pasien masuk ke dalam antrian");
    }

    public void lihatAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        } else {
            System.out.println("-- Antrian Pasien --");
            NodePasien current = front;
            while (current != null) {
             current.data.tampilkanInformasi();
            }
        }
    }
}
