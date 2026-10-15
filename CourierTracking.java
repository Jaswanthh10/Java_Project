import java.util.Scanner;
import java.util.InputMismatchException;

// Parent class
class Courier {
    String trackingId;
    String sender;
    String receiver;
    String status;
    int estimatedDays;

    Courier(String trackingId, String sender, String receiver,
            String status, int estimatedDays) {
        this.trackingId = trackingId;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        this.estimatedDays = estimatedDays;
    }

    // Method
    void displayDetails() {
        System.out.println("Tracking ID: " + trackingId);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Status: " + status);
        System.out.println("Estimated Days: " + estimatedDays);
    }
}

// Child class - Inheritance
class Shipment extends Courier {

    Shipment(String trackingId, String sender, String receiver,
             String status, int estimatedDays) {
        super(trackingId, sender, receiver, status, estimatedDays);
    }

    // Method overriding
    @Override
    void displayDetails() {
        System.out.println("\n----- Courier Details -----");
        super.displayDetails();
    }
}

// Main class
public class CourierTracking {

    static Scanner sc = new Scanner(System.in);

    // Array of shipment objects
    static Shipment[] shipments = {
        new Shipment("CP101", "Asha", "Kiran", "Dispatched", 3),
        new Shipment("CP102", "Ravi", "Meena", "In Transit", 2),
        new Shipment("CP103", "Neha", "Arun", "Delivered", 0)
    };

    // Method overloading: search by tracking ID
    static void trackShipment(String id) {
        boolean found = false;

        for (int i = 0; i < shipments.length; i++) {
            if (shipments[i].trackingId.equalsIgnoreCase(id.trim())) {
                shipments[i].displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Courier not found!");
        }
    }

    // Method overloading: search by array index
    static void trackShipment(int index) {
        if (index >= 0 && index < shipments.length) {
            shipments[index].displayDetails();
        } else {
            System.out.println("Invalid shipment index!");
        }
    }

    // Display all shipments
    static void displayAll() {
        for (int i = 0; i < shipments.length; i++) {
            shipments[i].displayDetails();
        }
    }

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== COURIER TRACKING SYSTEM =====");
            System.out.println("1. Track Courier by ID");
            System.out.println("2. Display All Couriers");
            System.out.println("3. Track Courier by Index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Tracking ID: ");
                        String id = sc.nextLine();
                        trackShipment(id);
                        break;

                    case 2:
                        displayAll();
                        break;

                    case 3:
                        System.out.print(
                            "Enter index (0 to " +
                            (shipments.length - 1) + "): "
                        );
                        int index = sc.nextInt();
                        trackShipment(index);
                        break;

                    case 4:
                        System.out.println("Thank you for using the system!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); // Clear invalid input
            }
        }

        sc.close();
    }
}
