public class Doctor extends Employee {
    public String medicalFocus = "Heart";
    public String canDrawBlood = "Yes";
    public String employeeType = "Doctor";



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
