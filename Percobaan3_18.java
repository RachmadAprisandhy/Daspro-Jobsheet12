import java.util.Scanner;

public class Percobaan3_18{

    static double HitungLaba (double saldo,int tahun){
        if ( tahun == 0){
            return(saldo);
        }else{
            return(1.11 *HitungLaba(saldo, tahun -1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double SaldoAwal;
        int Tahun;


        System.out.print("Jumlah Saldo Awal : ");
        SaldoAwal = sc.nextDouble();
        System.out.print("Lamanya Inevstasi (Tahun) : ");
        Tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + Tahun + "Tahun : ");
        System.out.print(HitungLaba(SaldoAwal, Tahun));
    }
}