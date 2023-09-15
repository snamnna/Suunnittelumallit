package singleton;

public class Adidasfactory implements ClothingFactory{

    private static Adidasfactory instance;

    //Private konstruktori
    private Adidasfactory(){

    }

    public static synchronized Adidasfactory getInstance() {
        if (instance == null) {
            instance = new Adidasfactory();
        }
        return instance;
    }

    @Override
    public Clothing createJeans() {
        return new AdidasJeans();
    }

    @Override
    public Clothing createTshirt() {
        return new AdidasTshirt();
    }

    @Override
    public Clothing createCap() {
       return new AdidasCap();
    }

    @Override
    public Clothing createShoes() {
        return new AdidasShoes();
    }
    
    
}
