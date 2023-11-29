package Syväkopiointi;

public class Kello implements Cloneable {
    private Viisari tunti;
    private Viisari minuutti;

    public Kello(int tunti, int minuutti) {
        this.tunti = new Viisari(tunti);
        this.minuutti = new Viisari(minuutti);
    }

    public void setAika(int tunti, int minuutti) {
        this.tunti.setAika(tunti);
        this.minuutti.setAika(minuutti);
    }

    public void tulostaAika() {
        System.out.println("Kello on " + tunti.getAika() + ":" + minuutti.getAika());
    }

    // Toteutetaan syväkopiointi
    @Override
    public Kello clone() throws CloneNotSupportedException {
        Kello clonedKello = (Kello) super.clone();
        clonedKello.tunti = this.tunti.clone();
        clonedKello.minuutti = this.minuutti.clone();
        return clonedKello;
    }
}
