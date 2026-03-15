# Sistem Informasi Pemesanan Catering Snack Box

## Identitas

**Nama:** Nadia Rahmah  
**NIM:** 2409106018  
**Mata Kuliah:** Pemrograman Berorientasi Objek  
**Tugas:** Posttest 1

---

## 1. Deskripsi Program

Program ini berjudul **Sistem Informasi Pemesanan Catering Snack Box** berbasis Java Console yang dibuat menggunakan konsep Object Oriented Programming (OOP).

Program ini digunakan untuk mengelola data paket snack box dan data pesanan pelanggan. Sistem memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete)** terhadap data yang disimpan dalam ArrayList.

Program memiliki menu yang akan terus berjalan hingga pengguna memilih opsi **Kembali**.

Class yang digunakan dalam program ini adalah:

1. **SnackBox**
2. **Pesanan**
3. **Main (program utama)**

---

## 2. Penjelasan Alur dan Algoritma Program

Berikut alur dan algoritma program:

1. Program dijalankan dan menampilkan **menu utama**.
2. Pengguna memilih menu:
    - Kelola SnackBox
    - Kelola Pesanan
    - Keluar Program
3. Jika pengguna memilih **Kelola SnackBox**, maka akan muncul submenu:
    - Tambah SnackBox
    - Lihat Daftar SnackBox
    - Update SnackBox
    - Hapus SnackBox
    - Kembali
4. Jika pengguna memilih **Kelola Pesanan**, maka akan muncul submenu:
    - Tambah Pesanan
    - Lihat Daftar Pesanan
    - Update Pesanan
    - Hapus Pesanan
    - Kembali
5. Program menggunakan **ArrayList** untuk menyimpan data objek SnackBox dan Pesanan.
6. Pada proses **Update dan Delete**, program akan menampilkan data terlebih dahulu menggunakan method **Read** agar pengguna dapat melihat daftar data yang tersedia.
7. Program akan melakukan **validasi input menggunakan percabangan `if`**, seperti:
    - Mengecek apakah input kosong
    - Mengecek apakah data tersedia
8. Program akan terus berjalan sampai pengguna memilih **Keluar**.
9. Program menerapkan Encapsulation dengan Getter dan Setter serta menggunakan beberapa Access Modifier yaitu:
    - public
    - private
    - protected
---

## 3. Fitur Program

Program memiliki beberapa fitur utama yaitu:

### 1. Kelola SnackBox

- Menambah data paket snack
- Menampilkan daftar paket snack
- Mengupdate data paket snack
- Menghapus data paket snack

### 2. Kelola Pesanan

- Menambah data pesanan
- Menampilkan daftar pesanan
- Mengupdate data pesanan
- Menghapus data pesanan

### 3. Validasi Input

Program melakukan pengecekan menggunakan **percabangan `if`**, seperti:

- Input tidak boleh kosong
- Data harus tersedia sebelum diupdate atau dihapus

### 4. Program Berjalan Berulang

Program menggunakan **perulangan** sehingga menu akan terus muncul sampai pengguna memilih **Keluar**.

### 5. Penerapan Encapsulation

Penerapan Encaptulation pada program dilakukan dengan cara:
1. Mengubah atribut pada class menjadi private
2. Mengakses atribut menggunakan Getter dan Setter
3. Mengatur hak akses menggunakan access modifier
---

## 4. Output Program

Berikut adalah tampilan output program.

### Menu Utama

![Menu Program](assets/menu.png)

---

### Tambah Data SnackBox

![Tambah Snack](assets/tambah-snack.png)

---

### Daftar SnackBox

![Daftar Snack](assets/daftar-snack.png)

---

### Update SnackBox

![Daftar Snack](assets/update-snack.png)

---

### Hapus SnackBox

![Daftar Snack](assets/hapus-snack.png)

---

### Tambah Pesanan

![Daftar Snack](assets/tambah-pesanan.png)

---

### Daftar Pesanan

![Daftar Pesanan](assets/daftar-pesanan.png)

---

### Update Pesanan

![Daftar Pesanan](assets/update-pesanan.png)

---

### Hapus Pesanan

![Daftar Pesanan](assets/hapus-pesanan.png)

---

## Kesimpulan

Program ini menerapkan konsep **Object Oriented Programming (OOP)** menggunakan bahasa pemrograman **Java** dengan memanfaatkan **class, object, dan ArrayList** untuk mengelola data.

Melalui program ini, pengguna dapat mengelola data **snack box** dan **pesanan** secara sederhana melalui menu berbasis console.

---