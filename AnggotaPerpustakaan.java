package tugaspbokelompok_11;
public class AnggotaPerpustakaan {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String kontak;

    public AnggotaPerpustakaan(int idAnggota, String nama, String alamat, String kontak) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
   
    public void registerAnggota(){
        
    }
    public void editProfilAnggota(){
        
    }
    public void hapusAnggota(){
        
    }
}
