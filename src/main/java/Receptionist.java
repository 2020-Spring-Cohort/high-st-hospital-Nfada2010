public class Receptionist extends Employee{
    public String canDrawBlood = "no";
    public int numberOfPatients = 0;
    public String employeeType = "Receptionist";
    @Override
    public String getEmployeeType() {
        return "Janitor";
    }
        @Override
        public String getIsBusy (){
        return "This Receptionist is already on a call";
    }
}
