public class Janitor extends Employee{
    public String canDrawBlood = "no";
    public String numberOfPatients = "None";
    public String employeeID ="68421";
    public String employeeType = "Janitor";

    public void setCanDrawBlood(String canDrawBlood) {
        this.canDrawBlood = canDrawBlood;
    }

    @Override
    public String getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public void setNumberOfPatients(String numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int salary = 40000;
//    public String isBusy =

    public Janitor(String employeeName) {
        super(employeeName);
    }

    public  String getCanDrawBlood(){return  canDrawBlood;}
    @Override
    public String getEmployeeType() {
        return employeeType;
    }
    @Override
    public String getIsBusy() {
        return ("This Janitor is Busy Sweeping at the moment");
    }
    @Override
    public int getSalary() {
        return (40000);
    }

}
