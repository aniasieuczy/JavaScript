import java.util.ArrayList;


public class MobilePhone {
    private String myNumber;

    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
            return false;
        } else
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }


    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " , was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }


    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public int findPhoneNumber(String phoneNumber) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position > 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + " . " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }


}









//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        boolean quit = false;
//        int choice = 0;
//        printInstructions();
//
//        while(!quit) {
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    contacts.printListOfContacts();
//                    break;
//                case 2:
//                    addContact();
//                    break;
//                case 3:
//                    modifyContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    searchForContact();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//            }
//        }
//    }
//
//    public static void printInstructions() {
//        System.out.println("\n 0 - to print choice options");
//        System.out.println("\t 1 - to print list of contacts");
//        System.out.println("\t 2 - to add new contact to the contact list");
//        System.out.println("\t 3 - to update existing contact from the contact list");
//        System.out.println("\t 4 - to remove contact from the contact list");
//        System.out.println("\t 5 - to search for contact in the contact list");
//        System.out.println("\t 6 - to quit");
//    }
//
//    public static void addContact() {
//        System.out.print("Please enter the name: ");
//        contacts.addNewContact(scanner.nextLine());
//    }
//
//    public static void modifyContact () {
//        System.out.print("Enter contact name: ");
//        String contactNumber = scanner.nextLine();
//        System.out.println("Enter new contact information");
//        String newContactInformation = scanner.nextLine();
//        contacts.updateExistingContact(contactNumber, newContactInformation);
//    }
//
//    public static void removeContact (){
//        System.out.print("Enter contact information you want to remove: ");
//        String contactNumber = scanner.nextLine();
//        contacts.removeContacts(contactNumber);
//    }
//
//    public static void searchForContact () {
//        System.out.println("Enter contact name to search for");
//        String searchContact = scanner.nextLine();
//        if(contacts.onFile(searchContact)) {
//            System.out.println("Found " + searchContact + " in our contact list");
//        } else {
//            System.out.println(searchContact + " is not in the contact list");
//        }
//    }
//
//}
