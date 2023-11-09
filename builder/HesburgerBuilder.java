package builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder implements BurgerBuilder {

    private List<Ingredient> ingredients;

    public HesburgerBuilder() {
        ingredients = new ArrayList<>();
    }

    @Override
    public void addPatty() {
        ingredients.add(new Patty("200g patty "));
    }

    @Override
    public void addSalad() {
        ingredients.add(new Salad("Ice Salad "));
    }

    @Override
    public void addDoubleCheese() {
        ingredients.add(new DoubleCheese("Double cheese "));
    }

    @Override
    public void addBun() {
        ingredients.add(new Bun("Brioche bun "));
    }

    @Override
    public String getBurgir() {
        StringBuilder burgir = new StringBuilder();
        for (Ingredient i : ingredients) {
            burgir.append(i.toString());
        }
        return burgir.toString();
    }

}
