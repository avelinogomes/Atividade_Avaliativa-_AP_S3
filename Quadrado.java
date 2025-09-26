public class Quadrado{
    private double lado;

    // Construtor
    public Quadrado(){}

    public void setLado(double lado){
        if (lado < 0) throw new RuntimeException("Lado inválido");
        this.lado = lado;
    }

    public double area(){
        return lado * lado;
    }

    // toSring
    public String toString(){
        return String.format("Lado: %.2f | Area: %.2f", lado, area());
    }

}
