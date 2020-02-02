public class Employee {
    public int salary = 50000;
    public int bloodLevel = 100;
    public int healthLevel = 100;
    public String wasPaid = "| Employee was Paid | ";
    public String employeeType = "| Nurse |";
    public String numberOfPatients = "| Too Many! |";
    public String employeeName;
    public String isPaid = "| Paid in Full |";
    public String isBusy = "| This employee is currently busy and cannot take on a new task |";

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

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", bloodLevel=" + bloodLevel +
                ", healthLevel=" + healthLevel +
                ", wasPaid='" + wasPaid + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", patient='" + numberOfPatients + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", isPaid='" + isPaid + '\'' +
                ", isBusy='" + isBusy + '\'' +
                '}';
    }


}

