public class Doctor extends Employee {
    public String medicalFocus = "Heart";
    public String canDrawBlood = "Yes";
    public String employeeType = "Doctor";

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

    public Doctor() {


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
