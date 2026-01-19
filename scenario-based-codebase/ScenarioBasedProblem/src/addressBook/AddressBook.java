package addressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // add new contact with duplicate check
    public void addContact(Contact c)
    {
        for(Contact con : contacts)
        {
            if(con.getFirstName().equalsIgnoreCase(c.getFirstName()) &&
               con.getLastName().equalsIgnoreCase(c.getLastName()))
            {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(c);
        System.out.println("Contact added successfully.");
    }

    // edit contact by name
    public void editContact(String firstName, String lastName,
                            String newPhone, String newEmail)
    {
        for(Contact c : contacts)
        {
            if(c.getFirstName().equalsIgnoreCase(firstName) &&
               c.getLastName().equalsIgnoreCase(lastName))
            {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // delete contact by name
    public void deleteContact(String firstName, String lastName)
    {
        contacts.removeIf(c ->
            c.getFirstName().equalsIgnoreCase(firstName) &&
            c.getLastName().equalsIgnoreCase(lastName)
        );
        System.out.println("Contact deleted if name matched.");
    }

    // search by city or state
    public void searchByCityOrState(String value)
    {
        for(Contact c : contacts)
        {
            if(c.getAddress().getCity().equalsIgnoreCase(value) ||
               c.getAddress().getState().equalsIgnoreCase(value))
            {
                c.display();
            }
        }
    }

    // display all contacts sorted alphabetically
    public void displayAllSorted()
    {
        Collections.sort(contacts, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2)
            {
                return c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
            }
        });

        for(Contact c : contacts)
        {
            c.display();
        }
    }
}
