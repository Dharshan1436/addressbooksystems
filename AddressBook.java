package addressbooksystems;

import java.util.ArrayList;

public class AddressBook {
	// Welcome message
	public static void welcomeMsg() {
		System.out.println("Welcome to the Address Book System!");
	}

	// creating contact List using ArrayList
	private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

	// Method to add contacts to the address book
	public void addContacts(Contacts contact) {
		contactsList.add(contact);

	}

	// Method to get the list of contacts
	public ArrayList<Contacts> getContacts() {
		return contactsList;
	}
}
