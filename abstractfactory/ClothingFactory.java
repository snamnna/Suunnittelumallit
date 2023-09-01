package abstractfactory;

public interface ClothingFactory {
    public abstract Clothing createJeans();
    public abstract Clothing createTshirt();
    public abstract Clothing createCap();
    public abstract Clothing createShoes();
}
