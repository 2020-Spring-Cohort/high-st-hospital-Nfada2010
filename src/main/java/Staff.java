import java.util.HashMap;
import java.util.Map;

public class Staff {

        public HashMap<String, Employee> staff = new HashMap<>();
    public static boolean employeesWorking() {
        return true;
    }
        public void hireEmployee(Employee newEmployee) {
            this.staff.put(newEmployee.getName(), newEmployee);
        }


        public void fireEmployee(String newEmployee) {
            this.staff.remove(newEmployee);
        }

        public Map<String, Employee> getStaff(){return staff;}
    }



