package factorymethod;

public class Rehtori extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Redbull();
    }
    
    public Ruoka createRuoka(){
        return new Rieska();
    }
}