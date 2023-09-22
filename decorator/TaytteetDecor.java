package decorator;

public class TaytteetDecor implements Pizza {
    private Pizza pizza;
    private String täyteNimi;
    private double hinta;

    public TaytteetDecor(Pizza pizza, String täyteNimi, double hinta) {
        this.pizza = pizza;
        this.täyteNimi = täyteNimi;
        this.hinta = hinta;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + hinta;
    }

    @Override
    public String toString() {
        return pizza.toString() + ", " + täyteNimi + " (" + hinta + " euroa)";
    }
}