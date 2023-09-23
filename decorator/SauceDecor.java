package decorator;

public class SauceDecor extends PizzaDecor{
    
    public SauceDecor(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.0;
    }

    @Override
    public String description() {
        return pizza.description() + " Sauce";
    }

}
