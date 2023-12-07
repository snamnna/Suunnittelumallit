package command;

public class Button {
    Command cmd;

    public Button(Command command) {
        cmd = command;
    }

    public void push() {
        cmd.execute();
    }
}
