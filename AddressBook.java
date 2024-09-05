package addressbooksystems;

import java.util.Scanner;

public class AddressBook {
    // Defining an array for contacts with a fixed size
    private Contacts[] contactsArray;
    private int contactCount;

    // Constructor to initialize the array
    public AddressBook() {
        contactsArray = new Contacts[100]; // Example: array can hold up to 100 contacts
        contactCount = 0;
    }

    // Welcome message
    public static void welcomeMsg() {
        System.out.println("Welcome to the Address Book System!");
    }

    // Method to handle the menu and switch case logic
    public void manageAddressBook(Scanner sc) {
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Display all contacts in the Address Book");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    // Add a new contact
                    addNewContact(sc);
                    break;

                case 2:
                    // Display all contacts
                    displayAllContacts();
                    break;

                case 3:
                    // Exit the program
                    continueProgram = false;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    // Method to add a new contact
    private void addNewContact(Scanner sc) {
        if (contactCount < contactsArray.length) {
            System.out.println("Enter first name:");
            String firstName = sc.nextLine();

            System.out.println("Enter last name:");
            String lastName = sc.nextLine();

            System.out.println("Enter Address:");
            String address = sc.nextLine();

            System.out.println("Enter city:");
            String city = sc.nextLine();

            System.out.println("Enter state:");
            String state = sc.nextLine();

            System.out.println("Enter pincode:");
            int zip = sc.nextInt();

            System.out.println("Enter mobile number:");
            long phoneNumber = sc.nextLong();

            System.out.println("Enter Email ID:");
            sc.nextLine(); // consume the newline
            String email = sc.nextLine();

            // Create a new Contacts object and add it to the AddressBook
            Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
            contactsArray[contactCount] = contact;
            contactCount++;

            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Address Book is full. Cannot add more contacts.");
        }
    }

    // Method to display all contacts
    private void displayAllContacts() {
        if (contactCount == 0) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts in the Address Book:");
            for (int i = 0; i < contactCount; i++) {
                System.out.println(contactsArray[i]);
            }
        }
    }
}
