import java.util.Scanner;

public class RekapPenjualanCafeDinamis15 {
    
    // Fungsi untuk menginput data penjualan
    static void inputData(String[] menu, int[][] penjualan, Scanner input) {
        System.out.println("Masukkan data penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }
    
    // Fungsi untuk menampilkan data dalam bentuk tabel
    static void tampilTabel(String[] menu, int[][] penjualan) {
        System.out.println("\n=== REKAP PENJUALAN CAFE ===");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= penjualan[0].length; i++) {
            System.out.print("Hari " + i + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);
            if (menu[i].length() < 8) System.out.print("\t");
            System.out.print("\t");
            
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    
    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    static void tampilMenuTertinggi(String[] menu, int[][] penjualan) {
        int maxTotal = 0;
        int indexMenu = 0;
        
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            
            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }
        
        System.out.println("\n=== MENU PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexMenu]);
        System.out.println("Total Penjualan: " + maxTotal);
    }
    
    // Fungsi untuk menampilkan rata-rata penjualan per menu
    static void tampilRataRata(String[] menu, int[][] penjualan) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.printf("%-15s: %.2f\n", menu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah menu dan jumlah hari
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();
        input.nextLine(); // consume newline
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = input.nextInt();
        
        // Inisialisasi array
        String[] menu = new String[jumlahMenu];
        int[][] penjualan = new int[jumlahMenu][jumlahHari];
        
        // Input nama menu
        input.nextLine(); // consume newline
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();
        }
        
        // Memanggil fungsi-fungsi
        inputData(menu, penjualan, input);
        tampilTabel(menu, penjualan);
        tampilMenuTertinggi(menu, penjualan);
        tampilRataRata(menu, penjualan);
        
        input.close();
    }
}
