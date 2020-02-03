public abstract class Employee {
    public int salary;
    public int bloodLevel = 100;
    public int healthLevel = 100;
    public String wasPaid;
    public String employeeType;
    public String numberOfPatients;
    public String employeeName;
    public String isPaid = "| Paid in Full |";
    public String isBusy = "| This employee is currently busy and cannot take on a new task |";

    public Employee(String employeeName){
        this.employeeName = employeeName;


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

