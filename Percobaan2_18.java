import java.util.Scanner;
public class Percobaan2_18{

    static int hitungPangkat(int x,int y){
        if ( y == 0){
            return(1);
        }else{
            return(x *hitungPangkat(x, y -1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan,pangkat;

        System.out.print("Bilangan Yang Dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("pangkat : ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}