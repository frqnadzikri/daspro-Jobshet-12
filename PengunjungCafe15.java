public class PengunjungCafe15 {

    // Method menggunakan for-each loop
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        System.out.println(); // jarak output
    }

    public static void main(String[] args) {

        // Pemanggilan sesuai instruksi praktikum
        daftarPengunjung("Ali", "Budi", "Citra");

        daftarPengunjung("Andi");

        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

