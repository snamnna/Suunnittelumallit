package state;

public interface PokemonState {
    void attack();
    void move();
    void tellColor();
    PokemonState nextState();
}
