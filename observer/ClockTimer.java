package observer;

import java.util.Observable;

//Observable
public class ClockTimer extends Observable {
    private int hour;
    private int minute;
    private int second;

    public ClockTimer() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        setChanged(); //Merkitään että tarkkailtava kohde on muuttunut
        notifyObservers(); //Ilmoitetaan tarkkailijoille muutoksesta
    }

    public void tick() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }

        setChanged();
        notifyObservers();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
