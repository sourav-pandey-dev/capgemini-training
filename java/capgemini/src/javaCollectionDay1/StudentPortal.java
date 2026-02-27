package javaCollectionDay1;

import java.util.HashMap;
import java.util.Scanner;

public class StudentPortal {

    static HashMap<String, String> users = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    boolean isLoggedIn = false;
    String loggedInUser = null;

    public void registration() {
        sc.nextLine();
        System.out.print("Create username: ");
        String username = sc.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists");
            return;
        }

        System.out.print("Create password: ");
        String password = sc.nextLine();

        users.put(username, password);
        System.out.println("Registration successful. Please login.");
    }

    public void login() {
        sc.nextLine();
        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        if (users.containsKey(u) && users.get(u).equals(p)) {
            isLoggedIn = true;
            loggedInUser = u;
            System.out.println("Login successful. Welcome " + u);
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public void studyMaterial() {
        System.out.println("Opening study material PDF for " + loggedInUser);
        System.out.println("PDF opened successfully");
    }

    public void totalMarks() {
        System.out.print("Enter marks of subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int m3 = sc.nextInt();

        System.out.println("Total Marks for " + loggedInUser + ": " + (m1 + m2 + m3));
    }

    public static void main(String[] args) {

        StudentPortal sp = new StudentPortal();
        String choice = "";

        while (!sp.isLoggedIn) {

            System.out.println("\n--- Authentication ---");
            System.out.println("1. Registration");
            System.out.println("2. Login");
            System.out.println("Press X to exit");

            choice = sc.next();

            switch (choice) {

                case "1":
                    sp.registration();
                    break;

                case "2":
                    sp.login();
                    break;

                case "x":
                case "X":
                    System.out.println("Exiting system");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }

        while (true) {

            System.out.println("\n--- Student Dashboard ---");
            System.out.println("3. Study Material");
            System.out.println("4. Total Marks");
            System.out.println("Press X to logout");

            choice = sc.next();

            switch (choice) {

                case "3":
                    sp.studyMaterial();
                    break;

                case "4":
                    sp.totalMarks();
                    break;

                case "x":
                case "X":
                    sp.isLoggedIn = false;
                    sp.loggedInUser = null;
                    System.out.println("Logged out successfully");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
