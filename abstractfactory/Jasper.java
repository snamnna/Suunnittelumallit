package abstractfactory;

public abstract class Jasper {
    public static void main(String[] args) {

        //HUOM, modulaarisuus Boss vaatteisiin vaihtamalla onnistuu muokkaamalla vain Adidasfactory --> Bossfactory

        //Ensin jasper pueutuu adidas vaatteisiin, luodaan tehdas
        ClothingFactory factory = new Adidasfactory();

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
