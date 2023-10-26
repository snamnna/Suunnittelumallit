package memento;

public class Main {
    public static void main(String[] args) {
        
        int playerCount = 5;
        Riddler r = new Riddler(playerCount);
        Memento memento = r.liityPeliin();

        for (int i = 0; i < playerCount; i++) {
            Thread asiakasThread = new Thread(new Player(r, memento, i));
            asiakasThread.start();
        }
    }
}
