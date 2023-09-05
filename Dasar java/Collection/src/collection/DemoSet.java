package collection;
import java.util.ArrayList;
import java.util.HashSet;
public class DemoSet {
    public static void main(String[] args) {
        HashSet<Guru>set= new HashSet<Guru>();
        ArrayList<Guru>list= new ArrayList<Guru>();
        
        Guru a= new Guru("Winarsih");
        Guru b= new Guru("Fauziah");
        Guru c= new Guru("Winarsih");
        Guru d= new Guru("Sutikman");
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        
        System.out.println("Print Set");
        for(Guru h:set){
            System.out.println(h.nama);
        }
        
        System.out.println("Print List");
        for(Guru h:list) {
            System.out.println(h.nama);
        }
    }
    
}

class Guru{
    public String nama;
    public Guru(String nama) {
        this.nama = nama;
    }
    
    @Override
    public boolean equals(Object obj) {
    if(!(obj instanceof Guru)) {
        return super.equals(obj);
    }else{
        Guru comp =(Guru)obj;
        return comp.hashCode() == obj.hashCode();
        }
    }
        
        
    @Override
    public int hashCode() {
    int hash = 7;
    hash = 53 * hash+(this.nama != null? this.nama.hashCode():0);
    return hash;
    }
   }
