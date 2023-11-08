package visitor;

public class Main {
    // Muistiin: Pääohjelma ei saa muuttaa tilaa, "tekee vain temppuja"
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 3; i++) {
            pokemon.move();
            pokemon.tellColor();
            pokemon.attack();
        }

        pokemon.accept(new BonusPointsVisitor());
    }
}
