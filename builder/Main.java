package builder;

public class Main {

    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        BurgerBuilder MBuilder = new McDonaldsBuilder();
        BurgerBuilder HBuilder = new HesburgerBuilder();

        director.buildSmallBurger(MBuilder);
        String McDonaldsSmall = MBuilder.getBurgir();
        System.out.println("Small burger ready : " + McDonaldsSmall + "but icecream machine broken!");

        director.buildBigBurger(HBuilder);
        String HesburgerBig = HBuilder.getBurgir();
        System.out.println("Big burger ready: " + HesburgerBig + "!");

    }
}
