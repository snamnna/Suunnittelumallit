package chainofresponsibility;

public class HeadOfDepartment extends Handler {

    @Override
    public void handleRequest(SalaryIncr request) {
        if (request.getPercentage() > 2 && request.getPercentage() < 5) {
            System.out
                    .println("Salary increasement accepted by the head of the department for " + request.getEmployee());
        } else {
            passToNext(request);
        }
    }

}
