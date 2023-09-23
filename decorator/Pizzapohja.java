package decorator;

public class Pizzapohja implements Pizza {

    private double price = 3.0;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String description() {
        return "Crust";
    }
    
}
