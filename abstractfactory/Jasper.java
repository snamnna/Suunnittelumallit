package abstractfactory;

public abstract class Jasper extends Adidasfactory{
    Jeans jeans = null;
    Tshirt tshirt = null;
    Cap cap = null;
    Shoes shoes = null;

    public abstract Jeans createJeans();
    public abstract Tshirt createTshirt();
    public abstract Cap createCap();
    public abstract Shoes createShoes();

    public void pukeutua(){
        if (jeans == null){
            jeans = createJeans();
            System.out.println("I have " + jeans + " jeans!");
        }
    }
}
