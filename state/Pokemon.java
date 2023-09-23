package state;

public class Pokemon {
    //Tämä luokka pitää sisällään tämänhetkisen tilan
    private PokemonState currentState;

    //Kun pokemon luodaan, ollaan ensimmäinen pokemon muoto
    public Pokemon() {
        currentState = new Charmander();
        System.out.println("It's Charmander!!");
    }

    public void setState(PokemonState newState){
        currentState = newState;
    }

    public void attack() {
        currentState.attack();
        currentState = currentState.nextState();
        System.out.println();
    }

    public void move() {
        currentState.move();
    }

    public void tellColor() {
        currentState.tellColor();
    }
}
