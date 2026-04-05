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

        System.out.print("Nama Paket: ");
        String nama = input.nextLine();

        System.out.print("Isi Snack: ");
        String isi = input.nextLine();

        System.out.print("Harga: ");
        double harga = input.nextDouble();

        daftarSnackBox.add(new SnackBox(id,nama,isi,harga));

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
            System.out.println("ID      : " + s.id);
            System.out.println("Nama    : " + s.namaPaket);
            System.out.println("Harga   : " + s.harga);
            System.out.println("Isi Snack :");

            String[] snackList = s.isiSnack.split(",");
            for(String snack : snackList) {
                System.out.println("   - " + snack.trim());
            }
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

            if(s.id.equals(id)){

                System.out.print("Nama Paket Baru: ");
                s.namaPaket = input.nextLine();

                System.out.print("Isi Snack Baru: ");
                s.isiSnack = input.nextLine();

                System.out.print("Harga Baru: ");
                s.harga = input.nextDouble();

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

            if(daftarSnackBox.get(i).id.equals(id)){
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

        System.out.print("Pilih Nama Paket: ");
        String paket = input.nextLine();

        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        input.nextLine();

        double harga = 0;

        for(SnackBox s : daftarSnackBox){
            if(s.namaPaket.equalsIgnoreCase(paket)){
                harga = s.harga;
            }
        }

        if(harga == 0){
            System.out.println("Paket tidak ditemukan!");
            return;
        }

        double total = harga * jumlah;

        System.out.print("Tanggal Acara: ");
        String tanggal = input.nextLine();

        daftarPesanan.add(new Pesanan(id,nama,paket,jumlah,total,tanggal));

        System.out.println("Pesanan berhasil ditambahkan!");
    }

    static void readPesanan(){

        if(daftarPesanan.isEmpty()){
            System.out.println("Data pesanan belum ada!");
            return;
        }

        System.out.println("\nDAFTAR PESANAN");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s %-12s %-15s\n",
                "ID","Pelanggan","Paket","Jumlah","Total","Tanggal");
        System.out.println("-----------------------------------------------------------------------------------");

        for(Pesanan p : daftarPesanan){
            System.out.printf("%-10s %-15s %-15s %-10d %-12.0f %-15s\n",
                    p.idPesanan,p.namaPelanggan,p.namaPaket,p.jumlah,p.totalHarga,p.tanggalAcara);
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

            if(p.idPesanan.equals(id)){

                System.out.print("Nama Pelanggan Baru: ");
                p.namaPelanggan = input.nextLine();

                System.out.print("Jumlah Baru: ");
                p.jumlah = input.nextInt();
                input.nextLine();

                p.totalHarga = p.jumlah * p.totalHarga / p.jumlah;

                System.out.print("Tanggal Baru: ");
                p.tanggalAcara = input.nextLine();

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

            if(daftarPesanan.get(i).idPesanan.equals(id)){
                daftarPesanan.remove(i);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan!");
    }
}