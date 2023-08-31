package abstractfactory;

public interface AbstractFactory {
    public abstract Jeans createJeans();
    public abstract Tshirt createTshirt();
    public abstract Cap createCap();
    public abstract Shoes createShoes();
}
