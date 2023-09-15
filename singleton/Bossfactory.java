package singleton;

public class Bossfactory implements ClothingFactory{

    private static Bossfactory instance;

    //Private konstruktori
    private Bossfactory(){

    }

    public static synchronized Bossfactory getInstance() {
        if (instance == null) {
            instance = new Bossfactory();
        }
        return instance;
    }

    @Override
    public Clothing createJeans() {
        return new BossJeans();
    }

    @Override
    public Clothing createTshirt() {
        return new BossTshirt();
    }

    @Override
    public Clothing createCap() {
       return new BossCap();
    }

    @Override
    public Clothing createShoes() {
        return new BossShoes();
    }
    
}
