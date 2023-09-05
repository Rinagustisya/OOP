package collection;
import java.util.ArrayList;
public class Collection {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Siswa>list1 = new ArrayList<Siswa>();
        for(int i=0; i <10; i++) {
            list1.add(new Siswa("Siswa" + i));
        }
        for(int i=0; i< list1.size();i++) {
            System.out.println(list1.get(i).nama);
        }
    }
    
}
class Siswa{
    public String nama;
    public Siswa(String nama) {
        this.nama=nama;
    }
}
