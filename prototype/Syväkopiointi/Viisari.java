package Syväkopiointi;
public class Viisari implements Cloneable {
    // Erillistä rajapintaa ei tarvitse luoda, sillä molemmat käyttävät cloneablea,
    // joka javassa jo valmiina
    private int aika;

    public Viisari(int aika) {
        this.aika = aika;
    }

    public int getAika() {
        return aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }

    @Override
    public Viisari clone() throws CloneNotSupportedException {
        return (Viisari) super.clone();
    }
}
