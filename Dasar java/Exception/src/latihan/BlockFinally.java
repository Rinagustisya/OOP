package latihan;
import java.util.Scanner;
public class BlockFinally {
    public static void main(String[] args) {
        try {int A, B;
        double C;
        Scanner sc = new Scanner(System.in);
            System.out.println("Nilai A = ");
            A = sc.nextInt();
            System.out.println("Nilai B = ");
            B =sc.nextInt();
            C = A/B;
            System.out.println("Nilai A/B = " + C);
        }
        catch(Exception e) {
            System.out.println("Ada Kesalahan");
            System.out.println("Tipe kesalahannya adalah" + e.getMessage());
        }
        // block finally
        finally{System.out.println("Block Finaly selalu dieksekusi");}
    }
}

