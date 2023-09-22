package decorator;

public class Pizzapohja implements Pizza {
    private String pizzaNimi;
    private static final double POHJAHINTA = 3.0; 

    public Pizzapohja(String pizzaNimi) {
        this.pizzaNimi = pizzaNimi;
    }

    @Override
    public double getPrice() {
        return POHJAHINTA;
    }

    @Override
    public String toString() {
        return pizzaNimi + " (" + POHJAHINTA + " euroa)";
    }
}
