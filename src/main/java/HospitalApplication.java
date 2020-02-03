import java.util.HashMap;
import java.util.Scanner;

public class HospitalApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Patientwing patientwing = new Patientwing();
        Staff staff = new Staff();
//        HashMap<String, Employee> myStaff = new HashMap<>();
        String employeeType = "";
//        String newEmployee = "";


        EmergencyDispatcher ted = new EmergencyDispatcher("Ted");
//        staff.hireEmployee(ted);

        Doctor drBecca = new Doctor("Dr. Becca");
//        staff.hireEmployee(drBecca);

        Nurse alice = new Nurse("Alice");
//        staff.hireEmployee(alice);

        Janitor nick = new Janitor("Nick");
//        staff.hireEmployee(nick);

        Patient john = new Patient("John Doe");
        patientwing.admitPatient(john);

        Receptionist pam = new Receptionist("Pam");
//        staff.hireEmployee(pam);


        System.out.printf("\nWelcome to Cleveland Browns' Hospital\n of Better Next Years\n" +
                "--------------------------\n" +
                "To begin. enter  ->START<-\n ");
//                "If you would rather leave....just enter ->EXIT<- we don't want you anyway");

        String r1 = input.nextLine();
        if (r1.equalsIgnoreCase("start")) {
            while (Staff.employeesWorking()) {
                System.out.printf("\n What would you like to do?\n" +
                        "to HIRE an EMPLOYEE ->HIRE<-\n" +
                        "--------------------------\n" +
                        "to FIRE an EMPLOYEE ->FIRE<-\n" +
                        "--------------------------\n" +
                        "to TREAT a Patient ->TREAT<-\n");
                String r2 = input.next();


                if (r2.equalsIgnoreCase("hire")) {


                    System.out.printf("\nWhat Position are you Hiring?");
//                    String emplyeeType = input.nextLine();
//                    input.nextLine();
//                    r2.equalsIgnoreCase(employeeType);

//                    for (String employeeType : staff.getStaff().keySet()) {
//                        Employee e3 = staff.getStaff().get(employeeType);
//                        System.out.printf(employeeType + e3);

                    System.out.printf("\nHere are the Current Positions at Cle Browns Hospital\n" +
                            "\nChoose the position then type the name after\n" +
                            "<1>. Nurse\n" +
                            "<2>. Doctor\n " +
                            "<3>. Receptionist\n" +
                            "<4>. Janitor\n" +
                            "<5>. Emergency Dispatcher\n");


                    String interactMenuChoice = input.nextLine();

                    switch (interactMenuChoice) {


                        case "Nurse":
//                            hi = new Nurse(newEmployee);
                            staff.hireEmployee(new Nurse(employeeType));
                            System.out.printf("\n You have Hired a Nurse\n");
                            break;


                        case "Doctor":
//                            newEmployee = new Doctor(newEmployee);
                            staff.hireEmployee(new Doctor(employeeType));
                            System.out.printf("\n You have Hired a  Doctor\n");
                            break;

                        case "Receptionist":
                            staff.hireEmployee(new Receptionist(employeeType));
                            System.out.printf("\n You have Hired a  Receptionist\n");
                            break;

                        case "Janitor":
                            staff.hireEmployee(new Janitor(employeeType));
                            System.out.printf("\n You have Hired a Janitor\n");
                            break;

                        case "Emergency Dispatcher":
                            staff.hireEmployee(new EmergencyDispatcher(employeeType));
                            System.out.printf("\n You have Hired a Emergency Dispatcher\n");
                            break;

                        default: {
                            System.out.printf("That was not a preset action ");
                            break;
                        }

                    }


                    System.out.printf("\nWhat is the Employee's Name?");
//                    Employee newEmployee;
//                    Employee newEmployee;
//                String newEmployee = input.nextLine();
//                staff.hireEmployee(drBecca);
                    String employeeName = input.nextLine();
//                System.out.printf(myStaff +
//                        employeeName + employeeType);

                    input.nextLine();
                    Employee e2 = nick;
                    e2.equals(employeeName);
//                    for (HashMap <String, Employee> hashMap.getStaff().keySet() {
                    System.out.printf(staff + "\n-|-\n" + e2.getEmployeeType() + e2.getEmployeeName());

                    System.out.printf("\n---Welcome to the Factory of Sadness---\n" +
                            "---On 4th and long we run up the middle---\n");
                }


                if (r2.equalsIgnoreCase("Fire")) {
                    System.out.printf("\nHere is the current Staff\n" +
                            "\n--------------------------\n");
//                    for (String employeeName : staff.getStaff().keySet()){
//                        Employee employee = staff.getStaff().get(employeeName);

                    System.out.printf(staff.getEmployeeName() + staff.getEmployeeIDnumber() + staff.getEmployeeType());

                    System.out.println(ted);
                    System.out.println(drBecca);
                    System.out.println(alice);
                    System.out.println(nick);
                    System.out.println(pam);

//                    Employee e2 = staff.getStaff().get("Name");
//
//                    for (String employeeName : staff.getStaff().keySet()) {
//                        System.out.printf(employeeName + "\n-|-\n" + e2.getEmployeeType());
//                    }


                        System.out.printf("\nWho is getting the Axe?\n");

                        String r3 = input.nextLine();
                        input.next();
                        staff.fireEmployee(r3);
                        System.out.printf("\nCongrats they have been fired, hopefully they had savings...\n");

                }


                    if (r2.equalsIgnoreCase("Treat")) {

                        System.out.printf("\nWhat would you like to do in the Hospital?\n " +
                                "\nHave Doctor <-drDraw->" +
                                "\nHave Nurse <-nurseDraw->" +
                                "\nPay Employees <-PAY->" +
//                                "\nCheck if Employee status<-status->" +
                                "\nAdmit Patient<-admit->" +
                                "\n Release Patient<-release->\n"
                        );
                        String interactMenu = input.nextLine();
                        input.next();
                        switch (interactMenu) {

                            case "drDraw":

                                patientwing.drawBlood();
                                System.out.printf("\nThe Doctor has drawn the blood of everyone on the floor!\n" +
                                        "I don't think we actually needed that much...\n");
                                break;

                            case "nurseDraw":
                                patientwing.drawBlood();
                                System.out.printf("\nThe Nurse has drawn the blood everyone of their patients!\n");
                                break;
                            case "pay":
                                staff.payEmployees();
                                System.out.printf("\nEmployees are all paid!\n");
                                break;
//                            case "status":
//                                patientwing.checkStatus();
//                                System.out.printf("Here is the status of the staff\n" + patientwing );
//                                break;

                            case "admit":
                                patientwing.admitPatient(john);
                                System.out.printf("\nPatient has been Admitted\n");
                                break;

                            case "release":
                                patientwing.releasePatient("");
                                System.out.printf("\nPatient has been released\n");
                                break;

                            default:
                                System.out.printf("Please try typing something that actually does something");
                                break;

                        }
                    }
                }
        } else {
            System.exit(0);
        }
    }

    }













