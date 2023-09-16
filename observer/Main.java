package observer;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digital = new DigitalClock(clockTimer);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                clockTimer.tick();
            }
        }, 0, 1000);
    }
}
