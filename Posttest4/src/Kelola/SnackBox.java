package Kelola;

public class SnackBox {
    private String id;
    private String namaPaket;
    private String isiSnack;
    private double harga;
    protected String status = "Tersedia";

    public SnackBox( String id, String namaPaket, String isiSnack, double harga){
        this.id = id;
        this.namaPaket = namaPaket;
        this.isiSnack = isiSnack;
        this.harga = harga;
    }

    public String getId(){
        return id;
    }

    public String getNamaPaket(){
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket){
        this.namaPaket = namaPaket;
    }

    public String getIsiSnack(){
        return isiSnack;
    }

    public void setIsiSnack(String isiSnack){
        this.isiSnack = isiSnack;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getKetentuan(){
        return "Minimal Pesanan";
    }
}
