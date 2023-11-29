package Matalakopiointi;

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

            // Tässä huomataan että matalakopioinnin takia aika pysyy samana, sillä molemmat
            // viisarit viittaavat edelleen samaan muistipaikkaan, ne molemmat muuttuvat kun
            // alkuperäistä muutetaan
            System.out.println("Aika alkuperäisessä kellossa muutoksen jälkeen: ");
            alkuperainenKello.tulostaAika();
            System.out.println("Aika kloonatussa kellossa alkuperäisen kellon muutoksen jälkeen: ");
            klooniKello.tulostaAika();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
