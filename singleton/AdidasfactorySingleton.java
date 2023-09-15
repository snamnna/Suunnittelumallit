package singleton;

public class AdidasfactorySingleton {
    
    private static Adidasfactory instance;

    //Yksityinen konstruktori, ei voi luoda ilmentymää muualta
    private AdidasfactorySingleton() {

    }

    public static synchronized Adidasfactory getInstance() {
        if (instance == null) {
            instance = new Adidasfactory();
        }
        return instance;
    }

}
