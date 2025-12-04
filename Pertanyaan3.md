1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.Fungsi PERLU return value (bukan void):

Ketika fungsi melakukan perhitungan atau pemrosesan data yang hasilnya akan digunakan di tempat lain
Ketika fungsi menghasilkan nilai yang perlu disimpan atau diolah lebih lanjut
Contoh dari program kafe:
javapublic static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
    // ... perhitungan
    return hargaTotal; // Mengembalikan hasil perhitungan
}
→ Fungsi ini PERLU return karena hasil perhitungan total harga akan digunakan untuk ditampilkan atau diolah lebih lanjut.Fungsi TIDAK PERLU return value (void):

Ketika fungsi hanya menampilkan informasi ke layar
Ketika fungsi hanya melakukan aksi tanpa menghasilkan nilai yang perlu dikembalikan
Contoh dari program kafe:
javapublic static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");
    // ... hanya menampilkan menu
}
→ Fungsi ini TIDAK PERLU return karena hanya menampilkan menu ke layar, tidak menghasilkan nilai untuk diolah.
2. 2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
Tipe data nilai kembalian: int

Karena total harga adalah angka bulat (Rupiah)

Parameter 1: int pilihanMenu

Tipe data: int (bilangan bulat)
Arti: Menyimpan nomor menu yang dipilih pelanggan (1-6)
1 = Kopi Hitam
2 = Cappuccino
3 = Latte
4 = Teh Tarik
5 = Roti Bakar
6 = Mie Goreng
Kegunaan: Untuk mengambil harga menu dari array hargaItems
Parameter 2: int banyakItem
Tipe data: int (bilangan bulat)
Arti: Menyimpan jumlah porsi yang dipesan pelanggan
Kegunaan: Untuk mengalikan harga satuan sehingga mendapatkan total harga
