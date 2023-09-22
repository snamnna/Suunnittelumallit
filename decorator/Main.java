package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new TaytteetDecor(new TaytteetDecor(new TaytteetDecor(new Pizzapohja("Pohja"), "Kinkku", 2.0), "Ananas", 1.5), "Aurajuusto", 3.0);
        Pizza pizza2 = new TaytteetDecor(new TaytteetDecor(new TaytteetDecor(new Pizzapohja("Pohja"), "Katkarapu", 3.5), "Rucola", 1.5), "Kurkku", 0.5);

        // Tulostetaan pizzat ja niiden hinnat
        System.out.println("Pizza 1: " + pizza1);
        System.out.println("Hinta: " + pizza1.getPrice() + " euroa\n");

        System.out.println("Pizza 2: " + pizza2);
        System.out.println("Hinta yhteensä: " + pizza2.getPrice() + " euroa\n");
    }
}