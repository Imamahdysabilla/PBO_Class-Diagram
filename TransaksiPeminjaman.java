package tugaspbokelompok_11;
import java.util.Date;
public class TransaksiPeminjaman {
    private int idTransaksi;
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;

    public TransaksiPeminjaman(int idTransaksi, Date tanggalPeminjaman, Date tanggalPengembalian) {
        this.idTransaksi = idTransaksi;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }
    
    public void prosesPeminjaman(){
        
    }
}
