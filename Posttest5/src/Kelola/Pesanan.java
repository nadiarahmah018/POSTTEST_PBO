package Kelola;

public class Pesanan implements Diskon {
    private String idPesanan;
    private String namaPelanggan;
    private String namaPaket;
    private int jumlah;
    private double totalHarga;
    private double diskon;
    private String tanggalAcara;

    public Pesanan(String idPesanan, String namaPelanggan, String namaPaket,
                   int jumlah, double totalHarga, String tanggalAcara, double diskon) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.namaPaket = namaPaket;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.tanggalAcara = tanggalAcara;
        this.diskon = diskon;
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

    public double hitungTotal(double harga, int jumlah){
        return harga * jumlah;
    }

    public double hitungTotal(double harga, int jumlah, double diskon){
        return (harga * jumlah) - diskon;
    }

    @Override
    public double hitungDiskon(int jumlah){
        if(jumlah >= 100){
            return 5000;
        }
        return 0;
    }

    @Override
    public String infoDiskon(){
        if(diskon > 0){
            return "Mendapat diskon(Pembelian lebih dari 100 pcs)";
        } else {
            return "Tidak mendapatkan diskon";
        }
    }

    public double getDiskon(){
        return diskon;
    }

    public void setDiskon(double diskon){
        this.diskon = diskon;
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

