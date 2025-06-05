public class AntrianPasien {
    NodePasien head, tail; 

    public void tambahPasien(Pasien03 pasien03) {
        NodePasien newNode = new NodePasien(pasien03);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void tampilkanAntrian(){
        NodePasien current = head;
        while (current != null) {
            current.pasien03.tampilkanInformasi();
            current = current.next;
        }
    }

    public void layaniPasien(){
        if (head == null) {
            Pasien03 dilayani = head.pasien03;
            head = head.next;
            return dilayani;
        }
    }

}
