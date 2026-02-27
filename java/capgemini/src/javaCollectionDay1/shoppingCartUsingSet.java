package javaCollectionDay1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class shoppingCartUsingSet {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the customer name:");
        String cName = sc.next();

        Set<String> cart = new HashSet<>();
        String choice = "";

        while (!choice.equalsIgnoreCase("x")) {

            System.out.println("\nWelcome to Online Shopping");
            System.out.println("1. Lenovo Laptop");
            System.out.println("2. Apple iPhone");
            System.out.println("3. Nothing Phone 3");
            System.out.println("4. Samsung S24");
            System.out.println("5. Redmi Note 14 Pro");
            System.out.println("Press X to go to cart");

            choice = sc.next();

            switch (choice) {
                case "1":
                    cart.add("Lenovo Laptop");
                    System.out.println("Lenovo Laptop added to cart");
                    break;
                case "2":
                    cart.add("Apple iPhone");
                    System.out.println("Apple iPhone added to cart");
                    break;
                case "3":
                    cart.add("Nothing Phone 3");
                    System.out.println("Nothing Phone 3 added to cart");
                    break;
                case "4":
                    cart.add("Samsung S24");
                    System.out.println("Samsung S24 added to cart");
                    break;
                case "5":
                    cart.add("Redmi Note 14 Pro");
                    System.out.println("Redmi Note 14 Pro added to cart");
                    break;
                case "x":
                case "X":
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        System.out.println("\n----- CART -----");
        System.out.println("Items count: " + cart.size());
        for (String item : cart) {
            System.out.println(item);
        }

        String task = "";

        while (!task.equalsIgnoreCase("x")) {

            System.out.println("\n1. Get item by index");
            System.out.println("2. Remove item by name");
            System.out.println("3. Display cart");
            System.out.println("Press X to go to billing");

            task = sc.next();

            switch (task) {

                case "1":
                    System.out.println("Enter index:");
                    int index = sc.nextInt();

                    ArrayList<String> tempList = new ArrayList<>(cart);

                    if (index >= 0 && index < tempList.size()) {
                        System.out.println("Item at index " + index + ": " + tempList.get(index));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "2":
                    sc.nextLine();
                    System.out.println("Enter exact item name to remove:");
                    String itemToRemove = sc.nextLine();

                    if (cart.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " removed from cart");
                    } else {
                        System.out.println("Item not found in cart");
                    }
                    break;

                case "3":
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty");
                    } else {
                        for (String item : cart) {
                            System.out.println(item);
                        }
                    }
                    break;

                case "x":
                case "X":
                    System.out.println("Proceeding to billing...");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        System.out.println("\nThank you for shopping, " + cName + "!");
    }
}
