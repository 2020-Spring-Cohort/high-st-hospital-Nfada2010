public class Nurse extends Employee{
    public String canDrawBlood = "Yes";
    public String numberOfPatients = "Too Many!";
    public String getIsBusy() {
        return ("Of course the Nurse is busy. Who else works around here?");
    }

    public String getCanDrawBlood() {
        return canDrawBlood;
    }

    public String getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public String getEmployeeType() {
        return "Nurse";
    }
}
