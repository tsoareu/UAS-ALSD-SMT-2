public class Pasien03 {
    String nama;
    String NIK;
    String Keluhan;

    public Pasien03(String nama, String NIK, String Keluhan) {
        this.nama = nama;
        this.NIK = NIK;
        this.Keluhan = Keluhan;
    }

    public void tampilkanInformasi(){
        System.out.println("Nama Pasien: " + nama);
        System.out.println("NIK: " + NIK);
        System.out.println("Keluhan: " + Keluhan);
    }
}

