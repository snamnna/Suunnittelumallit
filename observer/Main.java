package observer;

public class Main {
    public static void main(String[] args) {
        
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digital1 = new DigitalClock(clockTimer);
        DigitalClock digital2 = new DigitalClock(clockTimer);

        clockTimer.tick();
        clockTimer.tick();
        clockTimer.tick();
    }
}
