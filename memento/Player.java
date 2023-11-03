package memento;

import java.util.Random;

public class Player implements Runnable {

    private final Riddler riddler;
    private final int playerIndex;

    public Player(Riddler r, int playerIndex) {
        this.riddler = r;
        this.playerIndex = playerIndex;
    }

    @Override
    public void run() {
        Riddler.Memento memento = riddler.liityPeliin();
        Random random = new Random();
        boolean correctGuess = false;

        while (!correctGuess) {
            int guess = random.nextInt(10);
            correctGuess = riddler.guess(memento, guess);

            if (correctGuess) {
                System.out.println("Player number " + playerIndex + " guessed correctly!");
            } else {
                System.out.println("Try again player number " + playerIndex + ", your guess " + guess + " is not right.");
            }
        }
    }
}
