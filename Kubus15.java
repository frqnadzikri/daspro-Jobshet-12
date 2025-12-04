import java.util.Scanner;

public class Kubus15 {
    
    // Fungsi menghitung volume kubus
    static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    
    // Fungsi menghitung luas permukaan kubus
    static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        
        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);
        
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        
        input.close();
    }
}
