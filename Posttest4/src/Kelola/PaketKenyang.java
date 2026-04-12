package Kelola;

public class PaketKenyang extends SnackBox {
    public PaketKenyang(String id, String isiSnack, double harga) {
        super(id, "Paket kenyang", isiSnack, harga);
    }
    @Override
    public String getKetentuan(){
        return "Minimal pemesanan 20 box, porsi lebih besar";
    }
}
