public class Circunferencia {
    private double raio;
    final double PI = 3.14159;

    // Construtor
    public Circunferencia(){}

    // Getter e Setter
    public void setRaio(double raio) {
        if (raio < 0) throw new RuntimeException("Raio inválido");
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    public double calcularArea(){
        return PI * (raio * raio);
    }

    // toString
    public String toString(){
        return String.format("Raio: %.2f | Area: %.2f",raio,calcularArea());
    }
}
