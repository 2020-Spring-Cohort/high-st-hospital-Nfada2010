public class Receptionist extends Employee{
    public String canDrawBlood = "no";
    public String numberOfCalls = "Too Many!";
    public String employeeType = "Receptionist";
    public String employeeName = "Pam";

    public Receptionist(String employeeName) {
        super(employeeName);
    }

    public String getCanDrawBlood() {
        return canDrawBlood;
    }

    public void setCanDrawBlood(String canDrawBlood) {
        this.canDrawBlood = canDrawBlood;
    }


    public String getNumberOfCalls() {
        return numberOfCalls;
    }

    public void setNumberOfCalls(String numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }


    @Override
    public String getEmployeeType() {
        return "Janitor";
    }
        @Override
        public String getIsBusy (){
        return "This Receptionist is already on a call";
    }
}
