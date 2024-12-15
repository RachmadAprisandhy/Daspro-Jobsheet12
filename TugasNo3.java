import java.util.Scanner;
public class TugasNo3 {
    static int Deretfibonansi(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Deretfibonansi(n - 1) + Deretfibonansi(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan yang ingin anda cari: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Bulan ke-n harus lebih besar atau sama dengan 1.");
        } else {
            int jumlahPasangan = Deretfibonansi(n);
            System.out.println("Jumlah pasangan marmut pada bulan ke-" + n + " adalah: " + jumlahPasangan);
        }

        sc.close();
    }
    }
    