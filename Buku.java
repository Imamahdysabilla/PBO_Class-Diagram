package tugaspbokelompok_11;
public class Buku {
    private int idBuku;
    private String judul;
    private String pengarang;
    private String nomorISBN;
    private boolean statusKetersediaan;

    public Buku(int idBuku, String judul, String pengarang, String nomorISBN, boolean statusKetersediaan) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = statusKetersediaan;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public void setNomorISBN(String nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public boolean isStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(boolean statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }
   
    public void tambahBuku(){
        
    }
    public void editinfoBuku(){
        
    }
    public void hapusBuku(){
        
    }
}
