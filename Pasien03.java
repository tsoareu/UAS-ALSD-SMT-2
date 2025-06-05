public class Pasien03 {
    String Pasien;
    String NIK;
    String Keluhan;

    public Pasien03(String Pasien, String NIK, String Keluhan) {
        this.Pasien = Pasien;
        this.NIK = NIK;
        this.Keluhan = Keluhan;
    }

    public void tampilkanInformasi(){
        System.out.println("Nama Pasien : " + Pasien);
        System.out.println("NIK         : " + Pasien);
        System.out.println("Keluhan     : " + Keluhan);
    }
}
