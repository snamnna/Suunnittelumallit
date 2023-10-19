public class SalaryIncr {
    private String employee;
    private double percentage;

    public SalaryIncr(String employee, double percentage){
        this.employee = employee;
        this.percentage = percentage;
    }

    public String getEmployee(){
        return employee;
    }

    public double getPercentage(){
        return percentage;
    }

}