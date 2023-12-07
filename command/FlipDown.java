package command;

public class FlipDown implements Command {
    private Screen screen;

    public FlipDown(Screen screen) {
        this.screen = screen;
    }

    // Tässä käsky
    @Override
    public void execute() {
        screen.screenDown();
    }
}