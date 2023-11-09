package builder;

public class McDonaldsBuilder implements BurgerBuilder {

    private StringBuilder burgir;

    public McDonaldsBuilder() {
        burgir = new StringBuilder();
    }

    @Override
    public void addPatty() {
        burgir.append("McPatty ");
    }

    @Override
    public void addSalad() {
        burgir.append("McSalad ");
    }

    @Override
    public void addDoubleCheese() {
        burgir.append("McDoubleCheese ");
    }

    @Override
    public void addBun() {
        burgir.append("McBun ");
    }

    @Override
    public String getBurgir() {
        return burgir.toString();
    }

}
