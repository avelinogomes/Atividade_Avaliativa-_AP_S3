import java.util.Locale;

public class App4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Invoice p1 = new Invoice(1, "Notebook", 2, 2000);
        Invoice p2 = new Invoice(1, "Notebook", -2, 2000);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
