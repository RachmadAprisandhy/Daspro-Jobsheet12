import java.util.Scanner;

public class TugasNo1 {

 
    public static void recursive(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        recursive(n - 1);
    }

    public static void iterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan angka yang ingin dihitung: ");
        int n = scanner.nextInt();
        System.out.println("Penghitungan rekursifnya adalah:");
        recursive(n);
        System.out.println("Penghitungan iteratifnya adalah:");
        iterative(n);

        scanner.close();
    }
}