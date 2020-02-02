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
                    String employeeType = input.nextLine();
                    input.nextLine();
                    r2.equalsIgnoreCase(employeeType);


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


                        case "Doctor":
                            staff.hireEmployee(new Doctor());
                            System.out.printf("\n You have Selected Doctor\n");


                        case "Receptionist":
                            staff.hireEmployee(new Receptionist());
                            System.out.printf("\n You have Selected Receptionist\n");

                        case "Janitor":
                            staff.hireEmployee(new Janitor());
                            System.out.printf("\n You have Selected Janitor\n");

                        case "Emergency Dispatcher":
                            staff.hireEmployee(new EmergencyDispatcher());
                            System.out.printf("\n You have Selected Emergency Dispatcher\n");

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
                    System.out.printf("Here is the current Staff" +
                    "--------------------------\n");

        System.out.println(ted);
        System.out.println(drBecca);
        System.out.println(alice);
        System.out.println(nick);
        System.out.println(pam);


                    for (String employeeName : staff.getStaff().keySet()) {
                        Employee e2 = staff.getStaff().get(employeeName);
//                        System.out.printf(employeeName + "\n-|-\n" + e2.getEmployeeType());

                        System.out.printf("\nWho is getting the Axe?");

                        String r3 = input.nextLine();
                        input.nextLine();
                        staff.fireEmployee(r3);
                        System.out.printf(employeeName + "\n|||" + e2);
                        System.out.printf("\nCongrats they have been canned, hopefully they had savings...");
                    }
                    if (r2.equalsIgnoreCase("Treat Patient")){

                        System.out.printf("How would like to treat your patient?\n " +
                                "Have Doctor <-drDraw->" +
                                "Have Nurse <-nurseDraw->" +
                                "Pay Employees <-PAY->" +
                                "Pay Put Receptionist on call <-mainCall->" +
                                "Pay Put Emergency Dispacther on call <-emergencyCall->" +
                                "Check if Employee is busy <-BUSY->" +
                                "Have Janitor Sweep <-CLEAN->");
                        String interactMenu = input.nextLine();
                        switch (interactMenu){
                            case "drDraw":

                            patientwing.drawBlood();
                                System.out.printf("The Doctor has drawn the blood over everyone on the floor!\n" +
                                        "I don't think we actually needed that much...\n");
                                break;

                        }
                    }
                }
            }
        }
    }
}









