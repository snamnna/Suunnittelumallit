package memento;

import java.util.Random;

public class Player implements Runnable{

    private final Riddler riddler;
    private final Riddler.Memento memento;
    private final int playerIndex;
    private boolean gameOver;

    public Player(Riddler r, Riddler.Memento memento, int playerIndex){
        this.riddler = r;
        this.memento = memento;
        this.playerIndex = playerIndex;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (!gameOver) {
            int guess = random.nextInt(10);
            gameOver = riddler.guess(memento, guess, playerIndex);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
