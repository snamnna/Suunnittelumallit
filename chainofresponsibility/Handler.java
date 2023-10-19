package chainofresponsibility;

public abstract class Handler {
    private Handler nextHandler;

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(SalaryIncr request);

    protected void passToNext(SalaryIncr request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}