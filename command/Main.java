package command;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command switchUp = new FlipUp(screen);
        Command switchDown = new FlipDown(screen);

        Button button1 = new Button(switchUp);
        Button button2 = new Button(switchDown);

        button1.push();
        button2.push();
    }
}
