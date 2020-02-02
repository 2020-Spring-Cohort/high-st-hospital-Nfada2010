import java.util.Scanner;

public class HospitalApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Patientwing patientwing = new Patientwing();
        Staff staff = new Staff();


        Employee ted = new Employee();
        staff.hireEmployee(ted);
        Doctor drBecca = new Doctor();
        staff.hireEmployee(drBecca);
        Nurse alice = new Nurse();
        staff.hireEmployee(alice);
        Janitor nick = new Janitor();
        staff.hireEmployee(nick);
        Patient john = new Patient();
        patientwing.admitPatient(john);
        Receptionist pam = new Receptionist();
        staff.hireEmployee(pam);
//        System.out.println(john);
//        System.out.println(ted);
//        System.out.println(drBecca);
//        System.out.println(alice);
//        System.out.println(nick);
//        System.out.println(pam);

        System.out.printf("Welcome to Cleveland Browns' Hospital\n of Better Next Years\n" +
                "To begin. enter  ->START<-\n ");
//                "If you would rather leave....just enter ->EXIT<- we don't want you anyway");

        String r1 = input.nextLine();
        if (r1.equalsIgnoreCase("start")) {
            while (Staff.employeesWorking()) {
                System.out.printf("\n What would you like to do?\n" +
                        "to HIRE an EMPLOYEE ->HIRE<-\n" +
                        "to FIRE an EMPLOYEE");
                String r2 = input.next();

                if (r2.equalsIgnoreCase("hire")) {

//                    System.out.printf("\nWhat Position are you Hiring?");
////                    String employeeType = input.nextLine();
//                    input.nextLine();


//                   for (String employeeType : staff.getStaff().keySet()){
//                       Employee employee = staff.e().get(employeeType);
//                       System.out.printf(employeeType);
//                   }
                    System.out.printf("Here are the Current Positions at Cle Browns Hospital\n" +
                            "<1>. Nurse\n" +
                            "<2>. Doctor\n " +
                            "<3>. Receptionist\n" +
                            "<4>. Janitor\n" +
                            "<5>. Emergency Dispatcher\n");
                    String interactMenuChoice = input.nextLine();
                    switch (interactMenuChoice) {
                        case "Nurse":
                            staff.hireEmployee(new Nurse());
                            System.out.printf("\n You have Selected Nurse\n");
                            break;

                        case "Doctor":
                            staff.hireEmployee(new Doctor());
                            System.out.printf("\n You have Selected Doctor\n");
                            break;

                        case "Receptionist":
                            staff.hireEmployee(new Receptionist());
                            System.out.printf("\n You have Selected Receptionist\n");
                            break;
                        case "Janitor":
                            staff.hireEmployee(new Janitor());
                            System.out.printf("\n You have Selected Janitor\n");
                            break;
                        case "Emergency Dispatcher":
                            staff.hireEmployee(new EmergencyDispatcher());
                            System.out.printf("\n You have Selected Emergency Dispatcher\n");
                            break;
                    }


                    System.out.printf("\nWhat is the Employee's Name?");
                    String employeeName = input.nextLine();


                    for (String ignored : staff.getStaff().keySet()) {
                        Employee e2 = staff.getStaff().get(employeeName);
                        System.out.printf(employeeName = "\n-|-\n" + e2.getEmployeeType() + e2.getEmployeeName());
                    }
                    System.out.printf("\n---Welcome to the Factory of Sadness---\n" +
                            "\n---On 4th and long we run up the middle---");


                }

                if (r2.equalsIgnoreCase("Fire")) {
                    System.out.printf("Here is the current Staff");

                    for (String employeeName : staff.getStaff().keySet()) {
                        Employee employee = staff.getStaff().get(employeeName);
                        System.out.printf(employeeName + "-|-" + employee.getEmployeeType());

                        System.out.printf("Who is getting the Axe?");
                        System.out.printf(employeeName + "\n|||" + employee);

                        String r3 = input.nextLine();
                        input.nextLine();
                        staff.fireEmployee(r3);
                        System.out.printf("\nCongrats they have been canned, hopefully they had savings...");
                    }
                }
            }
        }
    }
}









