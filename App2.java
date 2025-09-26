import java.util.Locale;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Circunferencia c = new Circunferencia();

        System.out.print("Digite o raio da circunferencia: ");
        c.setRaio(input.nextDouble());

        System.out.println(c.toString());
        input.close();
    }
}
