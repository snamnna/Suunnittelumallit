package decorator;

public class SausageDecor extends PizzaDecor{
    
    public SausageDecor(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.6;
    }

    @Override
    public String description() {
        return pizza.description() + " Sausage";
    }

}
