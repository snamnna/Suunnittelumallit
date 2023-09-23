package decorator;

public abstract class PizzaDecor implements Pizza {

    protected Pizza pizza;

    public PizzaDecor(Pizza pizza){
        this.pizza = pizza;
    }

}
