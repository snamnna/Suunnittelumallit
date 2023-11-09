package builder;

public class BurgerDirector {

    public void buildSmallBurger(BurgerBuilder builder) {
        builder.addBun();
        builder.addPatty();
        builder.addDoubleCheese();
    }

    public void buildBigBurger(BurgerBuilder builder) {
        builder.addBun();
        builder.addPatty();
        builder.addPatty();
        builder.addDoubleCheese();
        builder.addSalad();
    }
}
