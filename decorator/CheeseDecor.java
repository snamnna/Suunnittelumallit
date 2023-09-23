package decorator;

public class CheeseDecor extends PizzaDecor{
    
    public CheeseDecor(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.5;
    }

    @Override
    public String description() {
        return pizza.description() + " Regular cheese";
    }

}
