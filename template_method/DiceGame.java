package template_method;

import java.util.Random;

public class DiceGame extends Game{

    // Pelin säännöt - se ei automaattisesti voita joka saa ensimmäisenä 100, kierros pelataan aina loppuun ja jos monta saa samalla
    //kierroksella 100 tai yli, tulee tasapeli.
    private int[] scores;
    private int scoreToWin;
    private int currentPlayer;

    @Override
    void initializeGame() {
        scores = new int[playerCount];
        scoreToWin = 100;
        currentPlayer = 1;
    }
    @Override
    void play(int playerNro) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;
        scores[playerNro - 1] += diceRoll;
        System.out.println("Player " + playerNro + " got " + diceRoll + " with their dice!");
        System.out.println("Player " + playerNro + " has now " + scores[playerNro - 1] + " points.");
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
        int winner = -1;
        for (int i = 0; i < scores.length; i++){
            if(scores[i] >= scoreToWin) {
                if(winner == -1){
                    winner = i + 1;
                } else { 
                    // Jos molemmat pääsevät yli satasen samalla kierroksella
                    System.out.println("It's a draw!");
                    return;
                }
            }
        }
        if(winner != -1) {
            System.out.println("Congratulations for player number " + winner + ", they won!");
        
        }
    }    
 }
