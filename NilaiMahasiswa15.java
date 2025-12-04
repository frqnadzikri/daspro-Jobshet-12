import java.util.Scanner;

public class NilaiMahasiswa15 {
    
    // Fungsi untuk mengisi array
    static void isianArray(int[] nilai, Scanner input) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }
    
    // Fungsi untuk menampilkan array
    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }
    
    // Fungsi untuk menghitung total nilai
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();
        
        int[] nilaiMahasiswa = new int[N];
        
        // Memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa, input);
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        
        input.close();
    }
}
