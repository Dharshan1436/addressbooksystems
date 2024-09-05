package addressbooksystems;


import java.util.Scanner;

public class AddressBookTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook.welcomeMsg();
        AddressBook addressBook = new AddressBook();
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
                    addressBook.addContacts(contact);

                    System.out.println("Contact added successfully.");
                    break;
                
                case 2:
                    // Display all contacts
                    System.out.println("Contacts in the Address Book:");
                    for (Contacts contactInBook : addressBook.getContacts()) {
                        System.out.println(contactInBook);
                    }
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

        sc.close(); 
    }
}
