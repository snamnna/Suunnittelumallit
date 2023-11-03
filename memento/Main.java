package memento;

public class Main {
    public static void main(String[] args) {
        int playerCount = 5;
        Riddler r = new Riddler(playerCount);

        for (int i = 0; i < playerCount; i++) {
            Thread playerThread = new Thread(new Player(r, i));
            playerThread.start();
        }
    }
}