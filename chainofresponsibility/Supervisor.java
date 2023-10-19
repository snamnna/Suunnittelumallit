package chainofresponsibility;

public class Supervisor extends Handler {

    // Käsitellään pyyntö jos pystytään, heitetään eteenpäin jos ei
    @Override
    public void handleRequest(SalaryIncr request) {
        if (request.getPercentage() <= 2) {
            System.out.println("Salary increasement accepted by supervisor for " + request.getEmployee());
        } else {
            passToNext(request);
        }
    }

}