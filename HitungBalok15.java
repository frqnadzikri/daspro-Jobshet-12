import java.util.Scanner;

public class HitungBalok15 {

    // Fungsi menghitung luas
    static int hitungLuas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    // Fungsi menghitung volume (menggunakan fungsi luas)
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        input.close();
    }
}
