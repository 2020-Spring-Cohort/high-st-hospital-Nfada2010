import java.util.HashMap;
import java.util.Map;

public class Staff extends Employee{

//    public Staff(HashMap<String, Employee> staff) {
////        super();
//
//        this.staff = staff;
//    }

    public HashMap<String, Employee> staff;

    public static boolean employeesWorking() {
        return true;
    }

    public void hireEmployee(Employee newEmployee) {
        this.staff.put(newEmployee.getEmployeeName(), newEmployee);
//        Employee fred = newEmployee;
    }

    public void setStaff(HashMap<String, Employee> staff) {
        this.staff = staff;
    }

//    public void hireEmployee() {
////        Employee newEmployee = newEmployee;
////        this.staff.put(newEmployee.getName(), newEmployee);
//    }


//    public void fireEmployee(String employeeName) {
//        staff.remove(employeeName);
//    }


    public Map<String, Employee> getStaff() {
        return staff;
    }

//        public void payEmployees(){
//        for (Employee employee : staff.values()){
//            payEmployees(employee);
//        }
//        }

    public void payEmployees() {
        for (Employee employee : staff.values()) {
            payEmployees();

        }

    }

//    public HashMap checkStatus() {
//        HashMap status = staff;
//        for (Employee employee : staff.values()) {
////            status += employee.toString() + "\n";
//        }
//        return status;
//    }

    public void fireEmployee(String employeeName) {
        this.staff.remove(employeeName);
    }
}





