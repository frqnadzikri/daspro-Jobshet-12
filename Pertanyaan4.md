1. Mengapa parameter ditulis dengan String... namaPengunjung?

Karena varargs (variable arguments) digunakan saat jumlah data yang dikirim tidak pasti.
Dengan String
Jadi, String... namaPengunjung membuat fungsi lebih fleksibel dibandingkan array biasa.
3. Bisakah menggunakan dua tipe data varargs dalam satu fungsi?

Tidak bisa.
Java hanya mengizinkan satu varargs di sebuah fungsi, dan harus berada di posisi terakhir.

Contoh yang boleh:

void contoh(String pesan, int... angka)

 Contoh yang tidak boleh:

void contoh(int... angka, String... nama) // ERROR


 Contoh yang tidak boleh (varargs bukan di posisi akhir):

void contoh(String... nama, int jumlah) // ERROR
Kesimpulan:
Hanya boleh ada 1 varargs, dan harus di paling belakang.
4. Apa yang terjadi jika daftarPengunjung() dipanggil tanpa argumen?

Contoh:

daftarPengunjung();


-Program tetap berjalan, tidak error.
-Varargs otomatis dianggap sebagai array kosong dengan panjang 0.

Outputnya:
Daftar Nama Pengunjung:
(daftar nama kosong, tidak ada isi sama sekali)