import Kelola.SnackBox;
import Kelola.Pesanan;
import Kelola.PaketHemat;
import Kelola.PaketKenyang;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<SnackBox> daftarSnackBox = new ArrayList<>();
    static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        int menu;

        do {
            System.out.println("\n=== SISTEM INFORMASI PEMESANAN CATERING SNACK BOX ===");
            System.out.println("1. Kelola SnackBox");
            System.out.println("2. Kelola Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();

            if(menu == 1 ){
                menuSnackBox();
            }else if (menu == 2){
                menuPesanan();
            }
        }while(menu!= 0);
        System.out.println("Program Selesai.");
    }

    static void menuSnackBox(){
        int pilih;
        do{
            System.out.println("\n--- MENU KELOLA SNACKBOX ---");
            System.out.println("1. Tambah SnackBox");
            System.out.println("2. Lihat SnackBox");
            System.out.println("3. Update SnackBox");
            System.out.println("4. Delete SnackBox");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            if(pilih == 1) tambahSnackBox();
            else if(pilih == 2) readSnackBox();
            else if(pilih == 3) updateSnackBox();
            else if(pilih == 4) deleteSnackBox();

        }while(pilih != 0);
    }

    static void tambahSnackBox(){

        System.out.print("ID SnackBox: ");
        String id = input.nextLine();

        if(id.isEmpty()){
            System.out.println("ID tidak boleh kosong!");
            return;
        }

        System.out.print("Pilih Jenis Paket (1. Hemat / 2. Kenyang): ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Harga: ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.print("Isi Snack: ");
        String isi = input.nextLine();

        if(jenis == 1){
            daftarSnackBox.add(new PaketHemat(id, isi, harga));
        }else if(jenis == 2){
            daftarSnackBox.add(new PaketKenyang(id, isi, harga));
        }else{
            System.out.println("Pilihan tidak valid!");
        }

        System.out.println("Data berhasil ditambahkan!");
    }

    static void readSnackBox(){

        if(daftarSnackBox.isEmpty()){
            System.out.println("Data SnackBox belum tersedia!");
            return;
        }

        System.out.println("\n===== DAFTAR SNACKBOX =====");

        for(SnackBox s : daftarSnackBox){
            System.out.println("-----------------------------------");
            System.out.println("ID      : " + s.getId());
            System.out.println("Nama    : " + s.getNamaPaket());
            System.out.println("Harga   : " + s.getHarga());
            System.out.println("Status  : " + s.getStatus());
            System.out.println("Isi Snack :");

            String[] snackList = s.getIsiSnack().split(",");
            for(String snack : snackList) {
                System.out.println("   - " + snack.trim());

            }
            System.out.println("Ketentuan : " + s.getKetentuan());
        }
        System.out.println("-----------------------------------");
    }

    static void updateSnackBox(){

        if(daftarSnackBox.isEmpty()){
            System.out.println("Data belum ada!");
            return;
        }

        readSnackBox();

        System.out.print("Masukkan ID yang ingin diupdate: ");
        String id = input.nextLine();

        for(SnackBox s : daftarSnackBox){

            if(s.getId().equals(id)){

                System.out.print("Isi Snack Baru: ");
                s.setIsiSnack(input.nextLine());

                System.out.print("Harga Baru: ");
                s.setHarga(input.nextDouble());
                input.nextLine();

                System.out.print("Status Baru: ");
                s.setStatus(input.nextLine());
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }

        System.out.println("ID tidak ditemukan!");
    }

    static void deleteSnackBox(){

        if(daftarSnackBox.isEmpty()){
            System.out.println("Data belum ada!");
            return;
        }

        readSnackBox();

        System.out.print("Masukkan ID yang ingin dihapus: ");
        String id = input.nextLine();

        for(int i=0;i<daftarSnackBox.size();i++){

            if(daftarSnackBox.get(i).getId().equals(id)){
                daftarSnackBox.remove(i);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }

        System.out.println("ID tidak ditemukan!");
    }

    static void menuPesanan(){

        int pilih;

        do{
            System.out.println("\n--- MENU KELOLA PESANAN ---");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Update Pesanan");
            System.out.println("4. Delete Pesanan");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            if(pilih == 1) tambahPesanan();
            else if(pilih == 2) readPesanan();
            else if(pilih == 3) updatePesanan();
            else if(pilih == 4) deletePesanan();

        }while(pilih != 0);
    }

    static void tambahPesanan(){

        if(daftarSnackBox.isEmpty()){
            System.out.println("SnackBox belum tersedia!");
            return;
        }

        System.out.print("ID Pesanan: ");
        String id = input.nextLine();

        System.out.print("Nama Pelanggan: ");
        String nama = input.nextLine();

        readSnackBox();

        System.out.print("ID SnackBox : ");
        String idSnack = input.nextLine();

        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        input.nextLine();

        SnackBox selected = null;

        for(SnackBox s : daftarSnackBox){
            if(s.getId().equalsIgnoreCase(idSnack)){
                selected = s;
                break;
            }
        }
        if(selected == null){
            System.out.println("ID tidak ditemukan!");
            return;
        }
        double harga = selected.getHarga();

        System.out.print("Tanggal Acara: ");
        String tanggal = input.nextLine();

        double total;
        double diskon = 0;

        Pesanan p = new Pesanan(id, nama, selected.getNamaPaket(), jumlah, 0, tanggal, 0);

        if(jumlah >= 100){
            diskon = 5000;
            total = p.hitungTotal(harga, jumlah, diskon);
        } else {
            total = p.hitungTotal(harga, jumlah);
        }

        p.setTotalHarga(total);
        p.setDiskon(diskon);

        daftarPesanan.add(p);

        System.out.println("Pesanan berhasil ditambahkan!");
    }

    static void readPesanan(){

        if(daftarPesanan.isEmpty()){
            System.out.println("Data pesanan belum ada!");
            return;
        }

        System.out.println("\nDAFTAR PESANAN");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s %-12s %-10s %-15s\n",
                "ID","Pelanggan","Paket","Jumlah","Total","Diskon","Tanggal");
        System.out.println("-----------------------------------------------------------------------------------");

        for(Pesanan p : daftarPesanan){
            System.out.printf("%-10s %-15s %-15s %-10d %-12.0f %-10.0f %-15s\n",
                    p.getIdPesanan(),
                    p.getNamaPelanggan(),
                    p.getNamaPaket(),
                    p.getJumlah(),
                    p.getTotalHarga(),
                    p.getDiskon(),
                    p.getTanggalAcara());
        }
    }

    static void updatePesanan(){

        if(daftarPesanan.isEmpty()){
            System.out.println("Data belum ada!");
            return;
        }

        readPesanan();

        System.out.print("Masukkan ID Pesanan: ");
        String id = input.nextLine();

        for(Pesanan p : daftarPesanan){

            if(p.getIdPesanan().equals(id)){

                System.out.print("Nama Pelanggan Baru: ");
                p.setNamaPelanggan(input.nextLine());

                System.out.print("Jumlah Baru: ");
                int jumlahBaru = input.nextInt();
                input.nextLine();

                double harga = 0;

                for(SnackBox s : daftarSnackBox){
                    if(s.getNamaPaket().equalsIgnoreCase(p.getNamaPaket())){
                        harga = s.getHarga();
                    }
                }

                double total;
                double diskon = 0;
                if(jumlahBaru >= 100){
                    diskon = 5000;
                    total = p.hitungTotal(harga, jumlahBaru, diskon);
                } else {
                    total = p.hitungTotal(harga, jumlahBaru);
                }

                p.setJumlah(jumlahBaru);
                p.setTotalHarga(total);
                p.setDiskon(diskon);
                System.out.print("Tanggal Baru: ");
                p.setTanggalAcara(input.nextLine());

                System.out.println("Data berhasil diupdate!");
                return;
            }
        }

        System.out.println("ID tidak ditemukan!");
    }

    static void deletePesanan(){

        if(daftarPesanan.isEmpty()){
            System.out.println("Data belum ada!");
            return;
        }

        readPesanan();

        System.out.print("Masukkan ID Pesanan: ");
        String id = input.nextLine();

        for(int i=0;i<daftarPesanan.size();i++){

            if(daftarPesanan.get(i).getIdPesanan().equals(id)){
                daftarPesanan.remove(i);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan!");
    }
}