public class Dokter03 {
    String idDokter;
    String nama;

    public Dokter03 (String idDokter, String nama) {
        this.idDokter = idDokter;
        this.nama = nama;
    }

    public void tampilInfoDokter(){
        System.out.println("ID Dokter   : " + idDokter);
        System.out.println("Nama Dokter : " + nama);
    }

    public String getIdDokter() {
        return idDokter;
    }

    public String getNamaDokter() {
        return nama;
    } 
}
