package memento;

public class Memento {
    //Tänne tallennetaan arvottu luku, sama kun luennolla keltainen lappu
    private int number;

    public Memento(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
