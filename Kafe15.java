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
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        
        // Cek kode promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapat diskon 50%!");
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapat diskon 30%!");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid. Tidak ada pengurangan total harga.");
        }
        
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Menu("Andi", true);
        
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.print("Masukkan kode promo (atau tekan Enter jika tidak ada): ");
        String kodePromo = sc.nextLine();
        
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        
        System.out.println("\nTotal harga untuk pesanan Anda: Rp" + totalHarga);
        
        sc.close();
    }
}