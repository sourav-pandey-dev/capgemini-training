package javaCollectionDay1;

import java.util.*;

public class Day2c {
    public static void getShipments(List<String> ids, List<String> sources, List<String> destinations,
                                    List<String> goods, List<String> statuses) {
        System.out.println("\n--- All Shipments ---");
        for (int i = 0; i < ids.size(); i++) {
            System.out.println("Shipment ID: " + ids.get(i));
            System.out.println("Source: " + sources.get(i));
            System.out.println("Destination: " + destinations.get(i));
            System.out.println("Goods: " + goods.get(i));
            System.out.println("Status: " + statuses.get(i));
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> ids = new ArrayList<>();
        List<String> sources = new ArrayList<>();
        List<String> destinations = new ArrayList<>();
        List<String> goods = new ArrayList<>();
        List<String> statuses = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Logistic Management System ---");
            System.out.println("1. Register Shipment");
            System.out.println("2. Update Shipment Status");
            System.out.println("3. Track Shipment");
            System.out.println("4. Remove Shipment");
            System.out.println("5. View All Shipments");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Shipment ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Source: ");
                    String source = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = sc.nextLine();
                    System.out.print("Enter Goods: ");
                    String good = sc.nextLine();

                    ids.add(id);
                    sources.add(source);
                    destinations.add(destination);
                    goods.add(good);
                    statuses.add("Registered");
                    System.out.println("Shipment registered successfully!");
                    break;

                case 2:
                    System.out.print("Enter Shipment ID to update: ");
                    String updateId = sc.nextLine();
                    int updateIndex = ids.indexOf(updateId);
                    if (updateIndex != -1) {
                        System.out.print("Enter new status (In Transit/Delivered/Delayed): ");
                        String newStatus = sc.nextLine();
                        statuses.set(updateIndex, newStatus);
                        System.out.println("Status updated successfully!");
                    } else {
                        System.out.println("Shipment not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Shipment ID to track: ");
                    String trackId = sc.nextLine();
                    int trackIndex = ids.indexOf(trackId);
                    if (trackIndex != -1) {
                        System.out.println("Shipment ID: " + ids.get(trackIndex));
                        System.out.println("Source: " + sources.get(trackIndex));
                        System.out.println("Destination: " + destinations.get(trackIndex));
                        System.out.println("Goods: " + goods.get(trackIndex));
                        System.out.println("Status: " + statuses.get(trackIndex));
                    } else {
                        System.out.println("Shipment not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Shipment ID to remove: ");
                    String removeId = sc.nextLine();
                    int removeIndex = ids.indexOf(removeId);
                    if (removeIndex != -1) {
                        ids.remove(removeIndex);
                        sources.remove(removeIndex);
                        destinations.remove(removeIndex);
                        goods.remove(removeIndex);
                        statuses.remove(removeIndex);
                        System.out.println("Shipment removed successfully!");
                    } else {
                        System.out.println("Shipment not found!");
                    }
                    break;

                case 5:
                    if (ids.isEmpty()) {
                        System.out.println("No shipments registered.");
                    } else {
                        getShipments(ids, sources, destinations, goods, statuses);
                    }
                    break;

                case 6:
                    System.out.println("Exiting system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}