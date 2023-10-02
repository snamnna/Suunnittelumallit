package template_method;

import java.util.Random;

public class DiceGame extends Game{
    private int[] scores;
    private int scoreToWin;
    private int currentPlayer;

    @Override
    void initializeGame() {
        scores = new int[playerCount];
        scoreToWin = 100;
        currentPlayer = 0;
    }
    @Override
    void play(int playerNro) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;
        scores[playerNro] += diceRoll;
        System.out.println("Player " + playerNro + " got " + diceRoll + " with their dice!");
    }
    @Override
    boolean gameFinished() {
        for(int score : scores) {
            if (score > scoreToWin){
                return true;
            }
        }
        return false;
    }
    @Override
    void winner() {
        
    }

    
 }
