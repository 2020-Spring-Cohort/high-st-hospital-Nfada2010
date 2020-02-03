public abstract class Employee {
    public int salary = 45000;
    public int bloodLevel = 100;
    public int healthLevel = 100;

    public Employee() {

    }

    public String getEmployeeIDnumber() {
        return employeeIDnumber;
    }

    public void setEmployeeIDnumber(String employeeIDnumber) {
        this.employeeIDnumber = employeeIDnumber;
    }

    public String getIsPaid() {
        return isPaid;
    }

    public String employeeIDnumber = "12341";
//    public String wasPaid;
    public String employeeType = "Nurse";
    public String numberOfPatients = "Too Many!";
    public String employeeName;
    public String isPaid = "| Paid in Full |";
    public String isBusy = "| This employee is currently busy and cannot take on a new task |";


    public Employee(String employeeName){
        this.employeeName = employeeName;


    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBloodLevel(int bloodLevel) {
        this.bloodLevel = bloodLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

//    public void setWasPaid(String wasPaid) {
//        this.wasPaid = wasPaid;
//    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void setNumberOfPatients(String numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    public void setIsBusy(String isBusy) {
        this.isBusy = isBusy;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getNumberOfPatients() {
        return numberOfPatients;
    }

    public String getWasPaid() {
        return isPaid;
    }

    public String getIsBusy() {
        return isBusy;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeType(){return employeeType;}
    public String getEmployeeName(){return employeeName;}

    public String getName() {
        return employeeName;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "salary=" + salary +
//                ", bloodLevel=" + bloodLevel +
//                ", healthLevel=" + healthLevel +
//                ", wasPaid='" + wasPaid + '\'' +
//                ", employeeType='" + employeeType + '\'' +
//                ", numberOfPatients='" + numberOfPatients + '\'' +
//                ", employeeName='" + employeeName + '\'' +
//                ", isPaid='" + isPaid + '\'' +
//                ", isBusy='" + isBusy + '\'' +
//                '}';
//    }
}

