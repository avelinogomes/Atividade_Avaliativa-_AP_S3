public class Invoice {
    private int number;
    private String description;
    private int quantityInStock;
    private double pricePerIten;

    // Construtor
    public Invoice(){}
    public Invoice(int number, String description, int quantityInStock, double pricePerIten){
        this.number = number;
        this.description = description;
        setQuantityInStock(quantityInStock);
        setPricePerIten(pricePerIten);
    }

    // Getters e Setters
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            this.quantityInStock = 0;
        } else {
            this.quantityInStock = quantityInStock;
        }
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public void setPricePerIten(double pricePerIten) {
        if (pricePerIten < 0) {
            this.pricePerIten = 0;
        } else {
            this.pricePerIten = pricePerIten;
        }
    }
    public double getPricePerIten() {
        return pricePerIten;
    }

    // Meus outros métodos
    public double getInvoiceAmount(){
        return quantityInStock * pricePerIten;
    }

    public String toString(){
        return String.format("Number: %d | Description: %s | Quantity: %d | Price: %.2f | Invoice: %.2f", number, description, quantityInStock, pricePerIten, getInvoiceAmount());
    }

}
