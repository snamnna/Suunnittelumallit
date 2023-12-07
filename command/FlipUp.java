package command;

public class FlipUp implements Command {
    private Screen screen;

    public FlipUp(Screen screen) {
        this.screen = screen;
    }

    // Tässä käsky
    @Override
    public void execute() {
        screen.screenUp();
    }
}
