1. Apakah kegunaan parameter di dalam fungsi?Parameter digunakan untuk mengirimkan data/nilai dari luar ke dalam fungsi. Dengan parameter, fungsi menjadi lebih fleksibel karena bisa menerima input yang berbeda-beda setiap kali dipanggil.
Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
namaPelanggan: Digunakan untuk menyimpan dan menampilkan nama pelanggan secara personal dalam sapaan "Selamat datang, [nama]!"

isMember: Digunakan untuk mengecek status keanggotaan pelanggan. Jika true (member), tampilkan pesan diskon 10%. Jika false (bukan member), pesan diskon tidak ditampilkan.
3. Apakah parameter sama dengan variabel? Jelaskan.
Ya, parameter adalah variabel, tetapi dengan karakteristik khusus:
-Persamaan:
Sama-sama menyimpan nilai/data
Memiliki tipe data (String, int, boolean, dll)
Bisa digunakan di dalam fungsi
-Perbedaan:
Parameter: Variabel yang menerima nilai dari luar saat fungsi dipanggil
Variabel biasa: Dideklarasikan dan diberi nilai di dalam fungsi
4. f (isMember) {
    System.out.println("Anda adalah member, dapatkan diskon 10%...");
}
```

- Parameter `isMember` dicek dengan kondisi `if`
- Jika `true`, pesan diskon ditampilkan
- Jika `false`, pesan diskon **tidak ditampilkan** (dilewati)
Perbedaan output:
**Ketika `isMember = true`:**
```
Selamat datang, Andi!
Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!
===== MENU RESTO KAFE =====
...
```

**Ketika `isMember = false`:**
```
Selamat datang, Andi!
===== MENU RESTO KAFE =====
...
```
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?**

**Program akan ERROR (compile error)**
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
Menu("Budi", true, "DISKON30");
```

**Output yang dihasilkan:**
```
Selamat datang, Budi!
Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!
Selamat! Anda mendapat diskon 30%!
===== MENU RESTO KAFE =====
1. Kopi Hitam - Rp 15,000
2. Cappuccino - Rp 20,000
3. Latte - Rp 22,000
4. Teh Tarik - Rp 12,000
5. Roti Bakar - Rp 10,000
6. Mie Goreng - Rp 18,000
===========================
Silakan pilih menu yang Anda inginkan.

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
Ya, penggunaan parameter membuat program LEBIH BAIK karena:
Keuntungan menggunakan parameter:
Fleksibilitas tinggi - Satu fungsi bisa digunakan untuk banyak pelanggan berbeda tanpa mengubah kode fungsi
Mudah dikembangkan - Jika ada pelanggan baru, tinggal panggil fungsi dengan data baru, tidak perlu buat fungsi baru
-Kode lebih ringkas - Tidak perlu menulis ulang fungsi untuk setiap pelanggan
-Mudah di-maintenance - Jika ada perubahan tampilan menu, cukup ubah di satu tempat (fungsi Menu)