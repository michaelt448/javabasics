package builtins.challenge.lists;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress:");
        System.out.println("\t 0 : To print choice options");
        System.out.println("\t 1 : To print list of contacts");
        System.out.println("\t 2 : To add an contact to the phone");
        System.out.println("\t 3 : To modify a contact in the phone");
        System.out.println("\t 4 : To remove a contact in the phone");
        System.out.println("\t 5 : To find a contact in the phone");
        System.out.println("\t 6 : To quit the application");
    }

    private static void printContacts() {
        String contacts = mobile.getContacts();
        System.out.println("The contacts are: \n" + contacts);
    }

    private static void addContact() {
        System.out.print("Enter the name of new contact: ");
        String name = scanner.nextLine();
        System.out.print("Enter the phone number of new contact: ");
        String phoneNumber = scanner.nextLine();
        mobile.addContact(name, phoneNumber);
    }

    private static void updateContact() {
        System.out.print("Enter the name of the contact to change: ");
        String contactName = scanner.nextLine();
        System.out.print("Enter updated name: ");
        String newContactName = scanner.nextLine();
        System.out.print("Enter new number: ");
        String newPhoneName = scanner.nextLine();
        mobile.updateContact(contactName, newContactName, newPhoneName);
    }

    private static void removeContact() {
        System.out.print("Enter the name of the contact to remove: ");
        String contactName = scanner.nextLine();
        mobile.removeContact(contactName);
    }

    private static void findContact() {
        System.out.print("Enter the name of the contact to find: ");
        String contactName = scanner.nextLine();

        boolean containsContact = mobile.findContactByName(contactName);
        if (containsContact) {
            System.out.println(contactName + " is in your contacts.");
        } else {
            System.out.println(contactName + " is not found.");
        }
    }
}
