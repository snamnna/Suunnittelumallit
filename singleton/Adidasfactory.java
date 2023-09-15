package singleton;

public class Adidasfactory implements ClothingFactory{

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
