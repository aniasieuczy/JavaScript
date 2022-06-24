import java.util.ArrayList;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact (String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }





//    public void addNewContact(String contact) {
//        this.contact.add(contact);
//    }
//
//    public void printListOfContacts() {
//        System.out.println("You have " + contact.size() + " contacts.");
//        for (int i = 0; i < contact.size(); i++) {
//            System.out.println((i + 1) + ". " + contact.get(i));
//        }
//    }
//
//    public void updateExistingContact(String currentContactInformation, String newContact) {
//        int position = findContact(currentContactInformation);
//        if (position >= 0) {
//            updateExistingContact(position, newContact);
//        }
//    }
//
//    private void updateExistingContact(int position, String newContact) {
//        contact.set(position, newContact);
//        System.out.println("Contact information " + (position + 1) + " has been updated");
//    }
//
//
//    public void removeContacts(String contact) {
//        int position = findContact(contact);
//        if (position >= 0) {
//            removeContacts(position);
//        }
//    }
//
//    private void removeContacts(int position) {
//        contact.remove(position);
//    }
//
//
//    private int findContact(String searchName) {
////        boolean exists = contacts.contains(searchName);
//        return Contact.indexOf(searchName);
//    }
//
//    public boolean onFile(String searchContact) {
//        int position = findContact(searchContact);
//        if (position >= 0) {
//            return true;
//        }
//        return false;
//    }

}
