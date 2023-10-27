package memento;

import java.util.Random;

public class Riddler {

    private int correctGuesses = 0;
    private final int playerCount;
    private final int[] playerGuesses;

    public Riddler(int playerCount){
        this.playerCount = playerCount;
        this.playerGuesses = new int[playerCount];
    }

    public class Memento {
        //Tänne tallennetaan arvottu luku, sama kun luennolla keltainen lappu
        private int number;
    
        public Memento(int number){
            this.number = number;
        }
    
        public int getNumber(){
            return number;
        }
    }
    
    public Memento liityPeliin(){

        Random rand = new Random();
        int number = rand.nextInt(10);
        Memento m = new Memento(number);
        return m;
    }

    public synchronized boolean guess(Memento memento, int guess, int playerIndex) {

        if (guess == memento.getNumber()) {
            correctGuesses += 1;
            playerGuesses[playerIndex] = correctGuesses;
            System.out.println("Player number " + playerIndex + " guessed correctly!");
            if(correctGuesses == playerCount){
                System.out.println("Game finished, everyone guessed right!");
                return true;
        }
            return true;
        } else {
                System.out.println("Try again player number " + playerIndex + ", your guess " + guess + " is not right.");
                return false;
        }

        
            
    }
}
