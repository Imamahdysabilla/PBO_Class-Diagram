package tugaspbokelompok_11;
import java.util.Date;
public class TransasksiPengembalian {
    private int idTransaksi;
    private Date tanggalPengembalian;

    public TransasksiPengembalian(int idTransaksi, Date tanggalPengembalian) {
        this.idTransaksi = idTransaksi;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }
    
    public void prosesPengembalian(){
        
    }
}
