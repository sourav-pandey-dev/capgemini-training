package Day23;

import java.util.Scanner;

public class ATM {

    long balance = 1000;
    String pin = "1234";
    static Scanner sc = new Scanner(System.in);


    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited to your account");
        System.out.println("Your updated balance is " + balance);
    }


    public void checkBalance(String enteredPin) {
        if (enteredPin.equals(pin)) {
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Please enter the correct PIN");
        }
    }


    public void changePin(String enteredPin) {
        if (enteredPin.equals(pin)) {
            System.out.print("Enter new PIN: ");
            pin = sc.next();
            System.out.println("PIN changed successfully");
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void withdraw(int amount, String enteredPin) {
        if (!enteredPin.equals(pin)) {
            System.out.println("Incorrect PIN");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
    }

    public void quickWithdraw(String enteredPin) {
        int amount = 300;

        if (!enteredPin.equals(pin)) {
            System.out.println("Incorrect PIN");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Quick withdrawal of 300 successful");
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {

        ATM atm = new ATM();
        String choice = "";

        while (!choice.equalsIgnoreCase("x")) {

            System.out.println("\nHow can I help you?");
            System.out.println("1. Deposit");
            System.out.println("2. Change PIN");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Quick Withdraw (300)");
            System.out.println("Press X to exit");

            choice = sc.next();

            switch (choice) {

                case "1":
                    System.out.print("Enter amount to deposit: ");
                    atm.deposit(sc.nextInt());
                    break;

                case "2":
                    System.out.print("Enter current PIN: ");
                    atm.changePin(sc.next());
                    break;

                case "3":
                    System.out.print("Enter amount to withdraw: ");
                    int wd = sc.nextInt();
                    System.out.print("Enter PIN: ");
                    atm.withdraw(wd, sc.next());
                    break;

                case "4":
                    System.out.print("Enter PIN: ");
                    atm.checkBalance(sc.next());
                    break;

                case "5":
                    System.out.print("Enter PIN: ");
                    atm.quickWithdraw(sc.next());
                    break;

                case "x":
                case "X":
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
