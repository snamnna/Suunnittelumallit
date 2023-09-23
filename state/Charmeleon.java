package state;

public class Charmeleon implements PokemonState{

    @Override
    public void attack() {
        System.out.println("Charmeleon uses Fireball!");
    }

    @Override
    public PokemonState nextState() {
        System.out.println("Charmeleon evolves into Charizard!");
        return new Charizard();
    }

    @Override
    public void move() {
        System.out.println("My legs are little bit bigger now.");
    }

    @Override
    public void tellColor() {
        System.out.println("I'm more red than orange.");
    }
    
}
