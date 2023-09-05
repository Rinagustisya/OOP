package latihan;
import java.util.Scanner;
public class ProgramException {
    public static void main(String[] args) {
        try {int A, B;
        double C;
        Scanner sc = new Scanner(System.in);
            System.out.println("Nilai A = ");
            A = sc.nextInt();
            System.out.println("Nilai B = ");
            B =sc.nextInt();
            System.out.println("Nilai C = ");
            C =A*B;
            System.out.println("hasilnya = " + C);
        }
        catch(Exception e) {
            System.out.println("Ada Kesalahan");
            System.out.println("Tipe kesalahannya adalah" + e.getMessage());
        }
        finally{System.out.println("Block Finaly selalu dieksekusi");}
    }
}
