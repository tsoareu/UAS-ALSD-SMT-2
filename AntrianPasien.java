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

}
