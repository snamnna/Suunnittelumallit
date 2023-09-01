package abstractfactory;

public class Bossfactory implements ClothingFactory{

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
