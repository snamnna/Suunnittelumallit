package memento;

import java.util.Random;

public class Riddler {

    private int playerCount;

    public Riddler(int playerCount) {
        this.playerCount = playerCount;
    }

    public Memento liityPeliin() {
        Random rand = new Random();
        int number = rand.nextInt(10);
        return new Memento(number);
    }

    public synchronized boolean guess(Memento memento, int guess) {
        boolean correctGuess = guess == memento.getNumber();

        if (correctGuess) {
            return true;
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }

    public class Memento {
        private final int number;

        public Memento(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
}