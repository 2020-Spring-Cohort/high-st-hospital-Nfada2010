public class Nurse extends Employee{
    public String canDrawBlood = "Yes";
    public String numberOfPatients = "Too Many!";
    public String employeeName = "Alice";
    public String employeeID ="68421";
    public int salary = 50000;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Nurse(String employeeName) {
        super(employeeName);
    }

    public String getIsBusy() {
        return ("Of course the Nurse is busy. Who else works around here?");
    }

    public void setCanDrawBlood(String canDrawBlood) {
        this.canDrawBlood = canDrawBlood;
    }

    public void setNumberOfPatients(String numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCanDrawBlood() {
        return canDrawBlood;
    }

    public String getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public String getEmployeeType() {
        return "Nurse";
    }
}
