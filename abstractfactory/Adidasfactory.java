package abstractfactory;

public class Adidasfactory implements AbstractFactory{

    @Override
    public Jeans createJeans() {
        return new Jeans();
    }

    @Override
    public Tshirt createTshirt() {
        return new Tshirt();
    }

    @Override
    public Cap createCap() {
       return new Cap();
    }

    @Override
    public Shoes createShoes() {
        return new Shoes();
    }
    
    
}
