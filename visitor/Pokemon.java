package visitor;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    // Tämä luokka pitää sisällään tämänhetkisen tilan
    private PokemonState currentState;
    private int currentStateIndex;
    private List<PokemonState> pokemonStates;

    // Kun pokemon luodaan, ollaan ensimmäinen pokemon muoto
    public Pokemon() {
        pokemonStates = new ArrayList<>();
        pokemonStates.add(new Charmander());
        pokemonStates.add(new Charmeleon());
        pokemonStates.add(new Charizard());
        currentStateIndex = 0;
        currentState = new Charmander();
        System.out.println("It's Charmander!!");
    }

    public void setState(PokemonState newState) {
        currentState = newState;
    }

    public void attack() {
        currentState.attack();
        currentState = currentState.nextState();
        System.out.println();
        currentStateIndex = (currentStateIndex + 1) % pokemonStates.size();
    }

    public void move() {
        currentState.move();
    }

    public void tellColor() {
        currentState.tellColor();
    }

    public void accept(BonusVisitor visitor) {
        for (PokemonState state : pokemonStates) {
            state.accept(visitor);
        }
    }

}
