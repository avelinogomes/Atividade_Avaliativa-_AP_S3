import java.util.Locale;

public class App1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(1.5);
        System.out.println(quadrado.toString());
    }
}
