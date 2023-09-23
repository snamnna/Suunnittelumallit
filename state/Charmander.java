package state;

public class Charmander implements PokemonState{

    @Override
    public void attack() {
        System.out.println("Charmander uses Ember!");
    }

    @Override
    public PokemonState nextState() {
        System.out.println("Charmander evolves into Charmeleon!");
        return new Charmeleon();
    }

    @Override
    public void move() {
        System.out.println("I'm walking with my tiny legs.");
    }

    @Override
    public void tellColor() {
        System.out.println("I'm light orange.");
    }
    
}
