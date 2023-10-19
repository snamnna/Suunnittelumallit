package chainofresponsibility;

public class CEO extends Handler {

    @Override
    public void handleRequest(SalaryIncr request) {
        if (request.getPercentage() >= 5 && request.getPercentage() <= 10) {
            System.out.println("Salary increasement accepted by the CEO for " + request.getEmployee());
        } else {
            System.out.println("Salary increasement denied by the CEO...");
        }
    }

}
