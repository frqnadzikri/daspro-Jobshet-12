import java.util.Scanner;

public class Kafe15 {
    
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    
    public static int hitungDiskon(int totalHarga, String kodePromo) {
        int totalSetelahDiskon = totalHarga;
        
        if (kodePromo.equals("DISKON50")) {
            System.out.println("\nAnda mendapat diskon 50%!");
            totalSetelahDiskon = totalHarga - (totalHarga * 50 / 100);
            System.out.println("Diskon: Rp" + (totalHarga * 50 / 100));
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("\nAnda mendapat diskon 30%!");
            totalSetelahDiskon = totalHarga - (totalHarga * 30 / 100);
            System.out.println("Diskon: Rp" + (totalHarga * 30 / 100));
        } else if (!kodePromo.isEmpty()) {
            System.out.println("\nKode promo invalid. Tidak ada pengurangan total harga.");
        }
        
        return totalSetelahDiskon;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Menu("Andi", true);
        
        String[] namaMenu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
        int totalKeseluruhan = 0;
        
        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenisMenu = sc.nextInt();
        
        System.out.println("\n===== INPUT PESANAN =====");
        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.println("\nPesanan ke-" + i + ":");
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            
            int harga = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += harga;
            
            System.out.println("→ " + namaMenu[pilihanMenu - 1] + " x" + banyakItem + " = Rp" + harga);
        }
        
        sc.nextLine(); // Consume newline
        System.out.print("\nMasukkan kode promo (atau tekan Enter jika tidak ada): ");
        String kodePromo = sc.nextLine();
        
        System.out.println("\n===== RINGKASAN PESANAN =====");
        System.out.println("Total harga sebelum diskon: Rp" + totalKeseluruhan);
        
        int totalAkhir = hitungDiskon(totalKeseluruhan, kodePromo);
        
        System.out.println("Total yang harus dibayar: Rp" + totalAkhir);
        System.out.println("=============================");
        
        sc.close();
    }
}