package builtins.exercise.lists;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        int contactIndex = findContact(newContact.getName());
        if (contactIndex != -1 ) {
            return false;
        } else {
            this.myContacts.add(newContact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactIndex = findContact(oldContact.getName());
        if (contactIndex != -1 ) {
            this.myContacts.set(contactIndex, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact.getName());
        if (contactIndex != -1 ) {
            this.myContacts.remove(contactIndex);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(String contactName) {
        for (int i=0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(contactName)) return i;
        }

        return -1;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public Contact queryContact(String contactName) {
        int contactIndex = findContact(contactName);
        if (contactIndex != -1 ) {
            return this.myContacts.get(contactIndex);
        }
        return null;
    }

    public void printContacts() {
        String message = "Contact List: \n";

        for (int i=0; i < this.myContacts.size(); i++) {
            Contact currContact = this.myContacts.get(i);
            int currentNum = i +1;
            message += currentNum + ". " + currContact.getName() + " -> " + currContact.getPhoneNumber() + "\n";
        }
        System.out.println(message);
    }
}
