public class Janitor extends Employee{
    public String canDrawBlood = "no";
    public int numberOfPatients = 0;
    public String employeeType = "Janitor";

    public Janitor(String employeeName) {
        super(employeeName);
    }

    @Override
    public String getEmployeeType() {
        return "Janitor";
    }
    @Override
    public String getIsBusy() {
        return ("This Janitor is Busy Sweeping at the moment");
    }
}
