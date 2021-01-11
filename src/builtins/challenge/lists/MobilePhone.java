package builtins.challenge.lists;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();


    public String getContacts() {
        String message = "";
        for (Contact contact: this.contacts) {
            message += contact.printContact() + "\n";
        }
        return message;
    }

    public void addContact(String name, String number) {
        Contact contact = new Contact(name, number);
        contacts.add(contact);
    }

    public void updateContact(String oldContactName, String newContactName, String newPhoneNumber) {
        Contact contact = getContactByName(oldContactName);
        if (contact != null) {
            if (!newContactName.equals("")) {
                contact.setName(newContactName);
            }
            if (!newPhoneNumber.equals("")) {
                contact.setNumber(newPhoneNumber);
            }
        } else {
            System.out.println("Could not find user with contact name: " + oldContactName);
        }

    }

    public void removeContact(String contactName) {
        Contact contact = getContactByName(contactName);

        if (contact != null) {
            this.contacts.remove(contact);
        } else {
            System.out.println("Could not find user with contact name: " + contactName);
        }
    }

    public boolean findContactByName(String contactName) {
        Contact contact = getContactByName(contactName);
        return contact != null;
    }

    private Contact getContactByName(String contactName) {
        for (int i=0; i < this.contacts.size(); i++) {
            Contact currContact = this.contacts.get(i);
            if (currContact.getName().equals(contactName)) {
                return currContact;
            }
        }

        return null;
    }



}
