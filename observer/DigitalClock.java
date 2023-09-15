package observer;

import java.util.Observable;
import java.util.Observer;

//Tarkkailija
public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer ct){
        timer = ct;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == timer){
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        String time = String.format("%02d:%02d:%02d", hour, minute, second);
        System.out.println("Digital Clock: " + time);
    }

}

