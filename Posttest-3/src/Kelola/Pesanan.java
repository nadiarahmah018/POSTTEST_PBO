package Kelola;

public class Pesanan {
    private String idPesanan;
    private String namaPelanggan;
    private String namaPaket;
    private int jumlah;
    private double totalHarga;
    private String tanggalAcara;

    public Pesanan(String idPesanan, String namaPelanggan, String namaPaket, int jumlah, double totalHarga, String  tanggalAcara) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.namaPaket = namaPaket;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.tanggalAcara = tanggalAcara;
    }

    public String getIdPesanan(){
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan){
        this.idPesanan = idPesanan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }

    public String getNamaPaket(){
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket){
        this.namaPaket = namaPaket;
    }

    public int getJumlah(){
        return jumlah;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public double getTotalHarga(){
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga){
        this.totalHarga = totalHarga;
    }

    public String getTanggalAcara(){
        return tanggalAcara;
    }

    public void setTanggalAcara( String tanggalAcara){
        this.tanggalAcara= tanggalAcara;
    }
}

