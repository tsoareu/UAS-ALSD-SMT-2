public class TssLayanan03 {
    Pasien03 pasien;
    Dokter03 dokter;
    int durasiLayanan;
    int biaya;

    TssLayanan03() {

    }

    TssLayanan03(Pasien03 pasien, Dokter03 dokter, int durasi, int biaya) {
        this.dokter = dokter;
        this.pasien = pasien;
        this.durasiLayanan = durasi;
        this.biaya = biaya;
    }

    public int hitungBiaya() {
        int tarifPerJam = 50000;
        return durasiLayanan * tarifPerJam;
    }
}
