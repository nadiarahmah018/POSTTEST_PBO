public class Pesanan {
    String idPesanan;
    String namaPelanggan;
    String namaPaket;
    int jumlah;
    double totalHarga;
    String tanggalAcara;

    public Pesanan(String idPesanan, String namaPelanggan, String namaPaket, int jumlah, double totalHarga, String  tanggalAcara) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.namaPaket = namaPaket;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.tanggalAcara = tanggalAcara;
    }
}
