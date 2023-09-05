package membuataplikasiclasslibrary;
import javax.swing.JOptionPane;
import java.lang.Math;
public class MembuatAplikasiClassLibrary {
    public static void main(String[] args) {
        // TODO code application logic here
        String input= JOptionPane.showInputDialog(null, "Masukan Nilai sudut dalam bentuk derajat");
        
        double degree = Double.parseDouble(input);
        
        double radians = Math.toRadians(degree);
        double a = Math.sin(radians);
        double r = Math.cos(radians);
        
        JOptionPane.showMessageDialog(null, "Nilai Sudut : \n"+degree + "\n Hasil Sinus :" + a + "\n Hasil Cosinus :" + r);
    }
    
}
