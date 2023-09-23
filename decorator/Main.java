package decorator;

public class Main {
    public static void main(String[] args) {
        
        Pizza pizza1 = new SauceDecor(new SausageDecor(new BluecheeseDecor(new Pizzapohja())));
        Pizza pizza2 = new SauceDecor(new CheeseDecor(new BluecheeseDecor(new Pizzapohja())));
        Pizza pizza3 = new SauceDecor(new CheeseDecor(new CheeseDecor(new Pizzapohja())));

        System.out.println("Pizza menu:");
        System.out.println("1. " + pizza1.description() + ", price: " + pizza1.getPrice() + " euros");
        System.out.println("2. " + pizza2.description() + ", price: " + pizza2.getPrice() + " euros");
        System.out.println("3. " + pizza3.description() + ", price: " + pizza3.getPrice() + " euros");

    }
}