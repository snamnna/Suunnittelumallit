package template_method;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }
    @Override
    boolean gameFinished() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gameFinished'");
    }
    @Override
    void winner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'winner'");
    }

    
 }
