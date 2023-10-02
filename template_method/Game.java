package template_method;

abstract class Game {

    //Muistiinpano itselle: Huom, näitä metodeita käytetään jo tässä luokassa,
    //vaikkei niistä ole toteutusta - se tehdään aliluokassa

    protected int playerCount;

    // Alustetaan peli
    abstract void initializeGame();

    abstract void play(int playerNro);

    abstract boolean gameFinished();

    abstract void winner();

    //Tätä ei haluta muuttaa muualta (yleinen toiminta kaikille peleille)
    public final void playRound(int playerCount) {
        this.playerCount = playerCount;
        initializeGame();
        int currentPlayer = 1;
        while(!gameFinished()){
            play(currentPlayer);
            currentPlayer = (currentPlayer % playerCount) + 1;
        }
        winner();
    }
}
