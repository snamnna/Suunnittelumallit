package visitor;

public class BonusPointsVisitor implements BonusVisitor {

    @Override
    public void visitCharmander(Charmander charmander) {
        System.out.println("10 bonus points for Charmander!");
    }

    @Override
    public void visitCharmeleon(Charmeleon charmeleon) {
        System.out.println("20 bonus points for Charmeleon!");
    }

    @Override
    public void visitCharizard(Charizard charizard) {
        System.out.println("50 bonus points for Charizard!");
    }

}
