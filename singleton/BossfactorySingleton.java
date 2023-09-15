package singleton;

public class BossfactorySingleton {
    
    private static Bossfactory instance;

    //Yksityinen konstruktori, ei voi luoda ilmentymää muualta
    private BossfactorySingleton() {

    }

    public static synchronized Bossfactory getInstance() {
        if (instance == null) {
            instance = new Bossfactory();
        }
        return instance;
    }

}
