package Kelola;

public class PaketHemat extends SnackBox{
    public PaketHemat(String id, String isiSnack, double harga) {
        super(id, "Paket Hemat", isiSnack, harga);
    }
    @Override
    public String getKetentuan(){
        return "Minimal pemesanan 10 box, cocok untuk acara kecil";
    }
}
