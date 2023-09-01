package composite;

public class PC {
    public static void main(String[] args) {

        Laiteosa prossu = new Prossu();
        Laiteosa muisti = new Muistipiiri();
        Laiteosa gpu = new GPU();
        Laiteosa verkkokortti = new Verkkokortti();

        //Lisätään laiteosat emolevyyn
        Emolevy emolevy = new Emolevy();
        emolevy.lisaaLaiteosa(prossu);
        emolevy.lisaaLaiteosa(muisti);
        emolevy.lisaaLaiteosa(gpu);
        emolevy.lisaaLaiteosa(verkkokortti);

        //Lisätään emolevy koteloon
        Kotelo kotelonSisus = new Kotelo();
        kotelonSisus.lisaaLaiteosa(emolevy);

        double kokoHinta = kotelonSisus.haeHinta();
        System.out.println("PC:n kokonaishinta on " + kokoHinta);
    }
}
