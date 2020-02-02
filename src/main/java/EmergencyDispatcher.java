public class EmergencyDispatcher extends Employee {
    public String canDrawBlood = "Yes";
    public int salary = 45000;
    public int numberOfPatients = 10;
    public String employeeType = "Emergency Dispatcher";

    @Override
    public String getIsBusy() {
        return ("The Emergency Dispatcher is on the line please hold while another agent is on their way to assit you.?");
    }
}

