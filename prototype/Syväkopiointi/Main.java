package Syväkopiointi;

public class Main {
    public static void main(String[] args) {
        try {
            Kello alkuperainenKello = new Kello(06, 14);
            Kello klooniKello = alkuperainenKello.clone();

            System.out.println("Aika alkuperäisessä kellossa: ");
            alkuperainenKello.tulostaAika();
            System.out.println("Aika kloonatussa kellossa: ");
            klooniKello.tulostaAika();

            alkuperainenKello.setAika(23, 42);

            System.out.println("Aika alkuperäisessä kellossa muutoksen jälkeen: ");
            alkuperainenKello.tulostaAika();
            System.out.println("Aika kloonatussa kellossa alkuperäisen kellon muutoksen jälkeen: ");
            klooniKello.tulostaAika();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
