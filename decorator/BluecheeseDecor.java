package decorator;

public class BluecheeseDecor extends PizzaDecor{

    public BluecheeseDecor(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.5;
    }

    @Override
    public String description() {
        return pizza.description() + " Blue cheese";
    }
    
}
