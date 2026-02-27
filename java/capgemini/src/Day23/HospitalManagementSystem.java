package Day23;

import java.util.Scanner;

public class HospitalManagementSystem {

    static Scanner sc = new Scanner(System.in);

    String patientName;
    int patientAge;
    String doctorName = "Doctor Sharma";
    String medicalHistory = "no records found";

    public void patientRegistration() {
        sc.nextLine();
        System.out.print("Enter patient name: ");
        patientName = sc.nextLine();
        System.out.print("Enter patient age: ");
        patientAge = sc.nextInt();
        System.out.println("Patient registered successfully");
    }

    public void doctorDetails() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Available Time: 10 AM - 4 PM");
        System.out.println("Consultation Fee: ₹500");
    }

    public void appointment() {
        if (patientName == null) {
            System.out.println("Please register patient first");
            return;
        }
        System.out.println("Appointment booked with " + doctorName);
    }

    public void billing() {
        if (patientName == null) {
            System.out.println("No patient found for billing");
            return;
        }
        int billAmount = 500;
        System.out.println("Patient Name: " + patientName);
        System.out.println("Total Bill Amount: ₹" + billAmount);
        System.out.println("Billing completed");
    }

    public void medicalHistory() {
        if (patientName == null) {
            System.out.println("No medical history available");
            return;
        }
        System.out.println("Patient Name: " + patientName);
        System.out.println("Medical History: " + medicalHistory);
    }

    public static void main(String[] args) {

        HospitalManagementSystem hms = new HospitalManagementSystem();
        String choice = "";

        while (!(choice.equals("x") || choice.equals("X"))  ){

            System.out.println("\n hospital management system ");
            System.out.println("1. patient regsitration");
            System.out.println("2. doctor details");
            System.out.println("3. Appointment");
            System.out.println("4. Billing");
            System.out.println("5. Medical history");
            System.out.println("Press x to exit");

            choice = sc.next();

            switch (choice) {

                case "1":
                    hms.patientRegistration();
                    break;

                case "2":
                    hms.doctorDetails();
                    break;

                case "3":
                    hms.appointment();
                    break;

                case "4":
                    hms.billing();
                    break;

                case "5":
                    hms.medicalHistory();
                    break;

                case "x":
                case "X":
                    System.out.println("exiting hospital management System");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
