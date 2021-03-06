public class Doctor extends Employee {
    public String medicalFocus = "\nHeart";
    public String canDrawBlood = "\nYes";
    public String employeeType = "\nDoctor";
    public String employeeName = "\nDr. Becca";
    public String employeeID ="894215";
    public int salary = 95000;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Doctor(String employeeName) {
        super(employeeName);
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMedicalFocus() {
        return medicalFocus;
    }

    public void setMedicalFocus(String medicalFocus) {
        this.medicalFocus = medicalFocus;
    }

    public String getCanDrawBlood() {
        return canDrawBlood;
    }

    public void setCanDrawBlood(String canDrawBlood) {
        this.canDrawBlood = canDrawBlood;
    }

    @Override
    public String getEmployeeType() {
        return "Doctor";
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = "Doctor";
    }



    @Override
    public String getIsBusy() {
        return ("This Doctor is with a patient at the moment");

    }

    @Override
    public int getSalary() {
        return 90000;
    }

}
