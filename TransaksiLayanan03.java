public class TransaksiLayanan03 {
    Pasien03 pasien;
    Dokter03 dokter;
    int durasiLayanan;
    int biaya;

    TransaksiLayanan03(Pasien03 pasien, Dokter03 dokter, int durasi) {
        this.dokter = dokter;
        this.pasien = pasien;
        this.durasiLayanan = durasi;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        int tarifPerJam = 50000;
        return biaya = durasiLayanan * tarifPerJam;
    }

}
