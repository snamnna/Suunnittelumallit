package singleton;

public abstract class Jasper {
    public static void main(String[] args) {

        //HUOM, modulaarisuus Boss vaatteisiin vaihtamalla onnistuu muokkaamalla vain Adidasfactory --> Bossfactory

        //Ensin jasper pueutuu adidas vaatteisiin
        //Ei luoda tehdasta singletonissa, vaan haetaan instanssi
        ClothingFactory factory = AdidasfactorySingleton.getInstance();

        //Pukeutuminen
        Clothing jeans = factory.createJeans();
        Clothing tshirt = factory.createTshirt();
        Clothing cap = factory.createCap();
        Clothing shoes = factory.createShoes();

        System.out.println("I'm wearing: ");
        System.out.println(jeans);
        System.out.println(tshirt);
        System.out.println(cap);
        System.out.println(shoes);
    }
}
