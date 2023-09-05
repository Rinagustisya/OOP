package contohinterface1;
public class ContohInterface1 implements ContohInterface, interface3{
    public static void main(String[] args) {
        // TODO code application logic here
        ContohInterface1 ps = new ContohInterface1();
        ps.tampilPesanPertama();
        ps.tampilPesanKedua();
        ps.penutup();
        ps.salam();
    }
    @Override
    public void tampilPesanPertama() {
        System.out.println("Tampilan Pesan Pertama");
    }
    @Override
    public void tampilPesanKedua() {
        System.out.println("Tampilan Pesan Kedua");
    }
    @Override
    public void penutup() {
        System.out.println("Terimakasih atas perhatiannya");
    }
    @Override
    public void salam() {
        System.out.println("Sampai Jumpa");
    }
}
