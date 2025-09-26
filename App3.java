import java.util.Locale;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Temperatura temp = new Temperatura();

        System.out.print("Temperatura atual em Celsius: ");
        temp.setTempCelsius(input.nextDouble());

        // Temperatura convertida de Celsius para Fahrenheit
        System.out.println("Em Fahrenheit: "+Temperatura.celsiusToFarenheit(temp.getTempCelsius()));

        // Temperatura convertida de Celsius para Kelvin
        System.out.println("Em Kelvin: "+Temperatura.celsiusToKelvin(temp.getTempCelsius()));

        input.close();
    }
}
