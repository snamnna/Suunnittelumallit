package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Handler supervisor = new Supervisor();
        Handler departmentHead = new HeadOfDepartment();
        Handler ceo = new CEO();

        supervisor.setNext(departmentHead);
        departmentHead.setNext(ceo);

        SalaryIncr request = new SalaryIncr("Adele", 11);
        supervisor.handleRequest(request);
    }
}
