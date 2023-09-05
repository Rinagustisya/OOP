package latihan;
public class KeywordThrow {
    static void validasi (int usia) {
        if(usia<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("Selamat Memilih");
    }
    public static void main(String args[]) {
        validasi(17);
        System.out.println("Akhir kode program..");
    }
}
