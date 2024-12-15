import java.util.Scanner;

public class TugasNo2 {
    static int Rekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Rekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = sc.nextInt();

        if (x < 1) {
            System.out.println("Nilai x harus lebih besar dari angka 0.");
        } else {
            int hasil = Rekursif(x);
            System.out.println("Penjumlahan bilangan dari 1 hingga " + x + " adalah: " + hasil);
        }

        sc.close(); 
    }
}