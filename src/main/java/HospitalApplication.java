import java.util.Scanner;

public class HospitalApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Patientwing patientwing = new Patientwing();
        Staff staff = new Staff();


        Employee ted = new EmergencyDispatcher("Ted");
        staff.hireEmployee(ted);

        Doctor drBecca = new Doctor("Dr. Becca");
        staff.hireEmployee(drBecca);

        Nurse alice = new Nurse("Alice");
        staff.hireEmployee(alice);

        Janitor nick = new Janitor("Nick");
        staff.hireEmployee(nick);

        Patient john = new Patient("John Doe");
        patientwing.admitPatient(john);

        Receptionist pam = new Receptionist("Pam");
        staff.hireEmployee(pam);


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
//                    String employeeType = input.nextLine();
//                    input.nextLine();
//                    r2.equalsIgnoreCase(employeeType);


                    for (String employeeType : staff.getStaff().keySet()) {
                        Employee e3 = staff.getStaff().get(employeeType);
                        System.out.printf(employeeType + e3);
                    }
                    System.out.printf("\nHere are the Current Positions at Cle Browns Hospital\n" +
                            "<1>. Nurse\n" +
                            "<2>. Doctor\n " +
                            "<3>. Receptionist\n" +
                            "<4>. Janitor\n" +
                            "<5>. Emergency Dispatcher\n");
                    String interactMenuChoice = input.nextLine();


                    switch (interactMenuChoice) {

                        case "Nurse":
//                            hi = new Nurse(newEmployee);
                            staff.hireEmployee();
                            System.out.printf("\n You have Hired a Nurse\n");


                        case "Doctor":
//                            newEmployee = new Doctor(newEmployee);
                            staff.hireEmployee(new Doctor(employeeType));
                            System.out.printf("\n You have Hired a  Doctor\n");


                        case "Receptionist":
                            staff.hireEmployee(new Receptionist(employeeType));
                            System.out.printf("\n You have Hired a  Receptionist\n");

                        case "Janitor":
                            staff.hireEmployee(new Janitor);
                            System.out.printf("\n You have Hired a Janitor\n");

                        case "Emergency Dispatcher":
                            staff.hireEmployee(new EmergencyDispatcher(employeeType));
                            System.out.printf("\n You have Hired a Emergency Dispatcher\n");


                        default:
                            System.out.printf("That was not a preset action ");

                    }


                    System.out.printf("\nWhat is the Employee's Name?");
//                    Employee newEmployee;
                    String employeeName = input.nextLine();
//                    Employee newEmployee;

                    staff.hireEmployee(newEmployee);
//                    for (String employeeName : staff.getStaff().keySet()) {
//                        Employee e2 = staff.getStaff().get(employeeName);
//                        System.out.printf(employeeName = "\n-|-\n" + e2.getEmployeeType() + e2.getEmployeeName());
//                    }
                    System.out.printf("\n---Welcome to the Factory of Sadness---\n" +
                            "\n---On 4th and long we run up the middle---");


                }

                if (r2.equalsIgnoreCase("Fire")) {
                    System.out.printf("\nHere is the current Staff\n" +
                            "--------------------------\n");

                    System.out.println(ted);
                    System.out.println(drBecca);
                    System.out.println(alice);
                    System.out.println(nick);
                    System.out.println(pam);


                    for (String employeeName : staff.getStaff().keySet()) {
                        Employee e2 = staff.getStaff().get(employeeName);
//                        System.out.printf(employeeName + "\n-|-\n" + e2.getEmployeeType());
                    }

                    System.out.printf("\nWho is getting the Axe?\n");

                    String r3 = input.nextLine();
                    input.nextLine();
                    staff.fireEmployee(r3);
                    System.out.printf(r3 + "\n||||||||||||||||||||||||||||||||\n\n" + e2);

                    System.out.printf("\nCongrats they have been canned, hopefully they had savings...\n");
                }

                if (r2.equalsIgnoreCase("Treat Patient")) {

                    System.out.printf("How would like to treat your patient?\n " +
                            "\nHave Doctor <-drDraw->" +
                            "\nHave Nurse <-nurseDraw->" +
                            "\nPay Employees <-PAY->" +
                            "\nPay Put Receptionist on call <-mainCall->" +
                            "\nPay Put Emergency Dispacther on call <-emergencyCall->" +
                            "\nCheck if Employee is busy <-BUSY->" +
                            "\nHave Janitor Sweep <-CLEAN->");
                    String interactMenu = input.nextLine();
                    switch (interactMenu) {
                        case "drDraw":

                            patientwing.drawBlood();
                            System.out.printf("The Doctor has drawn the blood over everyone on the floor!\n" +
                                    "I don't think we actually needed that much...\n");
                            break;

                        default:
                            System.out.printf("Please try typing something that actually does something");

                    }
                }
            }
        }
    }
}











