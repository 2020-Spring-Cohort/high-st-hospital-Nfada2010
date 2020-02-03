public class EmergencyDispatcher extends Employee {
    public String canDrawBlood = "Yes";
    public int salary = 45000;
    public String numberOfPatients = "Too Many!";
    public String employeeType = "Emergency Dispatcher";
    public String employeeName = "ted";

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCanDrawBlood() {
        return canDrawBlood;
    }

    public void setCanDrawBlood(String canDrawBlood) {
        this.canDrawBlood = canDrawBlood;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(String numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public String getEmployeeType() {
        return employeeType;
    }

    @Override
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public EmergencyDispatcher(String employeeName) {
        super(employeeName);
    }

    @Override
    public String getIsBusy() {
        return ("The Emergency Dispatcher is on the line please hold while another agent is on their way to assit you.?");
    }
}

