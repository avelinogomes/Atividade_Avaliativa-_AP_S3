public class Temperatura {
    private double tempCelsius;

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }
    public double getTempCelsius() {
        return tempCelsius;
    }

    // Construtor
    public Temperatura(){}

    public static double celsiusToFarenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

}
