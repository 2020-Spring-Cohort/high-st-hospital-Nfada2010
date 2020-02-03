public class Janitor extends Employee{
    public String canDrawBlood = "no";
    public int numberOfPatients = 0;
    public String employeeType = "Janitor";
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
