package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa{
    
    //Kotelon oma hinta
    private double hinta = 400.00;
    
    //Tehdään lista komponenteille jotka kotelossa
    private List<Laiteosa> komponentit = new ArrayList<>();

    //Lisätään listaan komponentti
    public void lisaaLaiteosa(Laiteosa laiteosa){
        komponentit.add(laiteosa);
    }

    //Lasketaan kotelon koko hinta komponentteineen
    public double haeHinta(){
        double kokohinta = 0;
        for(Laiteosa osa : komponentit){
            kokohinta += osa.haeHinta();
        }
        return hinta + kokohinta;
    }

}
