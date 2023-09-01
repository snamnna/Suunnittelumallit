package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa{

    //Emolevyn oma hinta
    private double hinta = 500.0;
    
    //Tehdään lista komponenteille jotka emolevyssä
    private List<Laiteosa> komponentit = new ArrayList<>();

    //Lisätään listaan komponentti
    public void lisaaLaiteosa(Laiteosa laiteosa){
        komponentit.add(laiteosa);
    }

    //Lasketaan emolevyn koko hinta komponentteineen
    public double haeHinta(){
        double kokohinta = 0;
        for(Laiteosa osa : komponentit){
            kokohinta += osa.haeHinta();
        }
        return hinta + kokohinta;
    }
}
