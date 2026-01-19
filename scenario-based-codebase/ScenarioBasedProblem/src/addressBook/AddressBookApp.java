package addressBook;

public class AddressBookApp {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        // create contacts
        Contact c1 = new Contact(
                "Amit", "Sharma", "9876543210", "amit@gmail.com",
                new Address("Bhopal", "MP", "462001")
        );

        Contact c2 = new Contact(
                "Neha", "Verma", "9123456780", "neha@gmail.com",
                new Address("Indore", "MP", "452001")
        );

        Contact c3 = new Contact(
                "Rahul", "Singh", "9988776655", "rahul@gmail.com",
                new Address("Jaipur", "Rajasthan", "302001")
        );

        // add contacts
        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        // edit contact
        book.editContact("Amit", "Sharma", "9876649999", "amit_new@gmail.com");

        // search by city/state
        System.out.println("\nContacts from MP:");
        book.searchByCityOrState("MP");

        // display all sorted
        System.out.println("\nAll Contacts (Sorted):");
        book.displayAllSorted();

        // delete contact
        book.deleteContact("Neha", "Verma");

        System.out.println("\nAfter Deletion:");
        book.displayAllSorted();
    }
}
