import java.util.Scanner;

public class RekapPenjualanCafe15 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7];
    
    // Fungsi untuk menginput data penjualan
    static void inputData(Scanner input) {
        System.out.println("Masukkan data penjualan:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }
    
    // Fungsi untuk menampilkan data dalam bentuk tabel
    static void tampilTabel() {
        System.out.println("\n=== REKAP PENJUALAN CAFE ===");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Hari " + i + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.print(menu[i]);
            if (menu[i].length() < 8) System.out.print("\t");
            System.out.print("\t");
            
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    
    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    static void tampilMenuTertinggi() {
        int maxTotal = 0;
        int indexMenu = 0;
        
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
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
    static void tampilRataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / 7;
            System.out.printf("%-15s: %.2f\n", menu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memanggil fungsi-fungsi
        inputData(input);
        tampilTabel();
        tampilMenuTertinggi();
        tampilRataRata();
        
        input.close();
    }
}