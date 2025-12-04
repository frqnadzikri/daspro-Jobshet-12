1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Tidak. Fungsi tanpa parameter tidak harus selalu bertipe void. Fungsi bisa bertipe data lain seperti int, String, double, dll
2. Apakah daftar menu dapat ditampilkan tanpa menggunakan fungsi Menu()?
Ya, bisa. Kita bisa langsung menulis semua perintah System.out.println() di dalam fungsi main() tanpa membuat fungsi Menu().
3. Keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah di main:**

- **Kode lebih rapi dan terorganisir** - Fungsi memisahkan tugas-tugas tertentu
- **Mudah dipanggil berulang kali** - Jika perlu tampilkan menu berkali-kali, cukup panggil `Menu()` lagi
- **Mudah diubah** - Jika ada perubahan menu, cukup edit di satu tempat (fungsi Menu)
- **Reusable** - Fungsi bisa dipanggil dari bagian program lain
4. Alur eksekusi program ketika fungsi Menu() dipanggil dari main:**

-Program mulai dijalankan dari fungsi `main()`
Di dalam `main()`, terdapat perintah `Menu();`
Program **melompat** ke fungsi `Menu()`
Semua perintah di dalam fungsi `Menu()` dieksekusi (menampilkan daftar menu)
Setelah selesai, program **kembali** ke fungsi `main()`
Program melanjutkan ke baris berikutnya setelah pemanggilan `Menu()` (jika ada)
Program selesai karena fungsi `main()` berakhir